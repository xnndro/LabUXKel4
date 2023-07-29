package com.example.kel4labux;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailItem extends AppCompatActivity {
    private Item item;
    TextView itemName, itemPrice, storeName, display, money;
    ImageView itemImage;
    ImageButton increment, decrement;
    EditText cs_email, cs_username;
    Button btn_co;
    int count=0;
    int kali=0;
    Dialog dialog;
    TextView temp,totalpay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);
    if(getIntent().hasExtra("item")){
            item = getIntent().getParcelableExtra("item");
            System.out.printf("Game Name: " + item.getGameName());
        }

        itemName = findViewById(R.id.itemName);
        itemPrice = findViewById(R.id.tv_itemPrice);
        storeName = findViewById(R.id.tv_storeName);
        itemImage = findViewById(R.id.tv_itemImage);
        int imageResource = item.getImage();

        increment=findViewById(R.id.increment_btn);
        decrement=findViewById(R.id.decrement_btn);
        display=findViewById(R.id.qtydisplay);
        cs_email=findViewById(R.id.dl_email);
        cs_username=findViewById(R.id.dl_username);
        totalpay=findViewById(R.id.totalpayment);
        money=findViewById(R.id.moneycash);

        itemName.setText(item.getGameName());
        itemPrice.setText(item.getPrice());
        storeName.setText(item.getStoreName());
//        itemImage.setImageResource(imageResource);

        String priceText = itemPrice.getText().toString();
        String moneyText = money.getText().toString();
        int priceInt,moneyInt;
        priceInt = Integer.parseInt(priceText);
        moneyInt = Integer.parseInt(moneyText);

        increment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count++;
                display.setText(""+count);
                kali=priceInt*count;
                totalpay.setText(""+kali);
            }
        });
        decrement.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (count<=0) count=0;
                else
                    count--;
                display.setText(""+count);
                kali=priceInt*count;
                totalpay.setText(""+kali);
            }
        });
        btn_co = findViewById(R.id.btnCheckout);
        dialog = new Dialog(this);

        btn_co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = cs_email.getText().toString();
                String username = cs_username.getText().toString();

                if (email.isEmpty()) {
                    openError("E-mail must be filled!!");
                } else if (username.isEmpty()) {
                    openError("Username must be filled!!");
                } else if (count<=0) {
                    openError("Quantity must be more than 0!!");
                } else if (kali>moneyInt) {
                    openError("Your money is not enough!!");
                } else {

                    ArrayList<Transactions> detailList = new ArrayList<>();

                    detailList.add(new Transactions(item.getGameName(), String.valueOf(count), item.getName(), item.getImage(), item.getPrice(), String.valueOf(kali)));
                    Transactions.getInstance().setDataList(detailList);
                    openSuccess();
                }
            }
        });
    }
    public void openError(String text){
        dialog.setContentView(R.layout.dialog_error);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button btnTry = dialog.findViewById(R.id.btnTry);
        temp = dialog.findViewById(R.id.errormsg);
        temp.setText(text);
        btnTry.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void openSuccess(){
        dialog.setContentView(R.layout.dialog_success);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button btnOK = dialog.findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dialog.dismiss();
            }
        });
        dialog.show();
    }

}