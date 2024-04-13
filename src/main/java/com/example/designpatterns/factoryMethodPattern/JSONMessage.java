package com.example.designpatterns.factoryMethodPattern;

public class JSONMessage extends Message{
    @Override
    public String getContent() {
        return "JSON";
    }
}
