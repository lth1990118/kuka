package com.proxy;

public class ProxyService {
    private IProxy proxy;
    public ProxyService(IProxy proxy){
        this.proxy=proxy;
    }
    public void doProxy(){
        System.out.println("doProxy 前");
        proxy.save();
        System.out.println("doProxy 后");
    }
}
