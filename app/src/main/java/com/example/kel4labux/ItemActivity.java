package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemActivity extends AppCompatActivity {
    private LinearLayout sidebar;

    private AdapterItem adapterItem;
    private RelativeLayout menus;
    private Animation slideDownAnimation, slideUpAnimation;

    private ImageButton homeBtn, profileBtn, logoutBtn;

    TextView gameName,gameDesc,gameType,gameStore,gameItems;
    ImageView gameIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        Intent intent = getIntent();
        Game game = intent.getParcelableExtra("game");

        sidebar = findViewById(R.id.sidebar);
        menus = findViewById(R.id.menus);
        slideDownAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        slideUpAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        gameIcon = findViewById(R.id.gameIcon);
        gameName = findViewById(R.id.gameName);
        gameDesc = findViewById(R.id.gameDesc);
        gameType = findViewById(R.id.gameType);
        gameStore = findViewById(R.id.gameStore);
        gameItems = findViewById(R.id.gameItems);
        homeBtn = (ImageButton) findViewById(R.id.homeBtn);
        profileBtn = findViewById(R.id.profileBtn);
        logoutBtn = findViewById(R.id.logoutBtn);

        gameIcon.setImageResource(game.getIcon());
        gameName.setText(game.getName());
        gameDesc.setText(game.getDescription());
        gameType.setText(game.getGameType());

        String totalDownloads = null;
        if(game.getTotalDownloads() != 0)
        {
            totalDownloads = game.getTotalDownloads() + " Stores";
        }else {
            totalDownloads = "0 Stores";
        }
        gameStore.setText(totalDownloads);

        String totalItems = null;
        if(game.getTotalItems() != 0)
        {
            totalItems = game.getTotalItems() + " Items";
        }else {
            totalItems = "0 Items";
        }
        gameItems.setText(totalItems);

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

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycleView);


        List<Item> items = null;
        if(game.getName().equals("Mobile Legends"))
        {
            items = DataProvider.getItemListMobileLegends();
        }else if(game.getName().equals("Call Of Duty")) {
            items = DataProvider.getItemListCOD();
        }else if(game.getName().equals("Clash of Clan")) {
            items = DataProvider.getItemListCOC();
        }else if(game.getName().equals("Free Fire")) {
            items = DataProvider.getItemListFreeFire();
        }else if(game.getName().equals("PUBG")) {
            items = DataProvider.getItemListPUBG();
        }else if(game.getName().equals("Valorant")) {
            items = DataProvider.getItemListValorant();
        }else if(game.getName().equals("Counter Strike")) {
            items = DataProvider.getItemListCS();
        }else if(game.getName().equals("DreadOut")) {
            items = DataProvider.getItemListDreadOut();
        }else if(game.getName().equals("Fortnite")) {
            items = DataProvider.getItemListFortnite();
        }else if(game.getName().equals("Dota 2")) {
            items = DataProvider.getItemListDota();
        }else if(game.getName().equals("GTA")) {
            items = DataProvider.getItemListGTA();
        }else if(game.getName().equals("FIFA 22")) {
            items = DataProvider.getItemListFIFA();
        }else if(game.getName().equals("Hogwarts Legacy")) {
            items = DataProvider.getItemListHogwarts();
        }else if(game.getName().equals("Overcooked")) {
            items = DataProvider.getItemListOvercooked();
        }else if(game.getName().equals("Resident Evil")) {
            items = DataProvider.getItemListResident();
        }else {
            items = new ArrayList<>();
        }

        adapterItem = new AdapterItem(getApplicationContext(), items);
        adapterItem.setItemClickListener(this::onItemClick);


        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(adapterItem);
    }

    public void onItemClick(Item item) {
        Intent intent = new Intent(ItemActivity.this, DetailItem.class);
        intent.putExtra("item", item);
        startActivity(intent);
    }
}