package com.example.designpatterns.creationalPatterns.factoryMethodPattern;

public class TextMessageCreator extends MessageFactory{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
