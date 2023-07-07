package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class ItemActivity extends AppCompatActivity {
    private LinearLayout sidebar;

    private AdapterItem adapterItem;
    private RelativeLayout menus;
    private Animation slideDownAnimation, slideUpAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        sidebar = findViewById(R.id.sidebar);
        menus = findViewById(R.id.menus);
        slideDownAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        slideUpAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);

        menus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sidebar.getVisibility() == View.VISIBLE) {
                    sidebar.startAnimation(slideUpAnimation);
                    sidebar.setVisibility(View.INVISIBLE);
                } else {
                    sidebar.setVisibility(View.VISIBLE);
                    sidebar.startAnimation(slideDownAnimation);
                }
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycleView);




        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Hero yanto","Rp. 100.000","Yanto sukses Makmur", R.drawable.mb1));
        items.add(new Item("Hero tori","Rp. 100.000","Yanto sukses Makmur", R.drawable.mb2));
        items.add(new Item("Hero deep","Rp. 100.000","Yanto sukses Makmur", R.drawable.mb3));
        items.add(new Item("Hero budi","Rp. 100.000","Yanto sukses Makmur", R.drawable.mb4));
        items.add(new Item("Hero dipdip2","Rp. 100.000","Yanto sukses Makmur", R.drawable.mb5));

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapterItem = new AdapterItem(getApplicationContext(), items);
        adapterItem.setItemClickListener(this::onItemClick);


        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(adapterItem);
    }
    
    public void onItemClick(Item item) {
        // Menghandle klik pada item RecyclerView
        // Navigasi ke halaman detail dengan mengirim data item
        Intent intent = new Intent(ItemActivity.this, DetailItem.class);
        intent.putExtra("item", item);
        startActivity(intent);
    }
}