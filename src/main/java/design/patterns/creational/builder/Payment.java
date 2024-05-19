package design.patterns.creational.builder;

import java.util.List;

public class Payment {
    private final int paymentId;
    private final String paymentType;
    private final String amount;
    private final  List<Transaction> transactions;

    private Payment(final PaymentBuilder builder) {
        this.paymentId = builder.paymentId;
        this.paymentType = builder.paymentType;
        this.amount = builder.amount;
        this.transactions = builder.transactions;
    }

    public static PaymentBuilder builder() {
        return new PaymentBuilder();
    }

    public static class PaymentBuilder {
        private int paymentId;
        private String paymentType;
        private String amount;
        private List<Transaction> transactions;

        public PaymentBuilder() {}

        public PaymentBuilder paymentId(final int id) {
            this.paymentId = id;
            return this;
        }

        public PaymentBuilder paymentType(final String type) {
            this.paymentType = type;
            return this;
        }

        public PaymentBuilder amount(final String amt) {
            this.amount = amt;
            return this;
        }

        public PaymentBuilder transactions(List<Transaction> txns) {
            this.transactions = txns;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }

    public String toString() {
        return "\n-- ID:" + this.paymentType +
                "\n-- Type: " + this.paymentType +
                "\n-- Amount: " + this.amount +
                "\n-- Transaction: " + this.transactions.toString();

    }
}
