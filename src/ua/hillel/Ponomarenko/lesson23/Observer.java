package ua.hillel.Ponomarenko.lesson23;

import java.time.LocalDate;

public interface Observer {
    void handle(Animal animal, LocalDate date);
}
