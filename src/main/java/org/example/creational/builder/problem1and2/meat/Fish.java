package org.example.creational.builder.problem1and2.meat;

import org.example.creational.builder.problem1and2.builderwithoutdirector.Ingredient;

public class Fish extends Ingredient implements Meat {

    public Fish(String name) {
        super("Fish");
    }
}
