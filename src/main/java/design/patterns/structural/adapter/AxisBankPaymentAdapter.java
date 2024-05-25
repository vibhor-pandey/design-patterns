package design.patterns.structural.adapter;

import design.patterns.structural.adapter.model.Payment;

public class AxisBankPaymentAdapter {

    public void initiatePayment() throws InterruptedException {
        System.out.print("AXIS Bank Payment Started");
        for(int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.print("*");
        }
        System.out.print("Completed");
    }

    public void isCompleted(int id) {
        System.out.print("Payment with Txn ID - AXS" + id + " is Completed Successfully");
    }
}
