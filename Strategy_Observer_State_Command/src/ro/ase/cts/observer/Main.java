package ro.ase.cts.observer;

public class Main {
    public static void main(String[] args){
        WeatherStation weatherStation= new WeatherStation();
        WeatherDisplay display1= new WeatherDisplay();
        WeatherDisplay display2= new WeatherDisplay();

        weatherStation.regsisterObserver(display1);
        weatherStation.regsisterObserver(display2);

        weatherStation.setMeasurements(75, 60, 30.4f);
        weatherStation.setMeasurements(80, 65, 29.2f);

    }
}
