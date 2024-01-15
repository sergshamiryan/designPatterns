package org.example.creational.factoryMethod.headfirst.factory;

public abstract class Pizza {
    protected String name;

    public void prepare() {
        System.out.println("Preparing: " + name);
    }
}
