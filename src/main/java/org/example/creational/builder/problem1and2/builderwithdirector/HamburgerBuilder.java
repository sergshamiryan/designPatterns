package org.example.creational.builder.problem1and2.builderwithdirector;

import org.example.creational.builder.problem1and2.delivery.TakeAway;
import org.example.creational.builder.problem1and2.meat.Beef;
import org.example.creational.builder.problem1and2.sauce.Mayonnaise;

public class HamburgerBuilder extends SandwichBuilder {

    @Override
    public void buildMeat() {
        sandwich.setMeat(new Beef());
    }

    @Override
    public void buildSauce() {
        sandwich.setSauce(new Mayonnaise());
    }

    @Override
    public void buildDelivery() {
        sandwich.setDelivery(new TakeAway());
    }
}
