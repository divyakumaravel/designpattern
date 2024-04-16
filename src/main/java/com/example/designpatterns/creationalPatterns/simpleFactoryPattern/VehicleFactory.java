package com.example.designpatterns.creationalPatterns.simpleFactoryPattern;

public class VehicleFactory {
    public static Vehicle createVehicle(Type type) throws ClassNotFoundException {
        return switch (type) {
            case AIR -> new Airways();
            case ROAD -> new Roadways();
            case WATER -> new Waterways();
        };
    }
}
