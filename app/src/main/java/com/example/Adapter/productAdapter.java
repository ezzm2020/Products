package com.example.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test5.ColorModel;
import com.example.test5.R;

import java.util.ArrayList;
import java.util.List;

public class productAdapter  extends RecyclerView.Adapter<productAdapter.ViewHolder> {

    List<ColorModel> postModels = new ArrayList<>();
    Context context;

    public productAdapter(List<ColorModel> postModels, Context context) {
        this.postModels = postModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stores, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.viewimg.setBackgroundResource(((postModels.get(position).getImg())));
    }

    @Override
    public int getItemCount() {
        return postModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View viewimg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            viewimg = itemView.findViewById(R.id.iv_icon);
        }

    }
}
