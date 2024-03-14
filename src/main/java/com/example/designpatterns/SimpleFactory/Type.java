package com.example.designpatterns.SimpleFactory;

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
