package ua.hillel.Ponomarenko.lesson23;

public interface HaircutObservable {
    void addHairCutObserver(Observer o);

    void removeHairCutObserver(Observer o);
}
