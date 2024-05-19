package design.patterns.creational.builder;

public class Transaction {
    private final int transactionId;
    private final String transactionType;
    private final String status ;

    private Transaction(final TransactionBuilder builder) {
        this.transactionId = builder.transactionId;
        this.transactionType = builder.transactionType;
        this.status = builder.status;
    }

    public static TransactionBuilder builder() {
        return new TransactionBuilder();
    }

    public static class TransactionBuilder {
        private int transactionId;
        private String transactionType;
        private String status;

        public TransactionBuilder() {}

        public TransactionBuilder transactionId(int transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public TransactionBuilder transactionType(String type) {
            this.transactionType = type;
            return this;
        }

        public TransactionBuilder status(String status) {
            this.status = status;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }

    public String toString() {
        return "\n---- ID:" + this.transactionId +
                "\n---- Type: " + this.transactionType +
                "\n---- Status: " + this.status;
    }
}

