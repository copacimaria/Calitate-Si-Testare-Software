package abstract_factory_third_example;

public class Motorcycle implements Vehicle{

  String Motorcyle;
  public Motorcycle(String motorcyle){
      this.Motorcyle=motorcyle;
  }
    @Override
    public void assemble() {
        System.out.println("Assembling a motorcycle!" + Motorcyle);
    }
}
