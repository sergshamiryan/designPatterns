package org.example.structural.decorator.myproblem;

public class SmartPhoneDecorator extends PhoneDecorator {
    public SmartPhoneDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("Video features are ready to be enabled\n");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Ready to process images\n");
    }

    public void playMusic(){
        System.out.println("Music is playing\n");
    }
}
