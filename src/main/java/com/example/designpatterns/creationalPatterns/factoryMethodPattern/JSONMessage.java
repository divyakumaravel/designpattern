package com.example.designpatterns.creationalPatterns.factoryMethodPattern;

public class JSONMessage extends Message{
    @Override
    public String getContent() {
        return "JSON";
    }
}
