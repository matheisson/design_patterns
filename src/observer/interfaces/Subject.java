package observer.interfaces;

/**
 * Created by levente on 2017.05.29..
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
