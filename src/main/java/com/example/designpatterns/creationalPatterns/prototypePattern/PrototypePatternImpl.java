package com.example.designpatterns.creationalPatterns.prototypePattern;

import com.example.designpatterns.creationalPatterns.prototypePattern.Gaming.Swordsman;
import javafx.geometry.Point3D;

/*
 * Create large objects where majority of the states are unchanged between instances
 * */
public class PrototypePatternImpl {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();

        System.out.println(swordsman);

        Swordsman clone = (Swordsman) swordsman.clone();
        System.out.println(clone);
    }
}
