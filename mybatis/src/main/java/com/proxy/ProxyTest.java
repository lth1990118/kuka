package com.proxy;

public class ProxyTest {
    public static void main(String[] args) {

        IProxy proxy=new UserService();
        ProxyDynamicService proxyDynamicService=new ProxyDynamicService(proxy);
        IProxy proxyDynami =(IProxy) proxyDynamicService.getPorxyInstance() ;
        proxyDynami.save();
    }
    public static void ProxyService(){
        IProxy proxy=new UserService();
        ProxyService proxyService=new ProxyService(proxy);
        proxyService.doProxy();
    }
}
