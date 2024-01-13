package org.example.creational.builder.problem1and2.builderwithoutdirector;

import org.example.creational.builder.problem1and2.meat.Beef;
import org.example.creational.builder.problem1and2.sauce.Mayonnaise;

public class Hamburger extends SandwichBuilder {

    @Override
    public void buildMeat() {
        sandwich.setMeat(new Beef());
    }

    @Override
    public void buildSauce() {
        sandwich.setSauce(new Mayonnaise());
    }
}
