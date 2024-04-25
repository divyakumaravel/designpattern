package com.example.designpatterns.behavioralPattern.statePattern;

public class New implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Its a new order, no processing required");
        return 0;
    }
}
