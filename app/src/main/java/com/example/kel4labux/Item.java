package com.example.kel4labux;

public class Item {


    String name,price, storeName ;
    int image;
    public Item(String name, String price, String storeName, int image) {
        this.name = name;
        this.price = price;
        this.storeName = storeName;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
