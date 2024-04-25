package com.example.designpatterns.behavioralPattern.strategyPattern;

import java.util.Collection;

public class SummaryPrinter implements OrderPrinter {
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("******* Summary Report **********");
    }
}
