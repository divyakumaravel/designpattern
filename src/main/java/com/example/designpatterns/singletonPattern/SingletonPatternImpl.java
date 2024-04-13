package com.example.designpatterns.singletonPattern;

import com.example.designpatterns.singletonPattern.eagerSingleton.EagerRegistry;
import com.example.designpatterns.singletonPattern.lazySingleton.LazyRegistry;
import com.example.designpatterns.singletonPattern.lazySingleton.LazyRegistryWithoutSynch;

public class SingletonPatternImpl {

    public static void main(String[] args) {
        EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();

        System.out.println(eagerRegistry1 == eagerRegistry2);

        LazyRegistry lazyRegistry1 = LazyRegistry.getInstance();
        LazyRegistry lazyRegistry2 = LazyRegistry.getInstance();

        System.out.println(lazyRegistry1 == lazyRegistry2);

        LazyRegistryWithoutSynch lazyRegistryWithoutSynch1 = LazyRegistryWithoutSynch.getInstance();
        LazyRegistryWithoutSynch lazyRegistryWithoutSynch2 = LazyRegistryWithoutSynch.getInstance();

        System.out.println(lazyRegistryWithoutSynch1 == lazyRegistryWithoutSynch2);
    }
}
