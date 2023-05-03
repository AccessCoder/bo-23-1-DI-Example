package de.neuefische.bo231myfirstspring.service;

import de.neuefische.bo231myfirstspring.repository.GreetingsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingsService {

    private final GreetingsRepo repo;


    public String greetCustomer(String id, String userName){
        String greeting = repo.getGreeting(id);
        return greeting + " " + userName;
    }
}
