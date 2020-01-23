package com.example.Adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test5.R;
import com.example.test5.StorageModel;

import java.util.ArrayList;
import java.util.List;

public class AdapterStorage extends RecyclerView.Adapter<AdapterStorage.Viewholder> {

    private List<String> list;
 List<StorageModel>models=new ArrayList<>();


    public AdapterStorage(List<StorageModel> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
//        ViewDataBinding binding= DataBindingUtil.inflate(inflater, R.layout.item_storage,parent,false);
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_storage, null);
        return new AdapterStorage.Viewholder(v);
//        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
//        holder.binding.bind(models.get(position).getNamecolor());

//        holder.bind(models.get(position).getSize());
        holder.name.setText(models.get(position).getSize());
        Log.v("__","modes"+models.get(position).getSize());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    class Viewholder extends RecyclerView.ViewHolder {

        ViewDataBinding binding;
        public Viewholder(ViewDataBinding databinding) {
            super(databinding.getRoot());
            this.binding=databinding;
        }
        public void bind(Object obj) {
            binding.setVariable(com.example.test5.BR.model, obj);
            binding.executePendingBindings();
        }

        TextView  name;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_storage);

        }


    }
}
