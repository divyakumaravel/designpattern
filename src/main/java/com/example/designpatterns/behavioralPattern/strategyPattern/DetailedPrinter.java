package com.example.designpatterns.behavioralPattern.strategyPattern;

import java.util.Collection;

public class DetailedPrinter implements OrderPrinter {
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("******* Detailed order **********");
    }
}
