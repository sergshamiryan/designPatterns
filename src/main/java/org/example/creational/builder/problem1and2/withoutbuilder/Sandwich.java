package org.example.creational.builder.problem1and2.withoutbuilder;

import org.example.creational.builder.problem1and2.meat.Meat;
import org.example.creational.builder.problem1and2.sauce.Sauce;

public class Sandwich {
    private Meat meat;
    private Sauce sauce;

    public Sandwich(Meat meat, Sauce sauce) {
        this.meat = meat;
        this.sauce = sauce;
    }

    public Meat getMeat() {
        return meat;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }
}
