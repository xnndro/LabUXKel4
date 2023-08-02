package com.example.kel4labux;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.List;

public class Game implements Parcelable {
    private String name,description,gameType;
    private int icon;
    private int totalDownloads, totalItems;

    private List<Item> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getTotalDownloads() {
        return totalDownloads;
    }

    public void setTotalDownloads(int totalDownloads) {
        this.totalDownloads = totalDownloads;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Game(String name, String description, String gameType, int icon, int totalDownloads, int totalItems, List<Item> items) {
        this.name = name;
        this.description = description;
        this.gameType = gameType;
        this.icon = icon;
        this.totalDownloads = totalDownloads;
        this.totalItems = totalItems;
        this.items = items;
    }

    protected Game(Parcel in) {
        name = in.readString();
        description = in.readString();
        gameType = in.readString();
        icon = in.readInt();
        totalDownloads = in.readInt();
        totalItems = in.readInt();
        items = in.createTypedArrayList(Item.CREATOR);
    }

    public static final Creator<Game> CREATOR = new Creator<Game>() {
        @Override
        public Game createFromParcel(Parcel in) {
            return new Game(in);
        }

        @Override
        public Game[] newArray(int size) {
            return new Game[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(gameType);
        dest.writeInt(icon);
        dest.writeInt(totalDownloads);
        dest.writeInt(totalItems);
        dest.writeTypedList(items);
    }
}
