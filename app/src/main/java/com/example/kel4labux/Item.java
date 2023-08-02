package com.example.kel4labux;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Item implements Parcelable {

    String name;
    String price;
    String storeName;
    String description;

    String gameName;
    int image;

    public Item(String name, String price, String storeName, String description, int image, String gameName) {
        this.name = name;
        this.price = price;
        this.storeName = storeName;
        this.description = description;
        this.gameName = gameName;
        this.image = image;
    }

    protected Item(Parcel in) {
        name = in.readString();
        price = in.readString();
        storeName = in.readString();
        description = in.readString();
        gameName = in.readString();
        image = in.readInt();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(price);
        dest.writeString(storeName);
        dest.writeString(description);
        dest.writeString(gameName);
        dest.writeInt(image);
    }
}