package org.example.structural.decorator;

import org.example.structural.decorator.problem1.BarbequeWrapper;
import org.example.structural.decorator.problem1.CheeseWrapper;
import org.example.structural.decorator.problem1.Margarita;
import org.example.structural.decorator.problem1.Pizza;
import org.example.structural.decorator.problem2.*;

public class Client {

    public static void main(String[] args) {
        Decorator2();
    }

    public static void Decorator1() {
        Pizza pizza = new Margarita();
        System.out.println("pizza.getDescription() = " + pizza.getDescription());
        System.out.println("pizza.getCost() = " + pizza.getCost());
        pizza = new CheeseWrapper(pizza.getDescription(), pizza);
        System.out.println("pizza.getDescription() = " + pizza.getDescription());
        System.out.println("pizza.getCost() = " + pizza.getCost());
        pizza = new BarbequeWrapper(pizza.getDescription(), pizza);
        System.out.println("pizza.getDescription() = " + pizza.getDescription());
        System.out.println("pizza.getCost() = " + pizza.getCost());
    }

    public static void Decorator2(){
        Car basicCar = new BasicCar();
        Car luxuryCar = new LuxuryCarWrapper(basicCar);
        Car sportCar = new SportCarWrapper(luxuryCar);
        Car superLuxuryCar = new SuperLuxuryCarWrapper(luxuryCar);
        superLuxuryCar.assemble();
    }
}
