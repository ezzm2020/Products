package com.example.test5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.Adapter.AdapterColors;
import com.example.Adapter.AdapterStorage;
import com.example.Adapter.ColorAdapter;
import com.example.Adapter.productAdapter;
import com.example.test5.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    Integer[] imageId = {R.drawable.img_phone, R.drawable.img_phone, R.drawable.img_phone, R.drawable.ic_launcher_background};
    int currentPage = 0;
    ViewPager viewPager;
    Timer timer;
    TabLayout tabs;
    final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 3000;
    RecyclerView reccolor, recylcerView_storage;
    TabLayout recimg;
    ColorAdapter adapter;
    List<ColorModel> colorModels = new ArrayList<>();
    List<ColorModel> imageModels = new ArrayList<>();
    RecyclerView recstoreies;
    com.example.Adapter.productAdapter productAdapter;
    ProductDataManager manager;
    ArrayList<Variant> variantArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


         ActivityMainBinding binding;
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

         recstoreies = findViewById(R.id.recycler_stores);
        manager = new ProductDataManager();

        recylcerView_storage = findViewById(R.id.recylcerView_storage);
        final ArrayList<Attribute> attributes = manager.getProduct().getAttributes();
        variantArrayList = manager.getProduct().getVariants();

        viewPager = findViewById(R.id.view_pager_adds);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tabs = findViewById(R.id.tabs_adds);


        tabs.setupWithViewPager(viewPager, true);
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == imageId.length - 1) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };


        timer = new Timer(); // This will create a new Thread
        timer.schedule(new TimerTask() { // task to be scheduled
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);


        reccolor = findViewById(R.id.recylcerView_colors);
        final LinearLayoutManager manager1 = new LinearLayoutManager(getApplicationContext());
        manager1.setOrientation(RecyclerView.HORIZONTAL);
        reccolor.setLayoutManager(manager1);

        LinearLayoutManager manager2 = new LinearLayoutManager(getApplicationContext());
        manager2.setOrientation(RecyclerView.HORIZONTAL);
        recylcerView_storage.setLayoutManager(manager2);

        final List<String> storageList = new ArrayList<>();
        List<StorageModel> stmodleList = new ArrayList<>();

        storageList.add("8GB");
        storageList.add("16GB");
        storageList.add("32GB");
        storageList.add("64GB");

        stmodleList.add(new StorageModel("8GB"));
        stmodleList.add(new StorageModel("16GB"));
        stmodleList.add(new StorageModel("32GB"));
        stmodleList.add(new StorageModel("64GB"));

//        RecyclerView recyclerView = binding.recylcerViewStorage;

        recylcerView_storage.setAdapter(new AdapterStorage(stmodleList));
        recimg = findViewById(R.id.tabs_adds2);

        imageModels.add(new ColorModel(R.drawable.d));
        imageModels.add(new ColorModel(R.drawable.de));
        imageModels.add(new ColorModel(R.drawable.lab));
        imageModels.add(new ColorModel(R.drawable.images));

        colorModels.add(new ColorModel(getResources().getColor(R.color.gray), "gray"));
        colorModels.add(new ColorModel(getResources().getColor(R.color.black), "black"));
        colorModels.add(new ColorModel(getResources().getColor(R.color.blue), "blue"));


        reccolor.setAdapter(new AdapterColors(colorModels, this, new clicks() {
            @Override
            public void onclick(int positon) {
                String name = manager.getProduct().getVariants().get(positon)
                        .getValueAttributes().get(2).getValue();

                for (int i = 0; i < storageList.size(); i++) {
                    if (name.equals(storageList.get(i))) {
                        enableStorage(i);
                    } else {

                        disableStorage(i);
                    }
                }


                if (positon == 0) {
                    enableColor(0);
                    disableColor(1);
                    disableColor(2);

                } else if (positon == 1) {
                    disableColor(0);
                    disableColor(2);
                    enableColor(1);
                } else if (positon == 2) {
                    disableColor(1);
                    disableColor(0);

                    enableColor(2);
                }
            }

        }));

//
        final Variant variant = new Variant();
        ArrayList<ValueAttribute> valueAttributes3 = new ArrayList<>();
        recstoreies.setLayoutManager(new GridLayoutManager(this, 1));
        productAdapter = new productAdapter(imageModels, getBaseContext());
        recstoreies.setAdapter(productAdapter);


        setUpCustomTabs(recimg);

    }

    private void enableColor(int positionOfColor) {
        try {
            View view = reccolor.findViewHolderForPosition(positionOfColor).itemView;

            FrameLayout frameLayout = view.findViewById(R.id.frame_select);
            frameLayout.setVisibility(View.VISIBLE);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    private void disableColor(int positionOfColor) {
        try {
            View view = reccolor.findViewHolderForPosition(positionOfColor).itemView;
            FrameLayout frameLayout = view.findViewById(R.id.frame_select);
            frameLayout.setVisibility(View.GONE);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    private void enableStorage(int positionOfStorage) {
        try {
            View view = recylcerView_storage.findViewHolderForPosition(positionOfStorage).itemView;
            view.setClickable(true);
            view.setAlpha(1f);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    private void disableStorage(int positionOfStorage) {
        try {
            View view = recylcerView_storage.findViewHolderForPosition(positionOfStorage).itemView;
            view.setClickable(false);
            view.setAlpha(.2f);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    private void setUpCustomTabs(TabLayout tabs) {
        tabs.setupWithViewPager(viewPager);
        for (int i = 0; i < tabs.getTabCount(); i++) {
            tabs.getTabAt(i).setCustomView(R.layout.item_images);
            ImageView viewimg = tabs.getTabAt(i).getCustomView().findViewById(R.id.imgcolorphone);
            viewimg.setImageResource(imageId[i]);

        }
    }

    public boolean search(String values, int position) {

        int searchListLength = variantArrayList.size();
        for (int i = 0; i < searchListLength; i++) {
            List<ValueAttribute> list = manager.getProduct().getVariants().get(i).getValueAttributes();
            for (int j = 0; j < list.size(); j++) {

                if (variantArrayList.get(i).getValueAttributes().get(j).getValue().contains(values)) {

                    enableColor(position);
                    disableStorage(position);
                    return true;

                }


            }
        }
        return true;
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int pos) {
            switch (pos) {
                case 0:
                    return FragmentViewPager.newInstance(imageId[0]);
                case 1:
                    return FragmentViewPager.newInstance(imageId[1]);
                case 2:
                    return FragmentViewPager.newInstance(imageId[2]);

                default:
                    return FragmentViewPager.newInstance(imageId[0]);

            }

        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
