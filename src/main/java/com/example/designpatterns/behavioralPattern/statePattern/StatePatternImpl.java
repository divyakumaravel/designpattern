package com.example.designpatterns.behavioralPattern.statePattern;

/*
 * Allows objects to behave differently based on the current state internal state
 * Allows us to define the state specific behaviors in a separate class
 * Operations called on the main class is delegated to the current state objects implementation
 * of that object
 * State transitions can be triggered by the states themselves in which case each state
 * knows about at least one other state's existence
 * Benefit: we can add new states and their new behaviors without changes in the
 * main class
 * */
public class StatePatternImpl {
    public static void main(String[] args) {
        Order order = new Order();
        double cancel = order.cancel();
        System.out.println(cancel);

        Order nextOrder = new Order();
        nextOrder.paymentSuccessful();
        nextOrder.dispatched();
        cancel = nextOrder.cancel();
        System.out.println(cancel);
    }
}
