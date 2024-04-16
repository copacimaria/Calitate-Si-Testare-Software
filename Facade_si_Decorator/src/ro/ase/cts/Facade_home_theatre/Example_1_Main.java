package ro.ase.cts.Facade_home_theatre;

public class Example_1_Main {
    public static void main(String[] args) {
      HomeTheaterFacade homeTheater= new HomeTheaterFacade(new Amplifier(), new DvdPlayer(), new Projector(), new TheaterLights());
      homeTheater.watchMovie("Riders of the Lost Ark");
      homeTheater.endMovie();
    }
}