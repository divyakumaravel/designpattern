package com.example.designpatterns.creationalPatterns.factoryMethodPattern;

public class TextMessage extends Message{
    @Override
    public String getContent() {
        return "Text";
    }
}
