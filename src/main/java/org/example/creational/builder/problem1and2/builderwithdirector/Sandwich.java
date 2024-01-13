package org.example.creational.builder.problem1and2.builderwithdirector;

import org.example.creational.builder.problem1and2.delivery.Delivery;
import org.example.creational.builder.problem1and2.meat.Meat;
import org.example.creational.builder.problem1and2.sauce.Sauce;

public class Sandwich {
    private Meat meat;
    private Sauce sauce;
    private Delivery delivery;

    public Sandwich() {

    }

    public Sandwich(Meat meat, Sauce sauce) {
        this.meat = meat;
        this.sauce = sauce;
    }

    public void printDeliveryType(){
        this.delivery.deliver();
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }
}
