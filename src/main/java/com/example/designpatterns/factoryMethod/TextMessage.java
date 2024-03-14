package com.example.designpatterns.factoryMethod;

public class TextMessage extends Message{
    @Override
    public String getContent() {
        return "Text";
    }
}
