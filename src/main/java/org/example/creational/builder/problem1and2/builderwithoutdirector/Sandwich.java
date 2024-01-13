package org.example.creational.builder.problem1and2.builderwithoutdirector;

import org.example.creational.builder.problem1and2.meat.Meat;
import org.example.creational.builder.problem1and2.sauce.Sauce;

public class Sandwich {
    private Meat meat;
    private Sauce sauce;

    public Sandwich() {

    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }
}
