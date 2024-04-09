package ro.ase.cts.adapter_Payment_Gateway;

public class StripeAdapter implements PaymentProcessor{

    private Stripe Stripe;
    public StripeAdapter(Stripe Stripe){
        this.Stripe=Stripe;
    }
    @Override
    public void processPayment(double price){
        Stripe.makePayment(40.00);
    }

}
