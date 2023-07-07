package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Hero yanto","Rp. 100.000","Yanto sukses Makmur", R.drawable.mb1));
        items.add(new Item("Hero tori","Rp. 100.000","Yanto sukses Makmur", R.drawable.mb2));
        items.add(new Item("Hero deep","Rp. 100.000","Yanto sukses Makmur", R.drawable.mb3));
        items.add(new Item("Hero budi","Rp. 100.000","Yanto sukses Makmur", R.drawable.mb4));
        items.add(new Item("Hero dipdip2","Rp. 100.000","Yanto sukses Makmur", R.drawable.mb5));

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(new AdapterItem(getApplicationContext(),items));
    }
}