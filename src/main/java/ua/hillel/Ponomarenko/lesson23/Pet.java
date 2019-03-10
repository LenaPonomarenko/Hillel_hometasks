package ua.hillel.Ponomarenko.lesson23;

import java.util.ArrayList;
import java.util.List;

public class Pet extends Animal implements HaircutObservable {
    private boolean isNeedHaircut;
    private List<Observer> haircutObservables;

    public Pet(int id, String name) {
        super(id, name);
        haircutObservables = new ArrayList<>();
    }

    public boolean isNeedHaircut() {
        return isNeedHaircut;
    }

    public void needHaircut() {
        isNeedHaircut = true;
        notifyObservers(haircutObservables);
    }

    public void sheared() {
        isNeedHaircut = false;
    }

    @Override
    public void addHairCutObserver(Observer o) {
        haircutObservables.add(o);
    }

    @Override
    public void removeHairCutObserver(Observer o) {
        haircutObservables.remove(o);
    }
}
