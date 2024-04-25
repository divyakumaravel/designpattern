package com.example.designpatterns.behavioralPattern.statePattern;

public class Delivered implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway to rollback transaction ...");
        System.out.println("Contacting delivery agent deliver the product to hub");
        return 50;
    }
}
