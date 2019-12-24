package com.kuka.pojo;


import com.kuka.common.Util;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
public class User {
    private int id;
    private String name;
    private byte sex;
    private int userID;
    private String pwdLogin;
    private String userName;
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPwdLogin() {
        return pwdLogin;
    }

    public void setPwdLogin(String pwdLogin) {
        this.pwdLogin = pwdLogin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String toString(){
        return Util.objectToJson(this);
    }
}
