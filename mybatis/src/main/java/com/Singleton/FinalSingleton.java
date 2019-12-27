package com.Singleton;

public class FinalSingleton {
    private static FinalSingleton singleton;
    public static int i=0;
    static{
        System.out.println("FinalSingleton init");
        singleton=new FinalSingleton();
    }
    public static FinalSingleton getInstance(){
        return singleton;
    }
}
