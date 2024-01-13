package org.example.creational.builder.problem1and2.builderwithdirector;

public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public void createSandwich() {
        sandwich = new Sandwich();
    }

    public Sandwich getSandwich() {
        return sandwich;
    }

    public abstract void buildMeat();

    public abstract void buildSauce();

    public abstract void buildDelivery();
}
