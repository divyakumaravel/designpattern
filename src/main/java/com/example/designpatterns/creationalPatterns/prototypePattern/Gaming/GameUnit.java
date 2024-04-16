package com.example.designpatterns.creationalPatterns.prototypePattern.Gaming;

import javafx.geometry.Point3D;

/*
* Cloneable marker interface have to be used inorder to clone
* Marker interface  is an interface that doesn't have any methods or constants inside it
* You can either do shallow or deep copy
* Shallow copy: Shallow Copy stores the references of objects to the original memory address.
* Deep copy: Deep copy stores copies of the object’s value.
* Shallow copy is faster than the deep copy
 * */
public abstract class GameUnit implements Cloneable {
    private Point3D position;

    public GameUnit() {
        this.position = new Point3D(0, 0, 0);
    }

    public GameUnit(float x, float y, float z) {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        //Since Point3D is immuable we do a shallow copy
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }

    public void initialize() {
        reset();
        this.position = new Point3D(0, 0, 0);
    }

    public abstract void reset();

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        try {
            GameUnit clone = (GameUnit) super.clone();
            clone.initialize();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }
}
