package design.patterns.creational.builder;

public class Order {
    private final int orderId;
    private final int userId;
    private final Payment payment;

    private Order(final OrderBuilder builder) {
        this.orderId = builder.orderId;
        this.userId = builder.userId;
        this.payment = builder.payment;
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder {
        private int orderId;
        private int userId;
        private Payment payment;

        public Order build() {
            return new Order(this);
        }

        public OrderBuilder orderId(final int id) {
            this.orderId = id;
            return this;
        }

        public OrderBuilder userId(final int id) {
            this.userId = id;
            return this;
        }

        public OrderBuilder payment(final Payment payment) {
            this.payment = payment;
            return this;
        }
    }

    public String toString() {
        return "Order" +
                "\n- ID:" + this.orderId +
                "\n- UserId: " + this.userId +
                "\n- Payment: " + this.payment.toString();
    }
}
