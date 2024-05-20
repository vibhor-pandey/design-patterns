package design.patterns.creational.factory;

public class RealTimeConsumer extends Consumer {
    public RealTimeConsumer(int id, String metadata) {
        super(id, metadata);
    }

    public String toString() {
        return id + " - Real-Time Consumer";
    }

    @Override
    public void consume(String msg) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + ". " + msg);
        }
    }
}
