package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class HomeActivity extends AppCompatActivity {

    TextView userEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        String email = getIntent().getStringExtra("email");
        
        // set userEmail (TextView) with email (String from MainActivity) -> kali aja dipake ini caranya
        // userEmail = findViewById(R.id.userEmail);
        // userEmail.setText(email);
    }
}