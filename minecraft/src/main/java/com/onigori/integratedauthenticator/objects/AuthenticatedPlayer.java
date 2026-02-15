package com.onigori.integratedauthenticator.objects;

import org.bukkit.entity.Player;

import java.util.UUID;

public class AuthenticatedPlayer {

    private final UUID uuid;

    private Player primitiveInstance;

    public AuthenticatedPlayer(UUID uuid, Player primitiveInstance) {
        this.uuid = uuid;
        this.primitiveInstance = primitiveInstance;
    }

    public UUID getUUID() {
        return uuid;
    }

    public Player getPrimitiveInstance() {
        return primitiveInstance;
    }

    public void setPrimitiveInstance(Player primitiveInstance) {
        this.primitiveInstance = primitiveInstance;
    }

}
