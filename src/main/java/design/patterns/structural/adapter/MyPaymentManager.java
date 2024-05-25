package design.patterns.structural.adapter;

import design.patterns.structural.adapter.model.Payment;

public class MyPaymentManager implements PaymentManager {

    @Override
    public void initiatePayment(String bank) throws InterruptedException {
        if(bank.equalsIgnoreCase(AXIS_BANK)) {
            AxisBankPaymentAdapter adapter = new AxisBankPaymentAdapter();
            adapter.initiatePayment();
        } else if (bank.equalsIgnoreCase(ICICI_BANK)) {
            ICICIBankPaymentAdapter adapter = new ICICIBankPaymentAdapter();
            String result = adapter.initiatePayment();
            System.out.print(result);
        }
    }

    @Override
    public boolean isSuccessfulPayment(int paymentId, String bank) {
        return false;
    }
}
