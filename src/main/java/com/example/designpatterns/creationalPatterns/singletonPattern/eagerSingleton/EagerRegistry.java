package com.example.designpatterns.creationalPatterns.singletonPattern.eagerSingleton;

/*
 * Type of singleton where an instance is created when the class loads
 * */
public class EagerRegistry {

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry() {
    }

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}
