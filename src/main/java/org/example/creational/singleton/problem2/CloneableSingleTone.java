package org.example.creational.singleton.problem2;

public class CloneableSingleTone implements Cloneable {
    private static CloneableSingleTone conn;

    private CloneableSingleTone() {

    }

    public static CloneableSingleTone getInstance() {
        if (conn == null) {
            conn = new CloneableSingleTone();
        }
        return conn;
    }

    @Override
    public CloneableSingleTone clone() {
        try {
            return (CloneableSingleTone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
