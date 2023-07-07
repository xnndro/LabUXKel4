package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private List<Game> games;
    private RecyclerView recyclerViewGames;
    private GameAdapter gameAdapter;

    TextView userEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        String email = getIntent().getStringExtra("email");
        
        // set userEmail (TextView) with email (String from MainActivity) -> kali aja dipake ini caranya
        // userEmail = findViewById(R.id.userEmail);
        // userEmail.setText(email);
        recyclerViewGames = findViewById(R.id.recyclerViewGames);
        recyclerViewGames.setLayoutManager(new GridLayoutManager(this, 2));
        games = DataProvider.getGames();
        gameAdapter = new GameAdapter(games);
        gameAdapter.setListener(this::onItemClick);
        recyclerViewGames.setAdapter(gameAdapter);
    }

    public void onItemClick(Game game) {
        Intent intent = new Intent(this, ItemActivity.class);
        System.out.println(game.getName());
        intent.putExtra("game", game);
        startActivity(intent);
    }

}