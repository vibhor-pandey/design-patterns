package design.patterns.structural.adapter;

import design.patterns.structural.adapter.model.Payment;

public interface PaymentManager {

    String AXIS_BANK = "AXIS";
    String ICICI_BANK = "ICICI";


    void initiatePayment(String bank) throws InterruptedException;

    boolean isSuccessfulPayment(int paymentId, final String bank);
}
