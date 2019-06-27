package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Watched {

    List<Observer> observerList;

    private Double temperature;


    public WeatherStation() {
       observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {

        observerList.add(observer);

    }

    @Override
    public void remove(Observer observer) {

        observerList.remove(observer);

    }

    @Override
    public void notfy() {

        for (Observer observer : observerList) {

            observer.update();

        }
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        notfy();
    }

    public List<Observer> getObserverList() {
        return observerList;
    }
}
