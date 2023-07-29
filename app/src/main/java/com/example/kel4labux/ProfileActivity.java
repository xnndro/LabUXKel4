package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    TextView userName, emailProfile, accBal;

    EditText topUpInput;
    TextView errorSetAmount;
    ImageButton topUpBtn;

    RecyclerView transactionRecyclerView;
    LinearLayoutManager linearLayoutManager;
    AdapterTransaction adapterTransaction;
    ArrayList<Transactions> receivedTransaction = Transactions.getInstance().getDataList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

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
                validateTopUp(Integer.parseInt(topUpInput.getText().toString()));
            }
        });


    }

    private void validateTopUp(int topUp){

        if (TextUtils.isEmpty(String.valueOf(topUp))){
            showError("Please Set Amount to Add Coins");

        }else if(topUp<=0){
            showError("Invalid Amount");
        }else{
            hideError();
            int updatedMoney = User.getInstance().getAccBal() + topUp;
            User.getInstance().setAccBal(updatedMoney);
            accBal.setText(String.valueOf(updatedMoney));

        }

    }

    private void hideError() {
        errorSetAmount.setVisibility(android.view.View.GONE);
    }

    private void showError(String errorMessage) {
        errorSetAmount.setText(errorMessage);
        errorSetAmount.setVisibility(android.view.View.VISIBLE);
    }
}