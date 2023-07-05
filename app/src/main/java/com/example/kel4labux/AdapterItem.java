package com.example.kel4labux;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class AdapterItem extends RecyclerView.Adapter<RecycleItem> {
    Context context;
    List<Item> items;
    public AdapterItem(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecycleItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecycleItem(LayoutInflater.from(context).inflate(R.layout.activity_item_page,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleItem holder, int position) {
        holder.itemName.setText(items.get(position).getName());
        holder.itemPrice.setText(items.get(position).getPrice());
        holder.storeName.setText(items.get(position).getStoreName());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
