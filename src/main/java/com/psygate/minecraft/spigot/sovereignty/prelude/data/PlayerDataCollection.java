package com.psygate.minecraft.spigot.sovereignty.prelude.data;

import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records.PreludePlayerDataRecord;
import org.bukkit.Material;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by psygate on 26.04.2016.
 */
public class PlayerDataCollection {
    private final UUID player;
    private long breakCount = 0;
    private long placeCount = 0;
    private Map<Material, MutableInt> breakMaterial = new HashMap<>();
    private Map<Material, MutableInt> placeMaterial = new HashMap<>();
    private double metersWalked = 0;
    private long xpGained;
    private long saturationGained;
    private long millisecondsPlayed = 0;
    private Map<Material, MutableInt> materialsEaten = new HashMap<>();
    private boolean overridden = false;
    private int playtimeTrackingMonth = Calendar.getInstance().get(Calendar.MONTH);

    public PlayerDataCollection(UUID player) {
        this.player = player;
    }

    public PlayerDataCollection(PreludePlayerDataRecord rec) {
        player = rec.getPuuid();
        breakCount = rec.getBreakCount();
        placeCount = rec.getPlaceCount();
        metersWalked = rec.getMetersWalked();
        xpGained = rec.getXpGained();
        saturationGained = rec.getSaturationGained();
        millisecondsPlayed = rec.getMillisPlayed();
        overridden = rec.getForcedDedication();
        playtimeTrackingMonth = rec.getMillisTrackingMonth();
    }

    public UUID getPlayer() {
        return player;
    }

    public long getBreakCount() {
        return breakCount;
    }

    public void setBreakCount(long breakCount) {
        this.breakCount = breakCount;
    }

    public long getPlaceCount() {
        return placeCount;
    }

    public void setPlaceCount(long placeCount) {
        this.placeCount = placeCount;
    }

    public Map<Material, MutableInt> getBreakMaterial() {
        return breakMaterial;
    }

    public void setBreakMaterial(Map<Material, MutableInt> breakMaterial) {
        this.breakMaterial = breakMaterial;
    }

    public Map<Material, MutableInt> getPlaceMaterial() {
        return placeMaterial;
    }

    public void setPlaceMaterial(Map<Material, MutableInt> placeMaterial) {
        this.placeMaterial = placeMaterial;
    }

    public double getMetersWalked() {
        return metersWalked;
    }

    public void setMetersWalked(double metersWalked) {
        this.metersWalked = metersWalked;
    }

    public void setXpGained(long xpGained) {
        this.xpGained = xpGained;
    }

    public long getSaturationGained() {
        return saturationGained;
    }

    public void setSaturationGained(long saturationGained) {
        this.saturationGained = saturationGained;
    }

    public Map<Material, MutableInt> getMaterialsEaten() {
        return materialsEaten;
    }

    public void setMaterialsEaten(Map<Material, MutableInt> materialsEaten) {
        this.materialsEaten = materialsEaten;
    }

    public void incBlockBreak() {
        breakCount++;
    }

    public void incBlockPlace() {
        placeCount++;
    }

    public void incPlayerMove(double distance) {
        metersWalked += distance;
    }

    public void incSaturationGained(int foodPoints) {
        saturationGained += foodPoints;
    }

    public void incXPGained(int amount) {
        xpGained += amount;
    }

    public void incMillisecondsPlayed(long minutes) {
        millisecondsPlayed += minutes;
    }

    public long getXpGained() {
        return xpGained;
    }

    public long getMillisecondsPlayed() {
        return millisecondsPlayed;
    }

    public void setMillisecondsPlayed(int millisecondsPlayed) {
        this.millisecondsPlayed = millisecondsPlayed;
    }

    public void setMinutesPlayed(long minutesPlayed) {
        this.millisecondsPlayed = minutesPlayed;
    }

    public boolean isOverridden() {
        return overridden;
    }

    public void setOverridden(boolean overridden) {
        this.overridden = overridden;
    }

    public void setMillisecondsPlayed(long millisecondsPlayed) {
        this.millisecondsPlayed = millisecondsPlayed;
    }

    public int getPlaytimeTrackingMonth() {
        return playtimeTrackingMonth;
    }

    public void setPlaytimeTrackingMonth(int playtimeTrackingMonth) {
        this.playtimeTrackingMonth = playtimeTrackingMonth;
    }

    public void addBrokenMaterial(Material type) {
        calculate(breakMaterial, type);
    }

    public void addPlacedMaterial(Material type) {
        calculate(placeMaterial, type);
    }

    public void addEatenMaterial(Material type) {
        calculate(materialsEaten, type);
    }

    private void calculate(Map<Material, MutableInt> map, Material type) {
        map.compute(type, (material, mutableInt) -> {
            if (mutableInt == null) {
                mutableInt = new MutableInt(1);
            } else {
                mutableInt.inc();
            }

            return mutableInt;
        });
    }
}
