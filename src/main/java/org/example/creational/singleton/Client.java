package org.example.creational.singleton;

import org.example.creational.singleton.problem1.SingletonConn;
import org.example.creational.singleton.problem2.CloneableSingleTone;

public class Client {

    public static void main(String[] args) {
      
    }

    public static void singleTon1() {
        SingletonConn singletonConn = SingletonConn.getInstance();
        System.out.println(singletonConn);
        SingletonConn singletonConn2 = SingletonConn.getInstance();
        System.out.println(singletonConn2);
    }

    public static void testCloneable() {
        CloneableSingleTone singletonConn = CloneableSingleTone.getInstance();
        System.out.println(singletonConn);
        CloneableSingleTone singletonConn2 = CloneableSingleTone.getInstance();
        System.out.println(singletonConn2);
        CloneableSingleTone singletonConn3 = singletonConn.clone();
        System.out.println(singletonConn3);
    }

}
