package org.example.creational.builder.problem1and2.builderwithdirector;

public class SandwichDirector {
    private final SandwichBuilder sandwichBuilder;

    public SandwichDirector(SandwichBuilder sandwichBuilder) {
        this.sandwichBuilder = sandwichBuilder;
    }

    public Sandwich getSandwich() {
        return sandwichBuilder.getSandwich();
    }

    public void buildSandwich() {
        sandwichBuilder.createSandwich();
        sandwichBuilder.buildSauce();
        sandwichBuilder.buildMeat();
        sandwichBuilder.buildDelivery();
    }
}
