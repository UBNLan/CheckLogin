package com.ubnlh.main;

import com.ubnlh.dao.DBThread;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerEvendhandler implements Listener{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) throws Exception {
        Player pl = event.getPlayer();
        Bukkit.broadcastMessage(pl.getName() + "进入了游戏");
        new DBThread(pl).runTaskAsynchronously(JavaPlugin.getProvidingPlugin(CheckLogin.class));

    }
}
