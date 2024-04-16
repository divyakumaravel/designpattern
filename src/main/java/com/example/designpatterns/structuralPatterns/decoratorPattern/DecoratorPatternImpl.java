package com.example.designpatterns.structuralPatterns.decoratorPattern;

/*
 * Used when we want to enhance behaviour of our existing object dynamically and when required
 * */
public class DecoratorPatternImpl {
    public static void main(String[] args) {
        Message message = new TextMessage("This is <Divya>");
        System.out.println(message.getContent());

        Message htmlDecorator = new HtmlEncodedMessage(message);
        System.out.println(htmlDecorator.getContent());

        htmlDecorator = new Base64EncodedMessage(htmlDecorator);
        System.out.println(htmlDecorator.getContent());

        Message base64Decorator = new Base64EncodedMessage(message);
        System.out.println(base64Decorator.getContent());
    }
}
