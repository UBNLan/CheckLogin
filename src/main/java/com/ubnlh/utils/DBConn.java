package com.ubnlh.utils;

import com.ubnlh.main.CheckLogin;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {

    private Connection connection;
    //创建数据库连接
    public  void openConnection(){
        String url = DBConfig.getDBConfig().getString("url");
        String username = DBConfig.getDBConfig().getString("username");
        String password = DBConfig.getDBConfig().getString("password");

        try {
            if(connection != null && !connection.isClosed()){
                return;
            }
            synchronized (this) {
                if (connection != null && !connection.isClosed()) {
                    return;
                }
            }
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            //System.out.println("连接数据库成功");
        } catch (Exception e) {
            JavaPlugin.getProvidingPlugin(CheckLogin.class).getLogger().warning("连接数据库失败，请检查plugin/CheckLogin/DBConfig.yml中的数据库配置");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
