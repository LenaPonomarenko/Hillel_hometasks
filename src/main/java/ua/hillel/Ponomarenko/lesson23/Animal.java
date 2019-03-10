package ua.hillel.Ponomarenko.lesson23;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Animal implements Observable {
    private int id;
    private String name;
    private boolean isSick;
    private boolean isHungry;
    private List<Observer> healthObservers;
    private List<Observer> hungerObservers;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
        healthObservers = new ArrayList<>();
        hungerObservers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSick() {
        return isSick;
    }

    public void sick() {
        isSick = true;
        notifyObservers(healthObservers);
    }

    public void healed() {
        isSick = false;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void hungry() {
        isHungry = true;
        notifyObservers(hungerObservers);
    }

    public void fed() {
        isHungry = false;
    }

    @Override
    public void addHealthObserver(Observer healthObserver) {
        healthObservers.add(healthObserver);
    }

    @Override
    public void removeHealthObserver(Observer healthObserver) {
        healthObservers.remove(healthObserver);

    }

    @Override
    public void notifyObservers(List<Observer> observers) {
        for (Observer observer : observers) {
            observer.handle(this, LocalDate.now());
        }
    }

    @Override
    public void addHungerObserver(Observer o) {
        hungerObservers.add(o);
    }

    @Override
    public void removeHungerObserver(Observer o) {
        hungerObservers.remove(o);
    }
}
