package abstract_factory_second_example;

public class Main_abs_ex2 {
    public static void main(String[] args) {
        FurnitureFactory modernFactory=new ModernFurnitureFactory();
        FurnitureFactory victorianFactory=new VictorianFurnitureFactory();

        System.out.println("Client uses modern furniture!");
        Client client1=new Client(modernFactory);
        client1.useFurniture();

        System.out.println("Client uses victorian furniture! ");
        Client client2= new Client(victorianFactory);
        client1.useFurniture();

    }
}
