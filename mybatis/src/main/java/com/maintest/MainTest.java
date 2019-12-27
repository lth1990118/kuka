package com.maintest;

import com.kuka.pojo.User;

import java.util.HashMap;
import java.util.Hashtable;

public class MainTest {
    public static void main(String[] args) {
        testHasMap();
        testHasTable();
        int i=1<<5;
        int j=1>>5;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
    private static void testHasTable(){
        Hashtable hashtable=new Hashtable();
//        for (int i=0;i<10;i++) {
//            User user = new User();
//            user.setId(i);
//            hashtable.put(user,user);
//        }
//        User user2 = new User();
//        user2.setId(1);
//        hashtable.put(user2,user2);
//        //User user3 = new User();
//        user2.setId(2);
//        hashtable.put(user2,user2);
        User user=new User();
        User user3 = null;
        hashtable.put(user,user3);
        System.out.println(hashtable.toString());
    }

    private static void testHasMap(){
        HashMap hashMap=new HashMap();
//        for (int i=0;i<10;i++) {
//            User user = new User();
//            user.setId(i);
//            hashMap.put(user,user);
//        }
//        User user2 = new User();
//        user2.setId(1);
//        hashMap.put(user2,user2);

        User user3 = null;
        hashMap.put(user3,user3);
        System.out.println(hashMap.toString());
    }
}
