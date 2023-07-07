package com.example.kel4labux;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {
    private List<Game> games;
    private ItemClickListener itemClickListener;

    public GameAdapter(List<Game> games) {
        this.games = games;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_home_repeater, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        Game game = games.get(position);

        holder.imageViewGameIcon.setImageResource(game.getIcon());
        holder.textViewGameTitle.setText(game.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itemClickListener != null) {
                    itemClickListener.onItemClick(game);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public void setListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public static class GameViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewGameIcon;
        TextView textViewGameTitle;

        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewGameIcon = itemView.findViewById(R.id.imageViewGameIcon);
            textViewGameTitle = itemView.findViewById(R.id.textViewGameTitle);
        }
    }

    public interface ItemClickListener {
        void onItemClick(Game game);
    }
}
