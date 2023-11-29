package org.example.structural.adapter.problem_1;


public class Porsche extends Vehicle {

    private static final String BRAND = "Porsche";

    public Porsche() {
        super(BRAND);
    }

    @Override
    public int getSpeed() {
        return 120;
    }
}
