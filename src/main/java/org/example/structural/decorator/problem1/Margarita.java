package org.example.structural.decorator.problem1;

public class Margarita extends Pizza {

    public Margarita() {
        super("Margarita");
    }

    @Override
    public int getCost() {
        return 20;
    }
}
