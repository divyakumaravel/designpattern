package com.example.designpatterns.factoryMethodPattern;

public class JSONMessageCreator extends MessageFactory{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
