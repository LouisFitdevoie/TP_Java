package be.heh.observer.tp3.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Observable {
    private List<Observer> observers;
    public Observable() {
        this.observers = new ArrayList<>();
    }
    public void notifierTousObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    public void addObservers(Observer... observers) {
        this.observers.addAll(Arrays.asList(observers));
    }
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
    public void removeObservers(Observer... observers) {
        this.observers.removeAll(Arrays.asList(observers));
    }
}
