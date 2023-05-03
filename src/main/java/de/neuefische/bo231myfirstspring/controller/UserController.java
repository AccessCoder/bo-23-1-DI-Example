package de.neuefische.bo231myfirstspring.controller;

import de.neuefische.bo231myfirstspring.model.User;
import de.neuefische.bo231myfirstspring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    String greetUser(){
        return "Hello";
    }

    @GetMapping(path = "{id}")
    User getUserInformationById(@PathVariable String id){
        return service.getUserById(id);
    }

    @PutMapping(path = "{id}")
    String changeUserInformationById(@PathVariable String id, @RequestBody User user){
        service.changeUserInformationById(id,user);
        return "Changed User Information";
    }
}
