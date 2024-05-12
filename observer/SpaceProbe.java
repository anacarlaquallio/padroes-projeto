package observer;

import java.util.ArrayList;
import java.util.List;

class SpaceProbe implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String name;
    private String currentLocation;

    public SpaceProbe(String name, String initialLocation) {
        this.name = name;
        this.currentLocation = initialLocation;
    }

    public void move(String newLocation) {
        this.currentLocation = newLocation;
        notifyObservers();
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
        CelestialBody celestialBody = new CelestialBody(name, currentLocation);
        for (Observer observer : observers) {
            observer.update(celestialBody);
        }
    }

    public String getCurrentLocation() {
        return currentLocation;
    }
}