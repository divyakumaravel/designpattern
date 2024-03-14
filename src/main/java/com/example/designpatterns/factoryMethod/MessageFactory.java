package com.example.designpatterns.factoryMethod;

public abstract class MessageFactory {

    public Message getMessage() {
        Message message = createMessage();

        message.addDefaultHeader();
        message.encrypt();

        return message;
    }

    //Factory Method
    public  abstract Message createMessage();
}
