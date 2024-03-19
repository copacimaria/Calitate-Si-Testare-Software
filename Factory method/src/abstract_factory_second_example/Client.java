package abstract_factory_second_example;

public class Client {
    private final FurnitureFactory furnitureFactory;
    public Client(FurnitureFactory furnitureFactory){
        this.furnitureFactory=furnitureFactory;
    }

    public void useFurniture(){
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();

        System.out.println(chair.sitOn());
        System.out.println(sofa.lieOn());
    }
}
