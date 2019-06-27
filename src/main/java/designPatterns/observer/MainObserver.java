package designPatterns.observer;

public class MainObserver {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();


        Viewer viewer = new Viewer(weatherStation);

        weatherStation.setTemperature(30.0);
        weatherStation.setTemperature(23.0);
        weatherStation.setTemperature(24.0);
        weatherStation.setTemperature(23.0);
    }
}
