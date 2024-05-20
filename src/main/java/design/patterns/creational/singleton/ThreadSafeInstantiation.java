package design.patterns.creational.singleton;

public class ThreadSafeInstantiation {
    private static ThreadSafeInstantiation instance;

    private ThreadSafeInstantiation() {}

    public static ThreadSafeInstantiation getInstance() {
        if(instance == null) {
            synchronized (ThreadSafeInstantiation.class) {
                if (instance == null) {
                    instance = new ThreadSafeInstantiation();
                }
            }
        }
        return instance;
    }
}
