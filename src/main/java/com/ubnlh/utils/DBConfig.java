package com.ubnlh.utils;

import com.ubnlh.main.CheckLogin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class DBConfig {

    private static File dbConfigFile;
    private static FileConfiguration dbConfig;

    private JavaPlugin plugin = JavaPlugin.getProvidingPlugin(CheckLogin.class);

    //创建配置文件
    public void createDBConfig(){
        dbConfigFile = new File(plugin.getDataFolder(),"DBConfig.yml");
        if(!dbConfigFile.exists()){
            dbConfigFile.getParentFile().mkdir();
            plugin.saveResource("DBConfig.yml",false);
            plugin.getLogger().info("创建配置成功，这条消息仅在第一次运行插件时出现。");
        }
        dbConfig = new YamlConfiguration();
        try {
            dbConfig.load(dbConfigFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //创建静态get方法以供其他文件使用配置文件内容
    public static FileConfiguration getDBConfig() {
        return dbConfig;
    }
}
