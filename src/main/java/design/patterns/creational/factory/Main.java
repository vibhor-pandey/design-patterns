package design.patterns.creational.factory;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Consumer lazyConsumer = new LazyConsumerFactory().create(1);
        Consumer rtConsumer = new RealTimeConsumerFactory().create(2);
        lazyConsumer.consume("I'm Lazy");
        rtConsumer.consume("I'm Fast");
    }
}
