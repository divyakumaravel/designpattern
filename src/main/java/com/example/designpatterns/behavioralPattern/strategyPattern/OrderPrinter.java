package com.example.designpatterns.behavioralPattern.strategyPattern;

import java.util.Collection;

//Strategy
public interface OrderPrinter {
    void print(Collection<Order> orders);
}
