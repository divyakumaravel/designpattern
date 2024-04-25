package com.example.designpatterns.behavioralPattern.observerPattern;

/*
 * Notify multiple objects whenever an object changes state
 * This design pattern is also called publisher-subscriber
 * one-to-many dependency between objects, many objects listening
 * to the state change of a single object without tightly coupling all of
 * them together
 *  */
public class ObserverPatternImpl {

    public static void main(String[] args) {
        Order order = new Order("10");
        PriceObserver priceObserver = new PriceObserver();
        OrderObserver orderObserver = new OrderQuantityObserver();

        order.attach(priceObserver);
        order.attach(orderObserver);

        order.addItem(50);

        System.out.println(order);

        order.detach(orderObserver);

        order.addItem(100);

        System.out.println(order);
    }
}
