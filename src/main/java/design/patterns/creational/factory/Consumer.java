package design.patterns.creational.factory;

public abstract class Consumer {
    protected final int id;
    protected final String metadata;

    public Consumer(final int id, final String metadata) {
        this.id = id;
        this.metadata = metadata;
    }

    public abstract String toString();

    protected abstract void consume(String msg) throws InterruptedException;
}
