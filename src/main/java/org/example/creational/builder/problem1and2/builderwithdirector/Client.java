package org.example.creational.builder.problem1and2.builderwithdirector;

public class Client {

    public static void Builder() {
        SandwichBuilder sandwichBuilder = new HamburgerBuilder();
        SandwichDirector sandwichDirector = new SandwichDirector(sandwichBuilder);
        sandwichDirector.buildSandwich();
        sandwichDirector.getSandwich().printDeliveryType();
        System.out.println("Created");
    }

    public static void main(String[] args) {
        Builder();
    }
}
