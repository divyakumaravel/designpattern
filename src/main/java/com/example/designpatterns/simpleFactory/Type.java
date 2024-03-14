package com.example.designpatterns.simpleFactory;

public enum Type {
    AIR("AIR"), ROAD("ROAD"), WATER("WATER");

    final String type;
    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
