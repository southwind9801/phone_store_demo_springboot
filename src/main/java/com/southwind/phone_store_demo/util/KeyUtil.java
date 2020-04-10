package com.southwind.phone_store_demo.util;

import java.util.Random;

public class KeyUtil {
    public static synchronized String createUniqueKey(){
        Random random = new Random();
        Integer key = random.nextInt(900000)+100000;
        return System.currentTimeMillis() + String.valueOf(key);
    }
}
