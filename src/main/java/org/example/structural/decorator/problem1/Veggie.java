package org.example.structural.decorator.problem1;

public class Veggie extends Pizza {

    public Veggie() {
        super("Veggie");
    }

    @Override
    public int getCost() {
        return 40;
    }
}
