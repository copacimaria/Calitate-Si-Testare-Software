package ro.ase.cts.sem3.cleancode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OnlineShop o = new OnlineShop("Altex", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,1, 1123, "21.03.2029");
        Product p2 = new Product("Frigider", 207.95, 1,2, 1245, "05.08.2030");

        Product p3 = new Product(p1);

        p3.setQuantity(3);
        p3.setProdName("Bread");

        o.addProductToList(p1);
        o.addProductToList(p2);

        o.removeProductFromList(p1);
        System.out.println(p1.equals(p2));
    }
}
