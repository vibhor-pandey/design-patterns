package design.patterns;


import design.patterns.creational.builder.Order;
import design.patterns.creational.builder.Payment;
import design.patterns.creational.builder.Transaction;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Transactions using Builder Pattern
        final Transaction upiTnx = Transaction.builder()
                .transactionId(123)
                .status("SUCCESS")
                .transactionType("UPI")
                .build();

        final Transaction walletTnx = Transaction.builder()
                .transactionId(456)
                .status("SUCCESS")
                .transactionType("WALLET")
                .build();

        // Create Payment using Builder Pattern
        List<Transaction> transactions = Arrays.asList(upiTnx, walletTnx);
        final Payment payment = Payment.builder()
                .paymentId(1122)
                .amount("300")
                .paymentType("XYZ")
                .transactions(transactions)
                .build();

        // Create Order using Builder Pattern
        final Order order = Order.builder()
                .orderId(10001)
                .payment(payment)
                .userId(101)
                .build();


        System.out.println(order.toString());
    }
}