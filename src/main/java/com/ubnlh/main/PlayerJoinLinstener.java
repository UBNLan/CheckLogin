package com.ubnlh.main;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinLinstener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) throws Exception {
        Bukkit.broadcastMessage(event.getPlayer().getName() + "进入了游戏");
    }
}
