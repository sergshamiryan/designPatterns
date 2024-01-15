package org.example.creational.factoryMethod.headfirst.abstractFactory;

public class NYCPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "Cheese" -> new CheesePizza();
            case "Peperoni" -> new PeperoniPizza();
            default -> throw new UnsupportedOperationException(type + " not supported");
        };
    }
}
