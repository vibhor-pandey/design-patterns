package design.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        //Singleton with Eager Instantiation
        final EagerInstantiation instance1 = EagerInstantiation.getInstance();
        final EagerInstantiation instance2 = EagerInstantiation.getInstance();

        System.out.println(instance2 + ", " + instance1);

        //Singleton with Lazy Instantiation
        final LazyInstantiation lazyInstance1 = LazyInstantiation.getInstance();
        final LazyInstantiation lazyInstance2 = LazyInstantiation.getInstance();

        System.out.println(lazyInstance1 + ", " + lazyInstance2);

        //Singleton with ThreadSafe Instantiation
        final ThreadSafeInstantiation instance = ThreadSafeInstantiation.getInstance();
        System.out.println(instance);

        //Singleton class instantiation with Holder Class
        final InstanceHolder instanceHolder = InstanceHolder.getInstance();
        System.out.println(instance);
    }
}
