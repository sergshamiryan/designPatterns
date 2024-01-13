package org.example.structural.decorator.problem1;

public class Pepperoni extends Pizza {

    public Pepperoni() {
        super("Pepperoni");
    }

    @Override
    public int getCost() {
        return 30;
    }
}
