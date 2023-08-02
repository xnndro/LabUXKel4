package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    TextView userName, emailProfile, accBal;
    private Animation slideDownAnimation, slideUpAnimation;

    EditText topUpInput;
    TextView errorSetAmount;
    ImageButton topUpBtn, homeBtn, profileBtn, logoutBtn;
    LinearLayout sidebar;
    RelativeLayout menus;

    RecyclerView transactionRecyclerView;
    LinearLayoutManager linearLayoutManager;
    AdapterTransaction adapterTransaction;
    ArrayList<Transactions> receivedTransaction = Transactions.getInstance().getDataList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        slideDownAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        slideUpAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);

        homeBtn = (ImageButton) findViewById(R.id.homeBtn);
        profileBtn = findViewById(R.id.profileBtn);
        logoutBtn = findViewById(R.id.logoutBtn);
        sidebar = findViewById(R.id.sidebar);
        menus = findViewById(R.id.menus);

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
                Intent intent = new Intent(ProfileActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        transactionRecyclerView = findViewById(R.id.transactionrecycler);

        transactionRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        transactionRecyclerView.setAdapter(new AdapterTransaction(getApplicationContext(), receivedTransaction));

        String email = User.getInstance().getEmail();
        int index = email.indexOf("@");
        String username = email.substring(0, index);

        userName = findViewById(R.id.userName);
        userName.setText(username);

        emailProfile = findViewById(R.id.emailProfile);
        emailProfile.setText(User.getInstance().getEmail());

        accBal = findViewById(R.id.accBalance);
        accBal.setText(String.valueOf(User.getInstance().getAccBal()));

        topUpInput = findViewById(R.id.topUpInput);
        errorSetAmount = findViewById(R.id.errorSetAmount);
        topUpBtn = findViewById(R.id.topUpBtn);

        topUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateTopUp(topUpInput.getText().toString());
            }
        });


    }

    private void validateTopUp(String topUpText) {
        if (TextUtils.isEmpty(topUpText)) {
            showError("Please Set Amount to Add Coins");
        } else {
            try {
                int topUp = Integer.parseInt(topUpText);

                if (topUp <= 0) {
                    showError("Invalid Amount");
                } else {
                    hideError();
                    errorSetAmount.setVisibility(View.INVISIBLE);
                    int updatedMoney = User.getInstance().getAccBal() + topUp;
                    User.getInstance().setAccBal(updatedMoney);
                    accBal.setText(String.valueOf(updatedMoney));
                }
            } catch (NumberFormatException e) {
                showError("Invalid Amount");
            }
        }
    }

    private void hideError() {
        errorSetAmount.setVisibility(View.GONE);
    }

    private void showError(String errorMessage) {
        errorSetAmount.setText(errorMessage);
        errorSetAmount.setVisibility(View.VISIBLE);
    }

}