package ro.ase.cts.sem3.cleancode;
import java.util.ArrayList;
public class User {
    public String userName;
    public String userId;
    public ArrayList<Order> sucessfulOrder;
    public ArrayList<Order> cancelledOrder;


    public User(String username, String id)
    {
        this.userName = username;
        this.userId = id;
        sucessfulOrder=new ArrayList<Order>();
        cancelledOrder=new ArrayList<Order>();
    }

    public void addSucessfulO(Order o)
    {
        this.sucessfulOrder.add(o);
    }

    public void addCanceledO(Order o)
    {
        this.cancelledOrder.add(o);
    }
}
