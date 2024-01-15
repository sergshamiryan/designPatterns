package org.example.creational.factoryMethod.headfirst.abstractFactory;

public class Client {
    public static void main(String[] args) {

    }

    public void testAbstractFactory() {
        PizzaStore pizzaStore = new NYCPizzaStore();
        pizzaStore.orderPizza("Peperoni");
    }
}
