package ro.ase.cts.sem3.dipandisp;

interface VehicleWithDoors{
    public void drive();
    public void stop();
    public void openDoors();
}

interface VehicleWithoutDoors{
    public void drive();
    public void stop();
}

class Bike1 implements VehicleWithoutDoors{
    public void drive(){}
    public void stop(){};
}
class Car1 implements VehicleWithDoors{
    public void drive(){}
    public void stop(){};
    public void openDoors(){};
}
