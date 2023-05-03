package de.neuefische.bo231myfirstspring.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class GreetingsRepo {

    Map<String, String> greetingsMap = new HashMap<>(
            Map.of(
            "1", "Hallo",
            "2", "Servus",
            "3", "Moin",
            "4", "Was geht?"));


    public String getGreeting(String id) {
        return greetingsMap.get(id);
    }
}
