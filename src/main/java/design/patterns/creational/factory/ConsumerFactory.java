package design.patterns.creational.factory;

public abstract class ConsumerFactory {

    public Consumer create(final int type) {
        Consumer consumer = createConsumer(type);
        System.out.println(consumer.toString());
        return consumer;
    }

    protected abstract Consumer createConsumer(final int id);
}
