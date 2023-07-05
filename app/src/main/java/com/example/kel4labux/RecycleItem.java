package com.example.kel4labux;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleItem extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView itemName, itemPrice, storeName;
    public RecycleItem(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.itemImage);
        itemName = itemView.findViewById(R.id.itemName);
        itemPrice = itemView.findViewById(R.id.itemPrice);
        storeName = itemView.findViewById(R.id.storeName);
    }
}
