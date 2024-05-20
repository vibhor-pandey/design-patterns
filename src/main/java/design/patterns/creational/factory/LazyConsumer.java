package design.patterns.creational.factory;

public class LazyConsumer extends Consumer {
    public LazyConsumer(int id, String metadata) {
        super(id, metadata);
    }

    @Override
    public String toString() {
        return id + " - Lazy Consumer";
    }

    @Override
    public void consume(String msg) throws InterruptedException {
        for (int i = 1; i < 10; i++) {
            Thread.sleep(100);
            System.out.println(i + ". " + msg);
        }
    }
}
