package org.example.creational.factoryMethod.headfirst.factory;

import org.example.creational.factoryMethod.headfirst.factory.Pizza;
import org.example.creational.factoryMethod.headfirst.factory.PizzaStore;
import org.example.creational.factoryMethod.headfirst.factory.SimplePizzaFactory;

public class Client {
    public static void main(String[] args) {

    }

    public void testFactory(){
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("Peperoni");
    }
}
