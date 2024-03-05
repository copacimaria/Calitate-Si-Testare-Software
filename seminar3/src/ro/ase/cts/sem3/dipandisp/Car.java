package ro.ase.cts.sem3.dipandisp;

interface Engine{
    public void start();
}
public class Car {
private Engine engine;
public Car(Engine e){
    engine=e;
}
public void start(){
    engine.start();
}}

 class PetrolEngine implements Engine{
     @Override
     public void start() {}}

 class DieselEngine implements Engine{
         @Override
     public void start() {}
 }



