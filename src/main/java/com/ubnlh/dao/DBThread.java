package com.ubnlh.dao;

import com.ubnlh.utils.GeneralUtil;
import com.ubnlh.utils.Language;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;


public class DBThread extends BukkitRunnable {


    private Player pl;
    private GeneralUtil util = new GeneralUtil();

    public DBThread(Player player) {
        this.pl = player;
    }
    @Override
    public void run() {
        int pdbs = util.playerDBState(pl);
        if(pdbs == 1){
            Bukkit.broadcastMessage("[§d论坛会员§f]§e "+pl.getName() + " §b加入了游戏");
            pl.sendMessage(Language.LonginBBS);
        }else if (pdbs == 0){
            Bukkit.broadcastMessage("[§a游客§f] "+pl.getName() + " §b加入了游戏");
            pl.sendMessage(Language.bindBBS);
        }else pl.sendMessage("§4获取状态异常，请联系管理员");
    }
}
