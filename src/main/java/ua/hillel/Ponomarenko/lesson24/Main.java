package ua.hillel.Ponomarenko.lesson24;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ua.hillel.Ponomarenko.lesson23.Animal;

import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Animal bear = new Animal(1,"Misha");
        ObjectMapper mapper1 = new ObjectMapper();
        String string = mapper1.writeValueAsString(bear);
        FileWriter file = new FileWriter("D:/hillel/tasks/src/main/resources/JSONobject.json");
        try {
            file.write(string);
            System.out.println("JSON object: "+string);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file.flush();
            file.close();
        }
    }
}
