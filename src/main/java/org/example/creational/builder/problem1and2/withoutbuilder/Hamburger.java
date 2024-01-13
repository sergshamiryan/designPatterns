package org.example.creational.builder.problem1and2.withoutbuilder;

import org.example.creational.builder.problem1and2.meat.Beef;
import org.example.creational.builder.problem1and2.sauce.Mayonnaise;

public class Hamburger {
    private Sandwich sandwich;

    public Hamburger() {
        sandwich = new Sandwich(new Beef(), new Mayonnaise());
    }
}
