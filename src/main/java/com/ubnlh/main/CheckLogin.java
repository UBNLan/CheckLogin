package com.ubnlh.main;

import com.ubnlh.utils.DBConfig;
import org.bukkit.plugin.java.JavaPlugin;


public class CheckLogin extends JavaPlugin{

    //入口
    @Override
    public void onEnable(){
        new DBConfig().createDBConfig();
        getServer().getPluginManager().registerEvents(new PlayerEvendhandler(),this);
    }

    @Override
    public void onDisable(){
    }
}
