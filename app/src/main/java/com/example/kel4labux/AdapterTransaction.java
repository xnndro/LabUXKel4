package com.example.kel4labux;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterTransaction extends RecyclerView.Adapter<AdapterTransaction.HolderData> {

    List<Transactions> listTransaction;
    LayoutInflater inflater;

    public AdapterTransaction(Context context, List<Transactions> listTransaction) {
        this.listTransaction = listTransaction;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.activity_profile, parent, false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        Transactions transaction = listTransaction.get(position);

        holder.imageTransaction.setImageResource(transaction.getIcon());
        holder.totalGame.setText("-" + transaction.getTotal());
        holder.itemNameQuantity.setText(transaction.getItemName() + " - " + transaction.getQuantity());
        holder.gameNameItemPrice.setText(transaction.getGameName() + " - " + transaction.getItemPrice());

    }

    @Override
    public int getItemCount() {
        return listTransaction.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{

        ImageView imageTransaction;
        TextView gameNameItemPrice;
        TextView itemNameQuantity;
        TextView totalGame;

        public HolderData(@NonNull View itemView) {
            super(itemView);

            imageTransaction = itemView.findViewById(R.id.imageTransaction);
            gameNameItemPrice = itemView.findViewById(R.id.gameNameItemPrice);
            itemNameQuantity = itemView.findViewById(R.id.itemNameQuantity);
            totalGame = itemView.findViewById(R.id.totalGame);

        }
    }
}
