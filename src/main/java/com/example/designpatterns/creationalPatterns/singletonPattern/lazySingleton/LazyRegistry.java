package com.example.designpatterns.creationalPatterns.singletonPattern.lazySingleton;

/*
 * Singleton type where an instance is created when the user creates it.
 * */
public class LazyRegistry {

    /* Volatile: Does read and write operation in main memory
     * instead of cache memory
     */
    private static volatile LazyRegistry INSTANCE;

    private LazyRegistry() {
    }

    public static LazyRegistry getInstance() {
        if (INSTANCE == null) {
            /* When two threads execute simultaneously one thread gets into
             * execution while other waits in line 19
             */
            synchronized (LazyRegistry.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistry();
                }
            }
        }
        return INSTANCE;
    }

}
