package de.neuefische.bo231myfirstspring.service;

import de.neuefische.bo231myfirstspring.model.User;
import de.neuefische.bo231myfirstspring.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepo repo;


    public User login(User user) {
        try {
            repo.findUserById(user.getId());
               if (repo.getUserById(user.getId()).equals(user)){
                   return repo.getUserById(user.getId());
               }return new User("WRONG NAME", "WRONG PW", "WRONG ID");

        }catch (Exception e){
            return new User("User not found", "User not found", "User not found" );
        }
    }
}
