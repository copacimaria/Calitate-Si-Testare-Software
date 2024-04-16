package Decorator_Subscription;
//decorator pentru adaugarea de optiune de vizionare in calitate HD
public class HDStreamingDecorator extends SubscriptionDecorator{
    public HDStreamingDecorator(Subscription subscription){
        super(subscription);
    }
    @Override
    public String getDescription(){
        return  subscription.getDescription()+", vizionare HD.";
    }
    @Override
    public double getPrice(){
        return subscription.getPrice()+3.0;
    }

}
