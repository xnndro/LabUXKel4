package com.example.kel4labux;

import java.util.ArrayList;
import java.util.List;

public class Transactions {

    private String gameName,quantity, itemName, itemPrice, total;
    private int icon;

    private static Transactions instance;
    private ArrayList<Transactions> dataList = new ArrayList<>();

    private Transactions() {

    }

    public static Transactions getInstance() {
        if (instance == null) {
            instance = new Transactions();
        }
        return instance;
    }

    public ArrayList<Transactions> getDataList() {
        return dataList;
    }

    public void setDataList(ArrayList<Transactions> newDataList) {
        dataList = newDataList;
    }

    public Transactions(String gameName, String quantity, String itemName, String itemPrice, String total, int icon) {
        this.gameName = gameName;
        this.quantity = quantity;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.total = total;
        this.icon = icon;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
