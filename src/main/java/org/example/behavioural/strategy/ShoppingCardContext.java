package org.example.behavioural.strategy;

import java.util.List;

public class ShoppingCardContext {
    private List<Item> items;

    public ShoppingCardContext(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateSum() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateSum();
        paymentStrategy.pay(amount);
    }
}
