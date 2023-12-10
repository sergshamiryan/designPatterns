package org.example.structural.adapter.problem1;


public class Maserati extends Vehicle {
    private static final String BRAND = "Maserati";

    public Maserati() {
        super(BRAND);
    }

    @Override
    public int getSpeed() {
        return 120;
    }
}
