package com.example.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test5.ColorModel;
import com.example.test5.R;
import com.example.test5.clicks;

import java.util.List;

public class AdapterColors extends RecyclerView.Adapter<AdapterColors.Viewholder> {

    private List<ColorModel> list;
    Context context;
    clicks listner;

    public AdapterColors(List<ColorModel> list, Context context, clicks listner) {
        this.list = list;
        this.context = context;
        this.listner = listner;
    }

    public AdapterColors(List<ColorModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_colors, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, final int position) {

        holder.viewColor.setBackgroundColor(list.get(position).getImg());
        holder.colorName.setText(list.get(position).getNamecolor());
        holder.frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listner.onclick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Viewholder extends RecyclerView.ViewHolder {

        View viewColor;
        TextView colorName;
        FrameLayout frameLayout;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            viewColor = itemView.findViewById(R.id.view_color);
            colorName = itemView.findViewById(R.id.color_name);
            frameLayout=itemView.findViewById(R.id.fml);
        }
    }
}
