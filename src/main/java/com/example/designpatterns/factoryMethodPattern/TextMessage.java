package com.example.designpatterns.factoryMethodPattern;

public class TextMessage extends Message{
    @Override
    public String getContent() {
        return "Text";
    }
}
