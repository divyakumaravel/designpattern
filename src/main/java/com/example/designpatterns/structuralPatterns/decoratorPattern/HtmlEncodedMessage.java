package com.example.designpatterns.structuralPatterns.decoratorPattern;


import org.apache.commons.text.StringEscapeUtils;

public class HtmlEncodedMessage implements Message {

    private final Message message;

    public HtmlEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(message.getContent());
    }
}
