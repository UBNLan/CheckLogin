package com.ubnlh.utils;


import org.bukkit.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GeneralUtil implements UBUtil {

    @Override
    public int playerDBState(Player player) {
        //创建数据库连接
        DBConn connection = new DBConn();
        connection.openConnection();
        try {
            String sql = "SELECT *  FROM mcuser WHERE username=?";
            PreparedStatement ps = connection.getConnection().prepareStatement(sql);
            ps.setString(1, player.getName());
            ResultSet result = ps.executeQuery();
            //判断玩家是否绑定论坛账号
            if (!result.next()) {
                return 0;
            } else {
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            player.sendMessage("§4数据库异常，请联系管理员");
        }
        return 2;
    }
}
