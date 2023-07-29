package com.example.kel4labux;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<Game> getGamesMobile() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("Mobile Legends", "Game MOBA terpopuler", "Mobile Games",R.drawable.mobile_legends,99,90, getItemListMobileLegends()));
        games.add(new Game("Call Of Duty", "Game MOBA terpopuler", "Mobile Games",R.drawable.call_off_duty,99,90, getItemListMobileLegends2()));
        games.add(new Game("Hago", "Game MOBA terpopuler", "Mobile Games",R.drawable.hago,99,90, getItemListMobileLegends()));
        games.add(new Game("Free Fire", "Game MOBA terpopuler", "Mobile Games",R.drawable.freefire,99,90, getItemListMobileLegends()));
        games.add(new Game("PUBG", "Game MOBA terpopuler", "Mobile Games",R.drawable.pubg,99,90, getItemListMobileLegends()));
        return games;
    }

    public static List<Game> getGamesPc() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("Valorant", "Game MOBA terpopuler", "Mobile Games",R.drawable.valorant,99,90, getItemListMobileLegends()));
        games.add(new Game("Counter Strike", "Game MOBA terpopuler", "Mobile Games",R.drawable.counter_strike,99,90, getItemListMobileLegends2()));
        games.add(new Game("DreadOut", "Game MOBA terpopuler", "Mobile Games",R.drawable.dreadout,99,90, getItemListMobileLegends()));
        games.add(new Game("Fortnite", "Game MOBA terpopuler", "Mobile Games",R.drawable.fortnite,99,90, getItemListMobileLegends()));
        games.add(new Game("Dota 2", "Game MOBA terpopuler", "Mobile Games",R.drawable.dota_2,99,90, getItemListMobileLegends()));
        return games;
    }

    public static List<Game> getGamesConsole() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("GTA", "Game MOBA terpopuler", "Mobile Games",R.drawable.gta,99,90, getItemListMobileLegends()));
        games.add(new Game("FIFA 22", "Game MOBA terpopuler", "Mobile Games",R.drawable.fifa,99,90, getItemListMobileLegends2()));
        games.add(new Game("Hogwarts Legacy", "Game MOBA terpopuler", "Mobile Games",R.drawable.hwg_legacy,99,90, getItemListMobileLegends()));
        games.add(new Game("Overcooked", "Game MOBA terpopuler", "Mobile Games",R.drawable.overcooked,99,90, getItemListMobileLegends()));
        games.add(new Game("Resident Evil", "Game MOBA terpopuler", "Mobile Games",R.drawable.resident_evil,99,90, getItemListMobileLegends()));
        return games;
    }

    static List<Item> getItemListMobileLegends() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Hero yanto","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb1, "Mobile Legends"));
        items.add(new Item("Hero tori","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb2,"Mobile Legends"));
        items.add(new Item("Hero deep","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb3,"Mobile Legends"));
        items.add(new Item("Hero budi","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb4,"Mobile Legends"));
        items.add(new Item("Hero dipdip2","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb5,"Mobile Legends"));

        return items;
    }

    static List<Item> getItemListMobileLegends2() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Hero yanto","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb1, "Mobile Legends2"));
        items.add(new Item("Hero tori","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb2,"Mobile Legends2"));
        items.add(new Item("Hero deep","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb3,"Mobile Legends2"));
        items.add(new Item("Hero budi","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb4,"Mobile Legends2"));
        items.add(new Item("Hero dipdip2","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.mb5,"Mobile Legends2"));

        return items;
    }
}

