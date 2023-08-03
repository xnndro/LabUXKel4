package com.example.kel4labux;

import android.content.Context;
import android.content.Intent;
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
    private static ItemClickListener itemClickListener;

    public AdapterTransaction(Context context, List<Transactions> listTransaction,ItemClickListener itemClickListener) {
        this.listTransaction = listTransaction;
        this.inflater = LayoutInflater.from(context);
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.transaction_recycler, parent, false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        Transactions transaction = listTransaction.get(position);

        holder.imageTransaction.setImageResource(transaction.getIcon());
        holder.totalGame.setText("-" + transaction.getTotal());
        holder.itemNameQuantity.setText(transaction.getItemName() + " - " + transaction.getQuantity()+ " pcs");
        holder.gameNameItemPrice.setText(transaction.getGameName());
    }

    @Override
    public int getItemCount() {
        return listTransaction.size();
    }

    public static class HolderData extends RecyclerView.ViewHolder implements View.OnClickListener{

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

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            // Call the onItemClick method of the itemClickListener when an item is clicked
            itemClickListener.onItemClick(getAdapterPosition());
        }
    }

    public interface ItemClickListener {
        void onItemClick(int position);
    }
}
