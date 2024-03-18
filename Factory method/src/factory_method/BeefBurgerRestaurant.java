package factory_method;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger(){
        return new BeefBurger();
    }
}
