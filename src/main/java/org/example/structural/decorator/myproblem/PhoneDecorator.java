package org.example.structural.decorator.myproblem;

public class PhoneDecorator implements Phone {
    private final Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
    }

    @Override
    public void sendMessage() {
        phone.sendMessage();
    }
}
