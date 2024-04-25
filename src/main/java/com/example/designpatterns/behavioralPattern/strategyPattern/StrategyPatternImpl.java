package com.example.designpatterns.behavioralPattern.strategyPattern;

import java.util.LinkedList;

/*
 * This patterns allows us to encapsulate an algorithm in a class.
 * Helpful when we have many possible variations to an algorithm.
 * */
public class StrategyPatternImpl {

    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        createOrders();
        PrintService printService = new PrintService(new SummaryPrinter());
        printService.printOrders(orders);
        PrintService printService1 = new PrintService(new DetailedPrinter());
        printService1.printOrders(orders);
    }

    private static void createOrders() {
        Order order = new Order("100");
        order.addItem("Soda", 2D);
        order.addItem("Chips", 20D);
        orders.add(order);
    }
}
