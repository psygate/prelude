package com.psygate.minecraft.spigot.sovereignty.prelude;

import com.psygate.minecraft.spigot.sovereignty.nucleus.Nucleus;
import com.psygate.minecraft.spigot.sovereignty.nucleus.managment.NucleusPlugin;
import com.psygate.minecraft.spigot.sovereignty.nucleus.sql.DatabaseInterface;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.Configuration;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataManager;
import com.psygate.minecraft.spigot.sovereignty.prelude.listeners.AmethystListener;
import com.psygate.minecraft.spigot.sovereignty.prelude.listeners.PlayerDataListener;
import com.psygate.minecraft.spigot.sovereignty.prelude.listeners.SanctuaryListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by psygate on 25.04.2016.
 */
public class Prelude extends JavaPlugin implements NucleusPlugin {
    private static Prelude instance;
    private Logger logger;
    private DatabaseInterface dbi;
    private Configuration conf;
    private PlayerDataListener dataListener = new PlayerDataListener();

    @Override
    public void onEnable() {
        instance = this;
        Nucleus.getInstance().register(this);
        saveDefaultConfig();
        reloadConfiguration();
    }

    public PlayerDataListener getListener() {
        return dataListener;
    }

    @Override
    public void onDisable() {
        PlayerDataManager.getInstance().flush();
    }

    public static Prelude getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Plugin not initialized.");
        }
        return instance;
    }

    public static Configuration getConf() {
        return getInstance().conf;
    }

    public static DatabaseInterface DBI() {
        return getInstance().dbi;
    }

    @Override
    public int getWantedDBVersion() {
        return 1;
    }

    @Override
    public void fail() {
        System.err.println("Prelude failed to load.");
        Bukkit.shutdown();
    }

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Logger getPluginLogger() {
        return logger;
    }

    @Override
    public List<Listener> getListeners() {
        ArrayList<Listener> listeners = new ArrayList<>();
        listeners.add(dataListener);

        if (getServer().getPluginManager().getPlugin("amethyst") != null) {
            listeners.add(new AmethystListener());
        }

        if (getServer().getPluginManager().getPlugin("sanctuary") != null) {
            listeners.add(new SanctuaryListener());
        }

        return listeners;
    }

    @Override
    public void setDatabaseInterface(DatabaseInterface databaseInterface) {
        this.dbi = databaseInterface;
    }

    public void reloadConfiguration() {
        reloadConfig();
        conf = new Configuration(getConfig());

        getServer().getOnlinePlayers().forEach(player -> {
            dataListener.addToJoinMap(player.getUniqueId());
            PlayerDataManager.getInstance().flagPlayer(player);
        });
    }
}
