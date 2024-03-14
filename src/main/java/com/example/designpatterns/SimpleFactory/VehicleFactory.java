package com.example.designpatterns.SimpleFactory;

import static com.example.designpatterns.SimpleFactory.Type.AIR;

public class VehicleFactory {
    public static Vehicle createVehicle(Type type) throws ClassNotFoundException {
        return switch (type) {
            case AIR -> new Airways();
            case ROAD -> new Roadways();
            case WATER -> new Waterways();
        };
    }
}
