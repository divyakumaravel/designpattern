package com.example.designpatterns.factoryMethod;

public class TextMessageCreator extends MessageFactory{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
