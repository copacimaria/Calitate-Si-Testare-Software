package ro.ase.cts.adapter_Payment_Gateway;

public class PayPalAdapter implements PaymentProcessor{
   private PayPal PayPal;
    public PayPalAdapter(PayPal PayPal){
       this.PayPal=PayPal;
    }
    @Override
    public void processPayment(double price){
       PayPal.sendPayment(35.555);
    }
}
