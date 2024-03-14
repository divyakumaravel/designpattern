package com.example.designpatterns.SimpleFactory;
/*
* Simple factory -> Instantiating objects extending from a parent class
*  based on a parameter using a static method.
* */
public class SimpleFactoryImpl {
    public static void main(String[] args) throws ClassNotFoundException {
        Vehicle vehicle = VehicleFactory.createVehicle(Type.AIR);
        System.out.println(vehicle);
    }
}
