package com.example.kel4labux;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<Game> getGamesMobile() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("Mobile Legends", "Rasakan keseruan pertempuran 5v5 dalam MOBA terpopuler!", "Mobile Games", R.drawable.mobile_legends, 99, 90, getItemListMobileLegends()));
        games.add(new Game("Call Of Duty", "Bergabunglah dalam pertempuran intens di medan perang modern!", "Mobile Games", R.drawable.call_off_duty, 99, 90, getItemListCOD()));
        games.add(new Game("Clash of Clan", "Bangun desa impianmu dan kuasai kerajaan bersama klanmu!", "Mobile Games", R.drawable.logococ, 99, 90, getItemListCOC()));
        games.add(new Game("Free Fire", "Siapkan dirimu untuk bertahan dan jadi yang terakhir bertahan hidup!", "Mobile Games", R.drawable.freefire, 99, 90, getItemListFreeFire()));
        games.add(new Game("PUBG", "Ungkapkan keahlianmu dalam pertempuran 100 pemain dalam game battle royale!", "Mobile Games", R.drawable.pubg, 99, 90, getItemListPUBG()));
        return games;
    }

    public static List<Game> getGamesPc() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("Valorant", "Gabunglah dalam tim agen elit dan pamerkan skillmu dalam pertempuran tak terlupakan!", "PC Games", R.drawable.valorant, 99, 90, getItemListValorant()));
        games.add(new Game("Counter Strike", "Buktikan kemampuanmu dalam game first-person shooter legendaris!", "PC Games", R.drawable.counter_strike, 99, 90, getItemListCS()));
        games.add(new Game("DreadOut", "Hadapi kengerian yang mengintai di game horor dengan grafis memukau!", "PC Games", R.drawable.dreadout, 99, 90, getItemListDreadOut()));
        games.add(new Game("Fortnite", "Bangun dan bertahanlah dalam dunia seru game battle royale yang penuh aksi!", "PC Games", R.drawable.fortnite, 99, 90, getItemListFortnite()));
        games.add(new Game("Dota 2", "Ayo bergabung dalam pertarungan epik antara Sentinel dan Scourge!", "PC Games", R.drawable.dota_2, 99, 90, getItemListDota()));
        return games;
    }

    public static List<Game> getGamesConsole() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("GTA", "Nikmati kebebasan tak terbatas dalam game dunia terbuka penuh aksi dan petualangan!", "Console Games", R.drawable.gta, 99, 90, getItemListGTA()));
        games.add(new Game("FIFA 22", "Bangun tim impianmu dan rasakan emosi sejati sepak bola dalam game olahraga terbaik!", "Console Games", R.drawable.fifa, 99, 90, getItemListFIFA()));
        games.add(new Game("Hogwarts Legacy", "Jelajahi dunia sihir Hogwarts dan temukan rahasia gelap yang mengancam seluruh dunia sihir!", "Console Games", R.drawable.hwg_legacy, 99, 90, getItemListHogwarts()));
        games.add(new Game("Overcooked", "Bekerjasama dalam mengolah makanan dalam game koki penuh kegembiraan!", "Console Games", R.drawable.overcooked, 99, 90, getItemListOvercooked()));
        games.add(new Game("Resident Evil", "Hadapi kengerian dan misteri di game survival horror yang legendaris!", "Console Games", R.drawable.resident_evil, 99, 90, getItemListResident()));
        return games;
    }

    static List<Item> getItemListMobileLegends() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Blazing Sword", "25000", "Yanto's Emporium", "A powerful sword imbued with the essence of fire, perfect for slaying your enemies.", R.drawable.ml1, "Mobile Legends"));
        items.add(new Item("Frost Bow", "20000", "Yanto's Emporium", "An enchanted bow that can freeze your foes in their tracks, leaving them vulnerable.", R.drawable.ml2, "Mobile Legends"));
        items.add(new Item("Divine Shield", "18000", "Yanto's Emporium", "A holy shield that grants its wielder protection from all harm and status effects.", R.drawable.ml3, "Mobile Legends"));
        items.add(new Item("Eternal Wand", "22000", "Yanto's Emporium", "A wand that channels the power of the cosmos, casting devastating spells upon your enemies.", R.drawable.ml4, "Mobile Legends"));
        items.add(new Item("Thunder Gauntlet", "19000", "Yanto's Emporium", "A gauntlet infused with the power of thunder, allowing you to unleash electrifying attacks.", R.drawable.ml5, "Mobile Legends"));

        return items;
    }

    static List<Item> getItemListFreeFire(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Inferno Armor", "30000", "Yanto's Armory", "A set of armor that grants its wearer immunity to fire and boosts overall defense.", R.drawable.ff1, "Free Fire"));
        items.add(new Item("Ice Queen Crown", "28000", "Yanto's Armory", "A majestic crown that enhances your ice-based abilities, turning you into an ice-cold ruler.", R.drawable.ff2, "Free Fire"));
        items.add(new Item("Windwalker Boots", "24000", "Yanto's Armory", "Boots imbued with the wind's speed, allowing you to move with unparalleled swiftness.", R.drawable.ff3, "Free Fire"));
        items.add(new Item("Aqua Pendant", "22000", "Yanto's Armory", "A magical pendant that grants its wearer the ability to breathe underwater and control water.", R.drawable.ff4, "Free Fire"));
        items.add(new Item("Stormbreaker Crossbow", "26000", "Yanto's Armory", "A crossbow that can summon devastating storms, striking fear into your enemies.", R.drawable.ff5, "Free Fire"));

        return items;
    }

    static List<Item> getItemListCOD(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Plasma Rifle", "35000", "Yanto's Arsenal", "A state-of-the-art rifle that shoots powerful plasma bolts, melting through enemy armor.", R.drawable.cod1, "Call Of Duty"));
        items.add(new Item("Stealth Cloak", "32000", "Yanto's Arsenal", "A high-tech cloak that renders its wearer invisible to enemy radars and detection.", R.drawable.cod2, "Call Of Duty"));
        items.add(new Item("Nano Stimpack", "28000", "Yanto's Arsenal", "An advanced stimpack that instantly heals wounds and enhances the user's physical abilities.", R.drawable.cod3, "Call Of Duty"));
        items.add(new Item("Gravity Grenade", "26000", "Yanto's Arsenal", "A grenade that creates a localized gravitational field, pulling enemies towards its center.", R.drawable.cod4, "Call Of Duty"));
        items.add(new Item("Time Warp Device", "30000", "Yanto's Arsenal", "A device that manipulates time, allowing its user to slow down or speed up time for tactical advantage.", R.drawable.cod5, "Call Of Duty"));

        return items;
    }

    static List<Item> getItemListPUBG(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Camo Ghillie Suit", "40000", "Yanto's Outfitters", "A special ghillie suit with adaptive camouflage, blending perfectly with the surroundings.", R.drawable.pubg1, "PUBG"));
        items.add(new Item("Silent Sniper Rifle", "36000", "Yanto's Outfitters", "A silenced sniper rifle that allows you to take down enemies stealthily from a distance.", R.drawable.pubg2, "PUBG"));
        items.add(new Item("Adrenaline Boost", "32000", "Yanto's Outfitters", "A syringe filled with adrenaline that increases your speed and reduces the effects of wounds.", R.drawable.pubg3, "PUBG"));
        items.add(new Item("Explosive Crossbow", "38000", "Yanto's Outfitters", "A crossbow that fires explosive-tipped bolts, dealing massive area damage to foes.", R.drawable.pubg4, "PUBG"));
        items.add(new Item("Portable Shield", "35000", "Yanto's Outfitters", "A compact shield that can be deployed to protect you and your squad from incoming fire.", R.drawable.pubg5, "PUBG"));

        return items;
    }

    static List<Item> getItemListCOC(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Dragon's Breath", "30000", "Yanto's Fortress", "A legendary cannon that fires projectiles engulfed in dragon flames, reducing enemy bases to ashes.", R.drawable.coc1, "Clash Of Clans"));
        items.add(new Item("Dark Elixir Spellbook", "28000", "Yanto's Fortress", "A forbidden spellbook that empowers your dark elixir troops, making them even deadlier.", R.drawable.coc2, "Clash Of Clans"));
        items.add(new Item("Golem's Heart", "25000", "Yanto's Fortress", "A mystical gem that animates a golem, creating a powerful tank for your army.", R.drawable.coc3, "Clash Of Clans"));
        items.add(new Item("Wall Breaker's Bomb", "22000", "Yanto's Fortress", "A bomb with incredible explosive power, designed to breach the strongest walls.", R.drawable.coc4, "Clash Of Clans"));
        items.add(new Item("Hero Potion", "26000", "Yanto's Fortress", "A magical potion that temporarily enhances the abilities of your heroes in battle.", R.drawable.coc5, "Clash Of Clans"));

        return items;
    }

    static List<Item> getItemListValorant(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Phantom Blade", "30000", "Yanto's Arsenal", "A stealthy knife that deals deadly precision strikes, perfect for silent eliminations.", R.drawable.valo1, "Valorant"));
        items.add(new Item("Guardian's Barrier", "28000", "Yanto's Arsenal", "A deployable energy barrier that blocks incoming enemy fire, providing cover for your team.", R.drawable.valo2, "Valorant"));
        items.add(new Item("Teleportation Device", "32000", "Yanto's Arsenal", "A portable device that allows you to teleport to strategic locations on the battlefield.", R.drawable.valo3, "Valorant"));
        items.add(new Item("Time Distortion Grenade", "34000", "Yanto's Arsenal", "A grenade that creates a localized time distortion, slowing down enemy movements.", R.drawable.valo4, "Valorant"));
        items.add(new Item("Spectral Cloak", "26000", "Yanto's Arsenal", "A cloak that phases its wearer into a spectral form, making them temporarily invulnerable.", R.drawable.valo5, "Valorant"));

        return items;
    }

    static List<Item> getItemListCS(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("AK-47 Bloodbane", "38000", "Yanto's Arsenal", "A rare AK-47 skin adorned with ancient runes, increasing accuracy and damage.", R.drawable.cs1, "Counter Strike"));
        items.add(new Item("Stealth Assassin Suit", "35000", "Yanto's Arsenal", "A black suit designed for covert operations, making you almost invisible in the shadows.", R.drawable.cs2, "Counter Strike"));
        items.add(new Item("Flashbang Dazzler", "32000", "Yanto's Arsenal", "A special flashbang that emits dazzling lights, disorienting your enemies temporarily.", R.drawable.cs3, "Counter Strike"));
        items.add(new Item("Medical Nano-Drones", "28000", "Yanto's Arsenal", "A set of nanobots that heal you and your teammates over time, even in the heat of battle.", R.drawable.cs4, "Counter Strike"));
        items.add(new Item("Infiltrator Decoy", "34000", "Yanto's Arsenal", "A deployable holographic decoy that confuses enemies, drawing their fire away from you.", R.drawable.cs5, "Counter Strike"));

        return items;
    }

    static List<Item> getItemListDreadOut(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Spirit Ward", "32000", "Yanto's Mystics", "A protective ward that repels malevolent spirits, keeping you safe from their wrath.", R.drawable.do1, "DreadOut"));
        items.add(new Item("Spectral Camera", "30000", "Yanto's Mystics", "A camera with the power to capture and reveal hidden ghosts and paranormal phenomena.", R.drawable.do2, "DreadOut"));
        items.add(new Item("Soul Essence Vial", "26000", "Yanto's Mystics", "A vial containing the essence of restless souls, allowing you to harness their power.", R.drawable.do3, "DreadOut"));
        items.add(new Item("Ethereal Lantern", "28000", "Yanto's Mystics", "A lantern that emits ethereal light, revealing hidden secrets and passages.", R.drawable.do4, "DreadOut"));
        items.add(new Item("Spirit Binder Talisman", "30000", "Yanto's Mystics", "A talisman that grants you control over summoned spirits, compelling them to aid you.", R.drawable.do5, "DreadOut"));

        return items;
    }

    static List<Item> getItemListFortnite(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Fortress Constructor", "35000", "Yanto's Emporium", "A powerful constructor outfit that enhances building speed and durability.", R.drawable.fo1, "Fortnite"));
        items.add(new Item("Stealthy Shapeshifter", "33000", "Yanto's Emporium", "An outfit that allows you to transform into any object, blending with the environment.", R.drawable.fo2, "Fortnite"));
        items.add(new Item("Skydiver's Jetpack", "28000", "Yanto's Emporium", "A jetpack attachment that allows for gliding and boosts your skydiving speed.", R.drawable.fo3, "Fortnite"));
        items.add(new Item("Mystical Llama Loot", "31000", "Yanto's Emporium", "A llama-shaped loot box that guarantees rare and epic items for your arsenal.", R.drawable.fo4, "Fortnite"));
        items.add(new Item("Infinity Gauntlet", "40000", "Yanto's Emporium", "A mythical gauntlet that grants you control over the fabric of reality itself.", R.drawable.fo5, "Fortnite"));

        return items;
    }

    static List<Item> getItemListDota(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Sange and Yasha", "30000", "Yanto's Armory", "A legendary combination of two powerful weapons, enhancing attack speed and damage.", R.drawable.dt1, "Dota 2"));
        items.add(new Item("Blink Dagger", "28000", "Yanto's Armory", "A dagger that allows for instant teleportation, perfect for initiating surprise attacks.", R.drawable.dt2, "Dota 2"));
        items.add(new Item("Black King Bar", "25000", "Yanto's Armory", "A powerful magic-immunity item that protects you from most enemy spells.", R.drawable.dt3, "Dota 2"));
        items.add(new Item("Aghanim's Scepter", "22000", "Yanto's Armory", "A mystical scepter that unlocks new abilities for some heroes, enhancing their power.", R.drawable.dt4, "Dota 2"));
        items.add(new Item("Divine Rapier", "28000", "Yanto's Armory", "A legendary sword that deals immense damage but is dropped upon death, adding risk and reward.", R.drawable.dt5, "Dota 2"));

        return items;
    }

    static List<Item> getItemListGTA(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Armored Kuruma", "50000", "Yanto's Garage", "An armored vehicle with bulletproof windows, offering unrivaled protection on the streets.", R.drawable.gta1, "GTA"));
        items.add(new Item("Rocket Thruster", "45000", "Yanto's Garage", "A jet engine attachment that can be installed on vehicles, allowing for vertical take-offs and rocket-powered flights.", R.drawable.gta2, "GTA"));
        items.add(new Item("Molotov Mayhem", "38000", "Yanto's Garage", "A set of molotov cocktails with enhanced fuel, creating larger and more explosive flames.", R.drawable.gta3, "GTA"));
        items.add(new Item("Night Vision Goggles", "35000", "Yanto's Garage", "Advanced goggles that grant night vision, making you a formidable threat even in the dark.", R.drawable.gta4, "GTA"));
        items.add(new Item("Time-Bomb Remote", "40000", "Yanto's Garage", "A remote control that activates a hidden time-bomb, perfect for ambushes and heists.", R.drawable.gta5, "GTA"));

        return items;
    }

    static List<Item> getItemListFIFA(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Golden Ball Trophy", "38000", "Yanto's Sports Emporium", "A replica of the prestigious Golden Ball trophy, symbolizing football excellence.", R.drawable.fi1, "FIFA 22"));
        items.add(new Item("Champion's Cleats", "35000", "Yanto's Sports Emporium", "A pair of cleats worn by legendary football champions, boosting agility and ball control.", R.drawable.fi2, "FIFA 22"));
        items.add(new Item("Ultimate Team Contract", "32000", "Yanto's Sports Emporium", "A special contract that allows you to recruit a legendary player to your Ultimate Team.", R.drawable.fi3, "FIFA 22"));
        items.add(new Item("Referee's Whistle", "28000", "Yanto's Sports Emporium", "A magical whistle that bends reality, granting you favorable decisions from the referee.", R.drawable.fi4, "FIFA 22"));
        items.add(new Item("Spectator's Ticket", "34000", "Yanto's Sports Emporium", "A ticket that grants you access to any football match in the world, anywhere, anytime.", R.drawable.fi5, "FIFA 22"));

        return items;
    }

    static List<Item> getItemListHogwarts(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Wand of Wizardry", "35000", "Yanto's Wands & Potions", "A wand crafted from the finest wood and core, channeling powerful spells at your command.", R.drawable.hg1, "Hogwarts Legacy"));
        items.add(new Item("Cloak of Invisibility", "32000", "Yanto's Wands & Potions", "A cloak that grants you the power of invisibility, allowing you to move undetected.", R.drawable.hg2, "Hogwarts Legacy"));
        items.add(new Item("Phoenix Feather Quill", "28000", "Yanto's Wands & Potions", "A quill with a phoenix feather core, enhancing your magical writing and spellcasting.", R.drawable.hg3, "Hogwarts Legacy"));
        items.add(new Item("Time-Turner Amulet", "30000", "Yanto's Wands & Potions", "An amulet that enables time travel, allowing you to revisit and change past events.", R.drawable.hg4, "Hogwarts Legacy"));
        items.add(new Item("Dragon's Scale Shield", "32000", "Yanto's Wands & Potions", "A shield crafted from dragon scales, providing exceptional protection against dark magic.", R.drawable.hg5, "Hogwarts Legacy"));

        return items;
    }

    static List<Item> getItemListOvercooked(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Chef's Hat of Mastery", "28000", "Yanto's Kitchen Emporium", "A hat worn by master chefs, boosting your cooking speed and efficiency.", R.drawable.ov1, "Overcooked"));
        items.add(new Item("Precision Knife Set", "26000", "Yanto's Kitchen Emporium", "A set of knives with razor-sharp edges, making chopping and slicing a breeze.", R.drawable.ov2, "Overcooked"));
        items.add(new Item("Flameproof Oven Mitts", "22000", "Yanto's Kitchen Emporium", "A pair of oven mitts that grant immunity to burns, allowing you to handle hot dishes.", R.drawable.ov3, "Overcooked"));
        items.add(new Item("Magic Spice Shaker", "24000", "Yanto's Kitchen Emporium", "A spice shaker that infuses dishes with magical flavors, delighting all who taste them.", R.drawable.ov4, "Overcooked"));
        items.add(new Item("Time-Freezer Platter", "26000", "Yanto's Kitchen Emporium", "A platter that temporarily freezes dishes, giving you more time to plan your moves.", R.drawable.ov5, "Overcooked"));

        return items;
    }

    static List<Item> getItemListResident(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Zombie Repellent Spray", "32000", "Yanto's Survival Gear", "A powerful spray that repels zombies, keeping them at bay while you explore.", R.drawable.re1, "Resident Evil"));
        items.add(new Item("T-Virus Antidote", "30000", "Yanto's Survival Gear", "An antidote that cures T-Virus infection, protecting you from turning into a zombie.", R.drawable.re2, "Resident Evil"));
        items.add(new Item("Survivor's Medkit", "26000", "Yanto's Survival Gear", "A comprehensive medkit that heals wounds and restores your health quickly.", R.drawable.re3, "Resident Evil"));
        items.add(new Item("Night Vision Goggles", "28000", "Yanto's Survival Gear", "Advanced goggles that grant night vision, making you a formidable threat even in the dark.", R.drawable.re4, "Resident Evil"));
        items.add(new Item("Rocket Launcher", "32000", "Yanto's Survival Gear", "A heavy-duty rocket launcher that deals massive damage, perfect for taking down bosses.", R.drawable.re5, "Resident Evil"));

        return items;
    }

    public static Game findGameByName(String gameName) {
        List<Game> games = getGamesMobile();
        for (Game game : games) {
            if (game.getName().equals(gameName)) {
                return game;
            }
        }

        games = getGamesPc();
        for (Game game : games) {
            if (game.getName().equals(gameName)) {
                return game;
            }
        }

        games = getGamesConsole();
        for (Game game : games) {
            if (game.getName().equals(gameName)) {
                return game;
            }
        }

        return null;
    }



}

