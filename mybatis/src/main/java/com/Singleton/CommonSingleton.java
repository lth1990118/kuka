package com.Singleton;

import java.util.concurrent.atomic.AtomicReference;

public class CommonSingleton {
    private static CommonSingleton INSTANCE;
    private static Object obj = 1;

    private CommonSingleton() {
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static CommonSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (obj) {
                if (INSTANCE == null) {
                    INSTANCE = new CommonSingleton();
                }
            }
        }
        return INSTANCE;
    }
}

