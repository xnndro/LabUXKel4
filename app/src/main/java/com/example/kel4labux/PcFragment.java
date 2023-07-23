package com.example.kel4labux;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PcFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PcFragment extends Fragment {

    View v;
    private List<Game> games;
    private RecyclerView recyclerViewGames;
    private GameAdapter gameAdapter;

    public PcFragment() {
        // Required empty public constructor
    }

    public static PcFragment newInstance() {
        PcFragment fragment = new PcFragment();
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
        v = inflater.inflate(R.layout.fragment_pc, container, false);
        recyclerViewGames = (RecyclerView) v.findViewById(R.id.pc_recyclerViewGames);
        recyclerViewGames.setLayoutManager(new GridLayoutManager(getContext(), 2));
        games = DataProvider.getGamesPc();
        gameAdapter = new GameAdapter(games);
        gameAdapter.setListener(this::onItemClick);
        recyclerViewGames.setAdapter(gameAdapter);
        return v;
    }

    public void onItemClick(Game game) {
        Intent intent = new Intent(getContext(), ItemActivity.class);
        System.out.println(game.getName());
        intent.putExtra("game", game);
        startActivity(intent);
    }
}