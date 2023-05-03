package de.neuefische.bo231myfirstspring.controller;

import de.neuefische.bo231myfirstspring.model.User;
import de.neuefische.bo231myfirstspring.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    String loginMessage(){
        return "Please Login, using Post and your credentials";
    }

    @PostMapping
    String login(@RequestBody User user){
        User user1 = loginService.login(user);
        return "Successful Login with User: " + user1;
    }
}
