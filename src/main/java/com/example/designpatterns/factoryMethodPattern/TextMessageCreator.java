package com.example.designpatterns.factoryMethodPattern;

public class TextMessageCreator extends MessageFactory{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
