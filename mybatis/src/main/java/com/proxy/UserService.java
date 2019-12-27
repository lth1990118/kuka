package com.proxy;

public class UserService implements IProxy {
    public void save() {
        System.out.println("save 方法");
    }
}
