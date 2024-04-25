package com.example.designpatterns.behavioralPattern.statePattern;

public class Cancelled implements OrderState {
    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Cancelled order cannot be cancelled anymore");
    }
}
