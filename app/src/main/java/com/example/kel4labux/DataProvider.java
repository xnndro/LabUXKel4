package com.example.kel4labux;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<Game> getGamesMobile() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("Mobile Legends", "Game MOBA terpopuler", "Mobile Games",R.drawable.mobile_legends,99,90, getItemListMobileLegends()));
        games.add(new Game("Call Of Duty", "Game MOBA terpopuler", "Mobile Games",R.drawable.call_off_duty,99,90, getItemListCOD()));
        games.add(new Game("Clash of Clan", "Game MOBA terpopuler", "Mobile Games",R.drawable.logococ,99,90, getItemListCOC()));
        games.add(new Game("Free Fire", "Game MOBA terpopuler", "Mobile Games",R.drawable.freefire,99,90, getItemListFreeFire()));
        games.add(new Game("PUBG", "Game MOBA terpopuler", "Mobile Games",R.drawable.pubg,99,90, getItemListPUBG()));
        return games;
    }

    public static List<Game> getGamesPc() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("Valorant", "Game MOBA terpopuler", "Mobile Games",R.drawable.valorant,99,90, getItemListValorant()));
        games.add(new Game("Counter Strike", "Game MOBA terpopuler", "Mobile Games",R.drawable.counter_strike,99,90, getItemListCS()));
        games.add(new Game("DreadOut", "Game MOBA terpopuler", "Mobile Games",R.drawable.dreadout,99,90, getItemListDreadOut()));
        games.add(new Game("Fortnite", "Game MOBA terpopuler", "Mobile Games",R.drawable.fortnite,99,90, getItemListFortnite()));
        games.add(new Game("Dota 2", "Game MOBA terpopuler", "Mobile Games",R.drawable.dota_2,99,90, getItemListDota()));
        return games;
    }

    public static List<Game> getGamesConsole() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("GTA", "Game MOBA terpopuler", "Mobile Games",R.drawable.gta,99,90, getItemListGTA()));
        games.add(new Game("FIFA 22", "Game MOBA terpopuler", "Mobile Games",R.drawable.fifa,99,90, getItemListFIFA()));
        games.add(new Game("Hogwarts Legacy", "Game MOBA terpopuler", "Mobile Games",R.drawable.hwg_legacy,99,90, getItemListMobileLegends()));
        games.add(new Game("Overcooked", "Game MOBA terpopuler", "Mobile Games",R.drawable.overcooked,99,90, getItemListMobileLegends()));
        games.add(new Game("Resident Evil", "Game MOBA terpopuler", "Mobile Games",R.drawable.resident_evil,99,90, getItemListMobileLegends()));
        return games;
    }

    static List<Item> getItemListMobileLegends() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Aamon","10000","Yanto Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.ml1, "Mobile Legends"));
        items.add(new Item("Aamon Elite","10000","Yanto Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.ml2,"Mobile Legends"));
        items.add(new Item("Akai Elite","10000","Yanto Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.ml3,"Mobile Legends"));
        items.add(new Item("Akai Epic","10000","Yanto Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.ml4,"Mobile Legends"));
        items.add(new Item("Akai First","10000","Yanto Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.ml5,"Mobile Legends"));

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

    static List<Item> getItemListFreeFire(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Freess","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.ff1, "Free Fire"));
        items.add(new Item("Firee","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.ff2,"Free Fire"));
        items.add(new Item("epepep","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.ff3,"Free Fire"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.ff4,"Free Fire"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.ff5,"Free Fire"));

        return items;
    }

    static List<Item> getItemListCOD(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("COD","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.cod1, "Call Of Duty"));
        items.add(new Item("CCCCSAS","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.cod2,"Call Of Duty"));
        items.add(new Item("Od sdas","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.cod3,"Call Of Duty"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.cod4,"Call Of Duty"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.cod5,"Call Of Duty"));

        return items;
    }

    static List<Item> getItemListPUBG(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("COD","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.pubg1, "PUBG"));
        items.add(new Item("CCCCSAS","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.pubg2,"PUBG"));
        items.add(new Item("Od sdas","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.pubg3,"PUBG"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.pubg4,"PUBG"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.pubg5,"PUBG"));

        return items;
    }

    static List<Item> getItemListCOC(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("COD","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.pubg1, "Clash Of Clans"));
        items.add(new Item("CCCCSAS","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.pubg2,"Clash Of Clans"));
        items.add(new Item("Od sdas","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.pubg3,"Clash Of Clans"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.pubg4,"Clash Of Clans"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.pubg5,"Clash Of Clans"));

        return items;
    }

    static List<Item> getItemListValorant(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("COD","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.valo1, "Valorant"));
        items.add(new Item("CCCCSAS","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.valo2,"Valorant"));
        items.add(new Item("Od sdas","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.valo3,"Valorant"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.valo4,"Valorant"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.valo5,"Valorant"));

        return items;
    }

    static List<Item> getItemListCS()
    {
        List<Item> items = new ArrayList<>();
        items.add(new Item("COD","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.cs1, "Counter Strike"));
        items.add(new Item("CCCCSAS","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.cs2,"Counter Strike"));
        items.add(new Item("Od sdas","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.cs3,"Counter Strike"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.cs4,"Counter Strike"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.cs5,"Counter Strike"));

        return items;
    }

    static List<Item> getItemListDreadOut()
    {
        List<Item> items = new ArrayList<>();
        items.add(new Item("COD","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.do1, "DreadOut"));
        items.add(new Item("CCCCSAS","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.do2,"DreadOut"));
        items.add(new Item("Od sdas","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.do3,"DreadOut"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.do4,"DreadOut"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.do5,"DreadOut"));

        return items;
    }

    static List<Item> getItemListFortnite()
    {
        List<Item> items = new ArrayList<>();
        items.add(new Item("COD","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.fo1, "Fortnite"));
        items.add(new Item("CCCCSAS","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.fo2,"Fortnite"));
        items.add(new Item("Od sdas","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.fo3,"Fortnite"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.fo4,"Fortnite"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.fo5,"Fortnite"));

        return items;
    }

    static List<Item> getItemListDota()
    {
        List<Item> items = new ArrayList<>();
        items.add(new Item("COD","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.dt1, "Dota 2"));
        items.add(new Item("CCCCSAS","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.dt2,"Dota 2"));
        items.add(new Item("Od sdas","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.dt3,"Dota 2"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.dt4,"Dota 2"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.dt5,"Dota 2"));

        return items;
    }

    static List<Item> getItemListGTA()
    {
        List<Item> items = new ArrayList<>();
        items.add(new Item("COD","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.gta1, "GTA"));
        items.add(new Item("CCCCSAS","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.gta2,"GTA"));
        items.add(new Item("Od sdas","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.gta3,"GTA"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.gta4,"GTA"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.gta5,"GTA"));

        return items;
    }

    static List<Item> getItemListFIFA()
    {
        List<Item> items = new ArrayList<>();
        items.add(new Item("COD","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.fi1, "FIFA 22"));
        items.add(new Item("CCCCSAS","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.fi2,"FIFA 22"));
        items.add(new Item("Od sdas","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.fi3,"FIFA 22"));
        items.add(new Item("Freepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.fi4,"FIFA 22"));
        items.add(new Item("Pirepire","10000","Yanto sukses Makmur","Lorem basdasdjabdasjdalkjdakjdlajdkas", R.drawable.fi5,"FIFA 22"));

        return items;
    }
}

