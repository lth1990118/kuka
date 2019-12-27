package com.Singleton;

import java.util.concurrent.atomic.AtomicReference;

public class CASSingleton {
    private static final AtomicReference INSTANCE = new AtomicReference();

    private CASSingleton() {
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static CASSingleton getInstance() {
        while (true){
            CASSingleton singleton = (CASSingleton) INSTANCE.get();
            if (null != singleton) {
                return singleton;
            }
            singleton = new CASSingleton();
            if (INSTANCE.compareAndSet(null, singleton)) {
                return singleton;
            }
            //return singleton;
        }
    }
}

