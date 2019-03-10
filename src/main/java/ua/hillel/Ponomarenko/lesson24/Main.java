package ua.hillel.Ponomarenko.lesson24;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Map map = new HashMap();
        map.put("Vanya", "sadasd");
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(map);
        System.out.println(str);
    }
}
