package ua.hillel.Ponomarenko.lesson23;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Director director = new Director();
        Animal woolf = new Animal(1, "Jack");
        woolf.addHealthObserver(director);
        woolf.addHealthObserver(veterinarian);
        woolf.addHungerObserver(director);
        woolf.addHungerObserver(veterinarian);
        woolf.sick();
        System.out.println("-------------------------------------------");
        Breadwinner breadwinner = new Breadwinner();
        woolf.addHungerObserver(breadwinner);
        woolf.hungry();
        System.out.println("-------------------------------------------");
        Pet cat = new Pet(2, "Murka");
        Groomer groomer = new Groomer();
        cat.addHungerObserver(director);
        cat.addHungerObserver(veterinarian);
        cat.addHungerObserver(breadwinner);
        cat.addHealthObserver(director);
        cat.addHealthObserver(veterinarian);
        cat.addHairCutObserver(director);
        cat.addHairCutObserver(groomer);
        cat.needHaircut();


    }
}
