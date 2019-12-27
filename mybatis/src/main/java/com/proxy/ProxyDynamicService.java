package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDynamicService {
    private IProxy _target;
    public ProxyDynamicService(IProxy target){
        this._target=target;
    }

    public Object getPorxyInstance(){
        return Proxy.newProxyInstance(
                _target.getClass().getClassLoader(),
                _target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("ProxyDynamic之前");
                        //执行目标对象方法
                        Object returnValue = method.invoke(_target, args);
                        System.out.println("ProxyDynamic之后");
                        return returnValue;
                    }
                }
        );
    }
}
