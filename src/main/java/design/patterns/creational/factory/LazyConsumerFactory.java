package design.patterns.creational.factory;

public class LazyConsumerFactory extends ConsumerFactory{
    @Override
    protected Consumer createConsumer(int id) {
        return new LazyConsumer(id, "pqr");
    }
}
