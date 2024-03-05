package ro.ase.cts.sem3.cleancode;


public class OrderProduct extends Product {
    private int OPquantity;
    public OrderProduct(Product product, int OPquantity)
    {
        super();
        this.OPquantity = OPquantity;
    }
    @Override
    public int getQuantity() {
        return OPquantity;
    }
    @Override
    public void setQuantity(int quantity) {
        this.OPquantity = quantity;
    }
}

