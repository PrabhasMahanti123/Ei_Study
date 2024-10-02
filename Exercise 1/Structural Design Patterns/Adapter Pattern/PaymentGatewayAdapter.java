public class PaymentGatewayAdapter implements PaymentGateway {
    private PayPal payPal;
    private Stripe stripe;

    public PaymentGatewayAdapter(String paymentType) {
        if (paymentType.equalsIgnoreCase("PayPal")) {
            payPal = new PayPal();
        } else if (paymentType.equalsIgnoreCase("Stripe")) {
            stripe = new Stripe();
        }
    }

    @Override
    public void processPayment(String paymentType) {
        if (paymentType.equalsIgnoreCase("PayPal")) {
            payPal.payWithPayPal();
        } else if (paymentType.equalsIgnoreCase("Stripe")) {
            stripe.payWithStripe();
        }
    }
}
