package com.example.designpatterns.behavioralPattern.strategyPattern;

import java.util.LinkedList;

public class PrintService {

    private OrderPrinter orderPrinter;

    public PrintService(OrderPrinter orderPrinter) {
        this.orderPrinter = orderPrinter;
    }

    public void printOrders(LinkedList<Order> orders) {
        orderPrinter.print(orders);
    }
}
