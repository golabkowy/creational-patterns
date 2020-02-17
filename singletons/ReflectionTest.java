package singletons;

import singletons.implementations.LazyInitializedSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInitializedSingleton2; // null by default

        Constructor<LazyInitializedSingleton> singletonConstructors = LazyInitializedSingleton.class.getDeclaredConstructor();
        singletonConstructors.setAccessible(true);
        lazyInitializedSingleton2 = singletonConstructors.newInstance();

        // BENG!
        //And we have two separate instances of singleton ;)
        System.out.println(lazyInitializedSingleton1.toString());
        System.out.println(lazyInitializedSingleton2.toString());


    }
}
