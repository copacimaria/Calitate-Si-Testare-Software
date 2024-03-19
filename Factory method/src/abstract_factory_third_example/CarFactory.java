package abstract_factory_third_example;

public class CarFactory implements VehicleFactory{
    String CarFactory;
    public CarFactory(String carFactory){
        this.CarFactory=carFactory;
    }
    @Override
    public Vehicle createVehicle() {
        return new Car(CarFactory);
    }
}
