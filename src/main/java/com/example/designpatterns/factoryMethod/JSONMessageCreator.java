package com.example.designpatterns.factoryMethod;

public class JSONMessageCreator extends MessageFactory{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
