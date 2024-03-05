package ro.ase.cts.sem3.cleancode;
import java.util.ArrayList;

public class OnlineShop {

    private String onlineShopName;
    private String image;
    private ArrayList<Product> products;

    OnlineShop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.image = img;
        this.onlineShopName = name;
    }
    public void addProductToList(Product p){
        this.products.add(p);
    }

    public void removeProductFromList(Product p){
        this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getImg() {
        return image;
    }

    public void setImg(String img) {
        this.image = img;
    }
}

