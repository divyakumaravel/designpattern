package com.example.designpatterns.creationalPatterns.singletonPattern.lazySingleton;

public class LazyRegistryWithoutSynch {
    private LazyRegistryWithoutSynch() {
    }

    public static LazyRegistryWithoutSynch getInstance() {
        return RegistryHolder.INSTANCE;
    }

    private static class RegistryHolder {
        static LazyRegistryWithoutSynch INSTANCE = new LazyRegistryWithoutSynch();
    }
}
