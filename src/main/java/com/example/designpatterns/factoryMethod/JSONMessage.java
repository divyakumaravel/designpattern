package com.example.designpatterns.factoryMethod;

public class JSONMessage extends Message{
    @Override
    public String getContent() {
        return "JSON";
    }
}
