package org.example.structural.adapter.problem1;

public class Bugatti extends Vehicle {
    private static final String BRAND = "Bugatti";

    public Bugatti() {
        super(BRAND);
    }

    @Override
    public int getSpeed() {
        return 160;
    }
}
