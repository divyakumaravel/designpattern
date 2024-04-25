package com.example.designpatterns.behavioralPattern.observerPattern;

public class OrderQuantityObserver implements OrderObserver {
    @Override
    public void updated(Order order) {
        int quantity = order.getCount();
        order.setShippingCost(quantity * 5);
    }
}
