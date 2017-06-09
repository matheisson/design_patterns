package observer.weather;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.ArrayList;

/**
 * Created by levente on 2017.05.29..
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {

        for (int i = 0; i < observers.size(); i++){
            Observer o = observers.get(i);
            o.update(temperature,humidity,pressure);
        }
    }


    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float h, float p){

        this.temperature = temperature;
        this.humidity = h;
        this.pressure = p;

        measurementsChanged();
    }

}
