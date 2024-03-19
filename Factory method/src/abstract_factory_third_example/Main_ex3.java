package abstract_factory_third_example;

public class Main_ex3 {
    public static void main(String[] args){
        VehicleFactory vehicleFactory1= new CarFactory("Car");
        Vehicle vehicle1=vehicleFactory1.createVehicle();
        vehicle1.assemble();

        VehicleFactory vehicleFactory2=new MotorcycleFactory(("Moto"));
        Vehicle vehicle2=vehicleFactory2.createVehicle();
        vehicle2.assemble();



    }
}
