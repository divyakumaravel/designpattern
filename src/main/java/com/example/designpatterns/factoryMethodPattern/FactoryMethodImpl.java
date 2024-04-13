package com.example.designpatterns.factoryMethodPattern;

/*
* Move object creation logic to a different class.
* Unlike Simple factory method here we do not know in advance which class we
* may need to instantiate and also to allow new classes to be added to system and handle their
* creating without affecting client code.
* Contains Creator, Product, ConcreteCreator and ConcreteProduct
* */
public class FactoryMethodImpl {
    public static void main(String[] args) {
        System.out.println(new TextMessageCreator().getMessage());
        System.out.println(new JSONMessageCreator().getMessage());
    }
}
