package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private List<Game> games;
    private RecyclerView recyclerViewGames;
    private GameAdapter gameAdapter;

    private LinearLayout mobileTab, pcTab, consoleTab;
    //selected tab number
    private int selectedTabNumber = 1; //default view 1 yaitu mobile

    TextView userEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mobileTab = findViewById(R.id.mobileTab);
        pcTab = findViewById(R.id.pcTab);
        consoleTab = findViewById(R.id.consoleTab);

        //memilih fragment pertama jadi default
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmenTab, MobileFragment.class, null).commit();


        mobileTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectTab(1);
            }
        });

        pcTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectTab(2);
            }
        });

        consoleTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectTab(3);
            }
        });


//        String email = getIntent().getStringExtra("email");
        String email = User.getInstance().getEmail();
        int index = email.indexOf("@");
        String username = email.substring(0, index);
        
//         set userEmail (TextView) with email (String from MainActivity)
        userEmail = findViewById(R.id.userEmail);
        userEmail.setText(username + "!");

    }

    private void selectTab(int tabnumber){
        LinearLayout selectedLinearLayout;

        LinearLayout nonSelectedLinearLayout1;
        LinearLayout nonSelectedLinearLayout2;

        if(tabnumber==1){
            selectedLinearLayout = mobileTab;
            nonSelectedLinearLayout1 = pcTab;
            nonSelectedLinearLayout2 = consoleTab;
            selectedLinearLayout.setBackgroundResource(R.drawable.currtab1);
            nonSelectedLinearLayout1.setBackgroundResource(R.drawable.tabmenu2);
            nonSelectedLinearLayout2.setBackgroundResource(R.drawable.tabmenu3);
            //setting fragment to the fragment container view
            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmenTab,MobileFragment.class,null).commit();

        }

        else if (tabnumber ==2 ){
            selectedLinearLayout = pcTab;
            nonSelectedLinearLayout1 = mobileTab;
            nonSelectedLinearLayout2 = consoleTab;
            selectedLinearLayout.setBackgroundResource(R.drawable.currtab2);
            nonSelectedLinearLayout1.setBackgroundResource(R.drawable.tabmenu1);
            nonSelectedLinearLayout2.setBackgroundResource(R.drawable.tabmenu3);

            //setting fragment to the fragment container view
            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmenTab,PcFragment.class,null).commit();

        }

        else{
            selectedLinearLayout = consoleTab;
            nonSelectedLinearLayout1 = mobileTab;
            nonSelectedLinearLayout2 = pcTab;

            selectedLinearLayout.setBackgroundResource(R.drawable.currtab3);
            nonSelectedLinearLayout1.setBackgroundResource(R.drawable.tabmenu1);
            nonSelectedLinearLayout2.setBackgroundResource(R.drawable.tabmenu2);

            //setting fragment to the fragment container view
            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmenTab,ConsoleFragment.class,null).commit();

        }

    }






}

