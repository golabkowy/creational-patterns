package singletons.implementations;

public final class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    //static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
