package com.example.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.test5.ColorModel;
import com.example.test5.R;

import java.util.ArrayList;
import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ViewHolder> {

    List<ColorModel> postModels = new ArrayList<>();
    Context context;
//    clicks listner;
//ActivityMainBinding

    public ColorAdapter(Context context) {

        this.context = context;
    }

    public ColorAdapter(List<ColorModel> postModels, Context context) {
        this.postModels = postModels;
        this.context = context;
    }

//    public ColorAdapter(List<ColorModel> postModels, Context context, clicks listner) {
//        this.postModels = postModels;
//        this.context = context;
//        this.listner = listner;
//    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_colors, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.name.setText(postModels.get(position).getNamecolor());
        holder.viewimg.setBackgroundResource(((postModels.get(position).getImg())));

        holder.viewimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
//                    if (listner != null) {
//                        listner.onclick(position);
//                    } else
                        {
                        Toast.makeText(context, "No Interface No", Toast.LENGTH_SHORT).show();
                    }
                } catch (ClassCastException exception) {
                    // do something
                    Toast.makeText(context, "" + exception.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return postModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView image, name;
        View viewimg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.color_name);
            viewimg = itemView.findViewById(R.id.view_color);
        }

    }
}
