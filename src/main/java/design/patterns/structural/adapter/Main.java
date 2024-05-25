package design.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PaymentManager manager = new MyPaymentManager();
        manager.initiatePayment("axis");
        manager.initiatePayment("icici");
    }
}
