package org.example.creational.builder.problem1and2.builderwithoutdirector;

/*Non Builder pattern participating interface, just for printing names*/
public abstract class Ingredient {
    private final String name;

    public Ingredient(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
