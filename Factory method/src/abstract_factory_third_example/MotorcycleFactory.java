package abstract_factory_third_example;

public class MotorcycleFactory implements VehicleFactory{
    String MotorcycleFactory;
    public MotorcycleFactory(String motorcycleFactory){
        this.MotorcycleFactory=motorcycleFactory;
    }
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle(MotorcycleFactory);
    }
}
