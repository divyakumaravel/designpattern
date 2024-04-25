package com.example.designpatterns.behavioralPattern.statePattern;

public class InTransit implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway to rollback transaction ...");
        System.out.println("Contacting delivery agent to rollback delivery");
        return 20;
    }
}
