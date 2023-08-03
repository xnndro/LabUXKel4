package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.userEmail);
        etPassword = findViewById(R.id.userPassword);
        btnLogin = findViewById(R.id.submitButton);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                if (email.isEmpty()) {
                    etUsername.setError("Email must be filled");
                }  else if (!email.contains("@")) {
                    etUsername.setError("Email must contain '@'");
                } else if (!email.contains(".com")) {
                    etUsername.setError("Email must end with '.com'");
                } else if (password.isEmpty()) {
                    etPassword.setError("Password must be filled");
                }else if (password.length() < 8) {
                    etPassword.setError("Password's length must be more than 8");
                } else {

                    Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
//                    intent.putExtra("email", email);
                    User.getInstance().setEmail(email);
                    startActivity(intent);


                }
            }
        });
    }
}