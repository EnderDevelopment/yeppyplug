package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.Location;
import org.bukkit.entity.Item;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.Location;
import org.bukkit.entity.Item;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.Location;
import org.bukkit.entity.Item;
import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
    getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Plugin enabled!");
    }

    @Override
    @EventHandler
public void onItemDrop(PlayerDropItemEvent event) {
    Item item = event.getItemDrop();
    Location location = item.getLocation();
    Hologram hologram = HologramsAPI.createHologram(this, location);
    hologram.appendTextLine("Dropped Item");
}

public void onDisable() {
        getLogger().info("Plugin disabled!");
    }
}