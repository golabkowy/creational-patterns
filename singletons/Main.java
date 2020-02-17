package singletons;


import singletons.implementations.EagerInitializedSingleton;
import singletons.implementations.LazyInitializedSingleton;
import singletons.implementations.StaticBlockSingleton;
import singletons.implementations.ThreadSafeSingleton;

public class Main {
    public static void main(String[] args) {
        EagerInitializedSingleton eagerInstance = EagerInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInstance = LazyInitializedSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingletonDouble = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
    }
}
