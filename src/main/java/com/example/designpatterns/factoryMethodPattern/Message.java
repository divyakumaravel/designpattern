package com.example.designpatterns.factoryMethodPattern;

public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeader() {
        // adds headers
    }

    public void encrypt() {
        //Encryption logic
    }
}
