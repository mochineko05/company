package com.gihubmochineko05.company;

import org.bukkit.plugin.java.JavaPlugin;

public final class Company extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("START COMPANY スタート カンパニー");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("STOP COMPANY ストップ カンパニー");
    }
}
