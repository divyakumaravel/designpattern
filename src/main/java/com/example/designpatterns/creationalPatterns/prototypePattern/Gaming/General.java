package com.example.designpatterns.creationalPatterns.prototypePattern.Gaming;

public class General extends GameUnit {
    private String state = "idle";

    public void boostMorale() {
        this.state = "morale boost";
    }

    @Override
    public String toString() {
        return "General " + state + " at " + getPosition();
    }

    @Override
    public void reset() {
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Reset not supported");
    }
}
