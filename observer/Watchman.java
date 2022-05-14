package observer;

import java.util.*;

public class Watchman implements Subject {
    private ArrayList<Observer> observers;
    private int warning;

    public Watchman() {
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(warning);
        }        
    }
    
    public void issueWarning(int warning) {
        this.warning = warning;
        notifyObservers();
    }
}
