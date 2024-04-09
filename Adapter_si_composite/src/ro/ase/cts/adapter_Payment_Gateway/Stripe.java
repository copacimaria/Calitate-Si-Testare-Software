package ro.ase.cts.adapter_Payment_Gateway;

public class Stripe {
    public Stripe(){}
    public void makePayment(double price){
        System.out.println("Price to pay trough Stripe is: "+price);
    }
}
