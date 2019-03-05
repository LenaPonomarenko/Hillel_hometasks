package ua.hillel.Ponomarenko.lesson23;

import java.util.List;

public interface Observable {
    void addHealthObserver(Observer o);

    void removeHealthObserver(Observer o);

    void addHungerObserver(Observer o);

    void removeHungerObserver(Observer o);

    void notifyObservers(List<Observer> observers);

}
