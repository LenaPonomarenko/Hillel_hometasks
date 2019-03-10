package ua.hillel.Ponomarenko.lesson23;

import java.time.LocalDate;

public class Breadwinner implements Observer {
    @Override
    public void handle(Animal animal, LocalDate data) {
        System.out.println("Message from id: "+animal.getId()+", "+data+". Breadwinner notified");
    }
}
