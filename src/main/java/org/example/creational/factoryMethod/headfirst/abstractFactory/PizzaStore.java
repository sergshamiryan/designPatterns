package org.example.creational.factoryMethod.headfirst.abstractFactory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = this.createPizza(type);
        pizza.prepare();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
