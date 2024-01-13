package org.example.structural.decorator.myproblem;

public class BasicPhone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling without video");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending plain text");
    }
}
