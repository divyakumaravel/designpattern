package com.example.designpatterns.prototypePattern.Gaming;

public class Swordsman extends GameUnit {
    private String state = "idle";

    public void attack() {
        state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman " + state + " at " + getPosition();
    }

    @Override
    public void reset() {
        state = "idle";
    }
}
