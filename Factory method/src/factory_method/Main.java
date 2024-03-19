package factory_method;

import factory_method.BeefBurgerRestaurant;
import factory_method.Burger;
import factory_method.Restaurant;
import factory_method.VeggieBurgerRestaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant beefResto= new BeefBurgerRestaurant();
        Burger beefBurger = beefResto.orderBurger();
        if(beefBurger!=null){
            System.out.println("Ordered a beef burger from the Beef Burger Restaurant!");}
        else {
            System.out.println("Failed to create beef burger.");
        }

        Restaurant veggieResto= new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieResto.orderBurger();
        if(veggieBurger!=null){
           System.out.println("Ordered a veggie burger from the Veggie Burger Restaurant!");}
        else {
            System.out.println("Failed to create veggie burger.");
        }
    }
    }
