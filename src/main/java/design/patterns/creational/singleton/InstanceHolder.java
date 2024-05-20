package design.patterns.creational.singleton;

public class InstanceHolder {

    private InstanceHolder() {}

    private static final class INSTANCE_HOLDER {
        public static final InstanceHolder INSTANCE = new InstanceHolder();
    }

    public static InstanceHolder getInstance() {
        return INSTANCE_HOLDER.INSTANCE;
    }
}
