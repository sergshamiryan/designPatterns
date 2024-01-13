package org.example.creational.builder.problem1and2.builderwithoutdirector;

public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public void createSandwich() {
        sandwich = new Sandwich();
    }

    public abstract void buildMeat();

    public abstract void buildSauce();
}
