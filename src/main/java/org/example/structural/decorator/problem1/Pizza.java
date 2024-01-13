package org.example.structural.decorator.problem1;

public abstract class Pizza {
    private int cost;
    String description = "Basic Pizza";

    public Pizza(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}
