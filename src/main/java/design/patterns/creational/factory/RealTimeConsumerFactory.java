package design.patterns.creational.factory;

public class RealTimeConsumerFactory extends ConsumerFactory{
    @Override
    protected Consumer createConsumer(final int id) {
        return new RealTimeConsumer(id, "abc");
    }
}
