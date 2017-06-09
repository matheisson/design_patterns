package observer.interfaces.impl;

import observer.interfaces.DisplayElement;
import observer.interfaces.Observer;
import observer.interfaces.Subject;

/**
 * Created by levente on 2017.05.29..
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;


    public CurrentConditionsDisplay(Subject wd){
        this.weatherData = wd;
        wd.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"°C temp. and "+humidity+"% humidity.");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temp;
        display();
    }
}
