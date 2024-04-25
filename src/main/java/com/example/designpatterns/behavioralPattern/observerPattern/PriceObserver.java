package com.example.designpatterns.behavioralPattern.observerPattern;

public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double itemCost = order.getItemCost();
        if (itemCost >= 200) {
            order.setDiscount(10);
        }
        if (itemCost >= 300) {
            order.setDiscount(20);
        }
    }
}
