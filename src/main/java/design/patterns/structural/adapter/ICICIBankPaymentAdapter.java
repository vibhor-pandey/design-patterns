package design.patterns.structural.adapter;

public class ICICIBankPaymentAdapter {

    public String initiatePayment() throws InterruptedException {
        System.out.println("ICICI Bank Payment Started");
        for(int i = 0; i < 15; i++) {
            Thread.sleep(1000);
            System.out.print(".");
        }
        return "Completed";
    }

    public void isCompleted(int id) {
        System.out.print("Payment with Txn ID - ICICI" + id + " is Completed Successfully");
    }
}
