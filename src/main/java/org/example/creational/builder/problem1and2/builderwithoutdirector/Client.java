package org.example.creational.builder.problem1and2.builderwithoutdirector;

public class Client {

    public static void Builder() {
        Hamburger hamburger = new Hamburger();
        hamburger.createSandwich();
        System.out.println("Created");
    }

    public static void main(String[] args) {
        Builder();
    }
}
