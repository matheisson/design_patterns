package observer;

import observer.interfaces.impl.CurrentConditionsDisplay;
import observer.weather.WeatherData;

/**
 * Created by levente on 2017.05.29..
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        CurrentConditionsDisplay cd = new CurrentConditionsDisplay(wd);
        CurrentConditionsDisplay cd2 = new CurrentConditionsDisplay(wd);

        wd.setMeasurements(12,43,65);
        wd.setMeasurements(22,73,5);
        wd.removeObserver(cd);
    }
}
