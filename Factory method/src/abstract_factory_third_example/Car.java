package abstract_factory_third_example;

public class Car implements Vehicle{
    String Car;
    public Car(String car){
        this.Car=car;
    }
    @Override
    public void assemble() {
        System.out.println("Assembling a car!" + Car);
    }
}
