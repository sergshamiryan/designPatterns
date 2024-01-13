package org.example.structural.decorator.myproblem;

public class Client {

    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        SmartPhoneDecorator smartPhoneDecorator = new SmartPhoneDecorator(basicPhone);
        smartPhoneDecorator.sendMessage();
        smartPhoneDecorator.call();
        smartPhoneDecorator.playMusic();
    }
}
