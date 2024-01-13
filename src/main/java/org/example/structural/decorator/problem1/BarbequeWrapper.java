package org.example.structural.decorator.problem1;

public class BarbequeWrapper extends Pizza {

    private final Pizza pizza;

    public BarbequeWrapper(String description,
                           Pizza pizza) {
        super("Barbeque Topping");
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 5 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.description + " ,Barbeque Topping";
    }
}
