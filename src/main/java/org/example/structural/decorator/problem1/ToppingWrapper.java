package org.example.structural.decorator.problem1;

public abstract class ToppingWrapper extends Pizza {

    public abstract String getDescription();

    public ToppingWrapper(String description) {
        super(description);
    }
}
