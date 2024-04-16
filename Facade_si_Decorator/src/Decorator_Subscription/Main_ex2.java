package Decorator_Subscription;

public class Main_ex2 {
    public static void main(String[] args) {
        //creeaza un ab de baza
        Subscription subscription = new BasicSubscription();
        //adauga optiunea de viz offline
        subscription= new OfflineViewingDecorator(subscription);
        //add HD
        subscription= new HDStreamingDecorator(subscription);
        //afiseaza descrierea si pretul final al ab
        System.out.println("Descriere: "+subscription.getDescription());
        System.out.println("Pret: "+subscription.getPrice());
}}
