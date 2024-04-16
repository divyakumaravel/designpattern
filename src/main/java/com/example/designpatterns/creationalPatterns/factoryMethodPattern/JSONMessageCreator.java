package com.example.designpatterns.creationalPatterns.factoryMethodPattern;

public class JSONMessageCreator extends MessageFactory{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
