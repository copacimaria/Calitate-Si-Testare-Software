package ro.ase.cts.observer;

public class WeatherDisplay implements Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    @Override
    public void update(float temperature, float humidiy, float pressure) {
        this.humidity=humidiy;
        this.pressure=pressure;
        this.temperature=temperature;
        display();
    }
    private void display(){
        System.out.println("Weather display: temperature = "+temperature+" F, humidity = "+humidity+" %. pressure = "+pressure+" Pa");
    }
}
