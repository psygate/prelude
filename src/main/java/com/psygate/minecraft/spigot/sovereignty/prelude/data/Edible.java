/*
 *     Copyright (C) 2016 psygate (https://github.com/psygate)
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 */

package com.psygate.minecraft.spigot.sovereignty.prelude.data;

import org.bukkit.Material;

import java.util.HashMap;

/**
 * Created by psygate on 27.04.2016.
 */
public class Edible {
    private final static HashMap<Material, Edible> edibles = new HashMap<>();

    static {
        add(
                new Edible(Material.APPLE, 4),
                new Edible(Material.BAKED_POTATO, 5),
                new Edible(Material.BREAD, 5),
                new Edible(Material.CAKE, 2),
                new Edible(Material.CAKE_BLOCK, 2),
                new Edible(Material.CARROT_ITEM, 3),
                new Edible(Material.RAW_FISH, 1),
                new Edible(Material.COOKED_FISH, 6),
                new Edible(Material.COOKED_CHICKEN, 6),
                new Edible(Material.COOKED_MUTTON, 6),
                new Edible(Material.GRILLED_PORK, 6),
                new Edible(Material.COOKED_RABBIT, 5),
                new Edible(Material.COOKIE, 2),
                new Edible(Material.GOLDEN_APPLE, 4),
                new Edible(Material.GOLDEN_CARROT, 6),
                new Edible(Material.MELON, 2),
                new Edible(Material.MUSHROOM_SOUP, 6),
                new Edible(Material.POISONOUS_POTATO, 2),
                new Edible(Material.POTATO, 1),
                new Edible(Material.PUMPKIN_PIE, 8),
                new Edible(Material.RABBIT_STEW, 10),
                new Edible(Material.RAW_BEEF, 3),
                new Edible(Material.RAW_CHICKEN, 2),
                new Edible(Material.MUTTON, 2),
                new Edible(Material.PORK, 3),
                new Edible(Material.RABBIT, 3),
                new Edible(Material.ROTTEN_FLESH, 4),
                new Edible(Material.SPIDER_EYE, 2),
                new Edible(Material.COOKED_BEEF, 8)
        );
    }

    public static Edible get(Material material) {
        if (edibles.containsKey(material)) {
            return edibles.get(material);
        } else {
            throw new IllegalArgumentException("No edible for " + material);
        }
    }

    public static boolean has(Material material) {
        return edibles.containsKey(material);
    }

    private static void add(Edible edible) {
        edibles.put(edible.mat, edible);
    }

    private static void add(Edible... ediblesArg) {
        for (Edible edible : ediblesArg) {
            edibles.put(edible.mat, edible);
        }
    }

    private final Material mat;
    private final int foodPoints;

    private Edible(Material mat, int foodPoints) {
        this.mat = mat;
        this.foodPoints = foodPoints;
    }

    public Material getMaterial() {
        return mat;
    }

    public int getFoodPoints() {
        return foodPoints;
    }

    /*
    Apple

4 (Hunger.svgHunger.svg)	2.4	6.4	0.6
None

Destroyed/despawned oak or dark oak leaves
Stronghold, village, igloo and bonus chests
Receive 5 for 1 emerald in a tier 3 trade with a farmer
Baked Potato

5 (Half Hunger.svgHunger.svgHunger.svg)	7.2	12.2	1.44
None

Cooking a potato in a furnace
Beetroot

1 (Half Hunger.svg)	1.2	2.2	1.2
None

Harvesting beetroot crops
Beetroot Soup

6 (Hunger.svgHunger.svgHunger.svg)	7.2	13.2	1.2
None

Crafting a bowl together with beetroots
Bread

5 (Half Hunger.svgHunger.svgHunger.svg)	6	11	1.2
None

Crafting from wheat
Dungeon, stronghold, village, abandoned mine shaft and bonus chests
Receive 2–4 for 1 emerald in a tier 1 trade with a farmer
Farmers who drop bread after harvesting wheat
Cake (slice)

2 (Hunger.svg)	0.4	2.4	0.2
None

Consume one slice of cake
Cake (whole)

14 (Hunger.svgHunger.svgHunger.svgHunger.svgHunger.svgHunger.svgHunger.svg)	2.8	16.8	0.2
None

Crafting from wheat, eggs, sugar, and milk
Receive 1 for 1 emerald in a tier 4 trade with a farmer
Carrot

3 (Half Hunger.svgHunger.svg)	4.8	7.8	1.6
None

Killing zombies
Harvesting carrot crops
Chorus Fruit

4 (Hunger.svgHunger.svg)	2.4	6.4	0.6
The player may be teleported randomly, as described at Enderman#Teleportation.

Breaking chorus plants
Clownfish

1 (Half Hunger.svg)	0.2	1.2	0.2
None

Fishing
Rare drop from guardians
Cooked Chicken

6 (Hunger.svgHunger.svgHunger.svg)	7.2	13.2	1.2
None

Cooking a raw chicken
Killing chickens with fire
Receive 6–8 for 1 emerald in a tier 2 trade with a butcher
Cooked Fish

5 (Half Hunger.svgHunger.svgHunger.svg)	6	11	1.2
None

Cooking a raw fish
Receive 6 for 1 emerald + 6 raw fish in a tier 2 trade with a fisherman
Cooked Mutton

6 (Hunger.svgHunger.svgHunger.svg)	9.6	15.6	1.6
None

Cooking raw mutton
Killing sheep with fire
Cooked Porkchop

8 (Hunger.svgHunger.svgHunger.svgHunger.svg)	12.8	20.8	1.6
None

Cooking a raw porkchop
Killing pigs with fire
Receive 5–7 for 1 emerald in a tier 2 trade with a butcher
Cooked Rabbit

5 (Half Hunger.svgHunger.svgHunger.svg)	6	11	1.2
None

Cooking raw rabbit
Killing rabbits with fire
Cooked Salmon

6 (Hunger.svgHunger.svgHunger.svg)	9.6	15.6	1.6
None

Cooking a raw salmon
Cookie

2 (Hunger.svg)	0.4	2.4	0.2
None

Crafting from wheat and cocoa beans
Receive 6 for 1 emerald in a tier 4 trade with a farmer
Golden Apple

4 (Hunger.svgHunger.svg)	9.6	13.6	2.4

Regeneration II for 5 seconds

Absorption for 2 minutes
Crafting from an apple and gold ingots
Desert temple, dungeon and abandoned mine shaft, stronghold and igloo chests
Enchanted Golden Apple

4 (Hunger.svgHunger.svg)	9.6	13.6	2.4

Regeneration II for 20 seconds

Absorption IV for 2 minutes

Resistance for 5 minutes

Fire Resistance for 5 minutes
Desert temple, dungeon and abandoned mine shaft chests
Golden Carrot

6 (Hunger.svgHunger.svgHunger.svg)	14.4	20.4	2.4
None

Crafting a carrot with gold nuggets
Melon

2 (Hunger.svg)	1.2	3.2	0.6
None

Harvesting a melon block
Mushroom Stew

6 (Hunger.svgHunger.svgHunger.svg)	7.2	13.2	1.2
None

Crafting with a bowl and one of each mushroom
Using a bowl on a mooshroom
Poisonous Potato

2 (Hunger.svg)	1.2	3.2	0.6

Poison for 4 seconds (60% chance)

Harvesting potato crops
Potato

1 (Half Hunger.svg)	0.6	1.6	0.6
None

Killing zombies
Harvesting potato crops
Pufferfish

1 (Half Hunger.svg)	0.2	1.2	0.2
(−4.8)[note 2]

Hunger III for 15 seconds

Nausea II for 15 seconds

Poison IV for 60 seconds
Fishing
Rare drop from guardians
Pumpkin Pie

8 (Hunger.svgHunger.svgHunger.svgHunger.svg)	4.8	12.8	0.6
None

Crafting with a pumpkin, an egg and sugar
Receive 2–3 for 1 emerald in a tier 2 trade with a farmer
Rabbit Stew

10 (Hunger.svgHunger.svgHunger.svgHunger.svgHunger.svg)	12	22	1.2
None

Crafting with a bowl, carrot, baked potato, mushroom and cooked rabbit
Raw Beef

3 (Half Hunger.svgHunger.svg)	1.8	4.8	0.6
None

Killing cows and mooshrooms
Raw Chicken

2 (Hunger.svg)	1.2	3.2	0.6
(2.075)[note 2]

Hunger for 30 seconds (30% chance)

Killing chickens
Raw Fish

2 (Hunger.svg)	0.4	2.4	0.2
None

Fishing
Killing guardians
Raw Mutton

2 (Hunger.svg)	1.2	3.2	0.6
None

Killing sheep
Raw Porkchop

3 (Half Hunger.svgHunger.svg)	1.8	4.8	0.6
None

Killing pigs
Raw Rabbit

3 (Half Hunger.svgHunger.svg)	1.8	4.8	0.6
None

Killing rabbits
Raw Salmon

2 (Hunger.svg)	0.4	2.4	0.2
None

Fishing
Rare drop from guardians
Rotten Flesh

4 (Hunger.svgHunger.svg)	0.8	4.8	0.2
(1.8)[note 2]

Hunger for 30 seconds (80% chance)

Killing zombies and zombie pigmen
dungeon, igloo, desert and jungle temple chests
Junk catch from fishing
Spider Eye

2 (Hunger.svg)	3.2	5.2	1.6
(2.2)[note 3]

Poison for 4 seconds

Killing spiders and cave spiders
Killing a witch
Steak
     */
}
