package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

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


    }
}