package ro.ase.cts.sem3.cleancode;

public class Product {
    private int prodId;
    private String prodName;
    private double productPrice;
    private int productType;
    private int productCategory;
    private int quantity;
    private String exp; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(){}

    public Product(String n, double p, int pt, int pc, int id, String exp)
    {
        prodName = n;
        productPrice = p;
        productType = pt;
        productCategory = pc;
        this.prodId = id;
        this.exp = exp;
    }

    public Product(Product p)
    {
        this.prodName = p.prodName;
        this.productPrice = p.productPrice;
        this.productType = p.productType;
        this.productCategory = p.productCategory;
        this.prodId = p.prodId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public boolean equals(Product p)
    {
        if(p.prodId != this.prodId||!p.prodName.equals(this.prodName)||p.productPrice != this.productPrice||p.productType != p.productType||p.productCategory != this.productCategory){
            return false;
        }else{
            return true;
        }
    }
    public void priceIncrease(double val){
        this.productPrice+=this.productPrice*val;
    }
    public void priceDecrease(double val){
        this.productPrice-=this.productPrice*val/100;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
