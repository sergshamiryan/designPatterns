package org.example.behavioural.strategy;

import java.util.List;

public class Client {

    public static void main(String[] args) {

    }

    void strategy() {
        Item item = new Item("Tv", 60);
        Item item2 = new Item("PlayStation", 90);
        PaymentStrategy paymentStrategy = new PayPalStrategy("admin@bank.com", "234");
        ShoppingCardContext shoppingCardContext = new ShoppingCardContext(List.of(item, item2));
        shoppingCardContext.pay(paymentStrategy);
    }
}
