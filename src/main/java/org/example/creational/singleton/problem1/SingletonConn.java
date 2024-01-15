package org.example.creational.singleton.problem1;

public class SingletonConn {
    private static SingletonConn conn;

    private SingletonConn() {

    }

    public static SingletonConn getInstance() {
        if (conn == null) {
            conn = new SingletonConn();
        }
        return conn;
    }
}
