package singletons.implementations;

public final class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    //classic
    public static synchronized ThreadSafeSingleton getInstance() {
        return instance == null ? new ThreadSafeSingleton() : instance;
    }

    //Or with better performance - double checked locking version
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
