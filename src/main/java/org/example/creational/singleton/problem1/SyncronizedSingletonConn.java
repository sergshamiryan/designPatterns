package org.example.creational.singleton.problem1;

public class SyncronizedSingletonConn {
    private static SyncronizedSingletonConn conn;

    private SyncronizedSingletonConn() {

    }

    public static synchronized SyncronizedSingletonConn getInstance() {
        if (conn == null) {
            conn = new SyncronizedSingletonConn();
        }
        return conn;
    }
}
