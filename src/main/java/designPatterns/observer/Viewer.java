package designPatterns.observer;

public class Viewer implements Observer,Display{


    WeatherStation weatherStation;

    public Viewer(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
            weatherStation.getObserverList().add(this);

    }

    @Override
    public void update() {

        weatherStation.getTemperature();

        display();

    }


    @Override
    public void display() {

        System.out.println("Temperatura wynosi : " + weatherStation.getTemperature());
    }
}
