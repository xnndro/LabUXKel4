package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailItem extends AppCompatActivity {
    private Item item;
    TextView itemName, itemPrice, storeName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);

        if(getIntent().hasExtra("item")){
            item = getIntent().getParcelableExtra("item");
        }

        itemName = findViewById(R.id.tv_itemName);
        itemPrice = findViewById(R.id.tv_itemPrice);
        storeName = findViewById(R.id.tv_storeName);

        itemName.setText(item.getName());
        itemPrice.setText(item.getPrice());
        storeName.setText(item.getStoreName());
    }
}