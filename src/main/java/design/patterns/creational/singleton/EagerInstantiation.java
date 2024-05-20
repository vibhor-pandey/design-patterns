package design.patterns.creational.singleton;

public class EagerInstantiation {

    private static final EagerInstantiation instance = new EagerInstantiation();

    private EagerInstantiation() {

    }

    public static EagerInstantiation getInstance() {
        return instance;
    }
}
