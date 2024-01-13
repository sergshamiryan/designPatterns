package org.example.structural.decorator.problem1;

public class CheeseWrapper extends ToppingWrapper {

    private final Pizza pizza;

    public CheeseWrapper(String description,
                         Pizza pizza) {
        super("Cheese Toppings");
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 5 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.description + " ,Cheese Topping";
    }
}
