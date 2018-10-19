package com.ubnlh.entity;

public class Player {
    private int uid;
    private String username;
    private String password;
    private String mail;
    private int point;
    private String ip_address;
    private int active;

    public Player() {
    }

    public Player(int uid, String username, String password, String mail, int point, String ip_address, int active) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.point = point;
        this.ip_address = ip_address;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Player{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", point=" + point +
                ", ip_address='" + ip_address + '\'' +
                ", active=" + active +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
