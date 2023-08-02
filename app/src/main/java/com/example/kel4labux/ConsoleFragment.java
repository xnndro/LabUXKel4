package com.example.kel4labux;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kel4labux.DataProvider;
import com.example.kel4labux.Game;
import com.example.kel4labux.GameAdapter;
import com.example.kel4labux.ItemActivity;
import com.example.kel4labux.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ConsoleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ConsoleFragment extends Fragment implements GameAdapter.ItemClickListener {

    View v;
    private List<Game> games;
    private RecyclerView recyclerViewGames;
    private GameAdapter gameAdapter;

    public ConsoleFragment() {

    }


    public static ConsoleFragment newInstance() {
        ConsoleFragment fragment = new ConsoleFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_console, container, false);
        recyclerViewGames = v.findViewById(R.id.console_recyclerViewGames);
        recyclerViewGames.setLayoutManager(new GridLayoutManager(getContext(), 2));
        games = DataProvider.getGamesConsole();

        // Pass 'this' as the ItemClickListener to GameAdapter constructor
        gameAdapter = new GameAdapter(games, this);

        recyclerViewGames.setAdapter(gameAdapter);
        return v;
    }

    @Override
    public void onItemClick(Game game) {
        Intent intent = new Intent(getContext(), ItemActivity.class);
        System.out.println(game.getName());
        intent.putExtra("game", game);
        startActivity(intent);
    }
}
