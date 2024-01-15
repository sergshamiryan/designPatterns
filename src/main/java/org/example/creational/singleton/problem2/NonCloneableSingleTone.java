package org.example.creational.singleton.problem2;

public class NonCloneableSingleTone implements Cloneable {
    private static NonCloneableSingleTone conn;

    private NonCloneableSingleTone() {

    }

    public static NonCloneableSingleTone getInstance() {
        if (conn == null) {
            conn = new NonCloneableSingleTone();
        }
        return conn;
    }

    @Override
    public NonCloneableSingleTone clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
