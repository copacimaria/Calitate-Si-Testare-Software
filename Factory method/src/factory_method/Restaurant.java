package factory_method;
//abstract class because the createBurger method is an abstract
// method inside the Restaurant class
public abstract class Restaurant {

    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
    public abstract Burger createBurger();
}
