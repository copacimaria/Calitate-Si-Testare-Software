package ro.ase.cts.sem3.cleancode;

public class InventoryProduct extends Product {
    private int InventoryProductQuantity;
    public InventoryProduct(Product product, int InvProdQuantity)
    {
        super();
        this.InventoryProductQuantity = InvProdQuantity;
    }
    @Override
    public int getQuantity() {
        return InventoryProductQuantity;
    }
    @Override
    public void setQuantity(int quantity) {
        this.InventoryProductQuantity = quantity;
    }
}
