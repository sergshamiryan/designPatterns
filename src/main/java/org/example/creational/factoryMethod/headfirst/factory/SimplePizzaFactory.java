package org.example.creational.factoryMethod.headfirst.factory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        return switch (type) {
            case "Cheese" -> new CheesePizza();
            case "Peperoni" -> new PeperoniPizza();
            default -> throw new UnsupportedOperationException(type + " not supported");
        };
    }
}
