public class MainAdapterPattern {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGatewayAdapter("PayPal");
        paymentGateway.processPayment("PayPal");

        paymentGateway = new PaymentGatewayAdapter("Stripe");
        paymentGateway.processPayment("Stripe");
    }
}
