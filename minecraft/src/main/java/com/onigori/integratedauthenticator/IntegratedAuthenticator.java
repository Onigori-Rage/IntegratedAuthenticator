package com.onigori.integratedauthenticator;

import org.bukkit.plugin.java.JavaPlugin;

public class IntegratedAuthenticator extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info("IntegratedAuthenticator by Onigori_Rage was successfully enabled.");

    }

    @Override
    public void onDisable() {

        getLogger().info("IntegratedAuthenticator is being disabled.");

    }

}