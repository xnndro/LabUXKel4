package com.example.kel4labux;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<Game> getGames() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("Mobile Legends", "Game MOBA terpopuler", "Mobile Games",R.drawable.ic_game,99,90, getItemListMobileLegends()));
        games.add(new Game("Mobile Legends 2", "Game MOBA terpopuler", "Mobile Games",R.drawable.ic_game,99,90, getItemListMobileLegends2()));
        games.add(new Game("Mobile Legends 3", "Game MOBA terpopuler", "Mobile Games",R.drawable.ic_game,99,90, getItemListMobileLegends()));
        return games;
    }

    static List<Item> getItemListMobileLegends() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Hero yanto","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb1));
        items.add(new Item("Hero tori","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb2));
        items.add(new Item("Hero deep","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb3));
        items.add(new Item("Hero budi","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb4));
        items.add(new Item("Hero dipdip2","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb5));

        return items;
    }

    static List<Item> getItemListMobileLegends2() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Hero yanto","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb1));
        items.add(new Item("Hero tori","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb2));
        items.add(new Item("Hero deep","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb3));
        items.add(new Item("Hero budi","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb4));
        items.add(new Item("Hero dipdip2","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb5));

        return items;
    }
}

