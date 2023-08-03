package com.example.kel4labux;

public class TransactionDetails {
    private String gameName;
    private String quantity;
    private String itemName;
    private String itemPrice;
    private String totalPrice;
    private int itemImage;

    public TransactionDetails(String gameName, String quantity, String itemName, String itemPrice, String totalPrice, int itemImage) {
        this.gameName = gameName;
        this.quantity = quantity;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.totalPrice = totalPrice;
        this.itemImage = itemImage;
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

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

}
