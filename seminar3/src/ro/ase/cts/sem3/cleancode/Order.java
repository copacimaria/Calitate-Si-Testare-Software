package ro.ase.cts.sem3.cleancode;
import java.util.ArrayList;

public class Order {
    private ArrayList<OrderProduct> productList;
    private String orderAddress;

    public Order() {
        productList = new ArrayList<>();
    }

    public void addProduct(OrderProduct product) {
        if (productList.size() < 100)
            productList.add(product);
    }

    public void removeProduct(OrderProduct product) {
        productList.remove(product);
    }

    public String getAddress() {
        return orderAddress;
    }

    public void setAddress(String address) {
        this.orderAddress = address;
    }
}

