package de.neuefische.bo231myfirstspring.service;

import de.neuefische.bo231myfirstspring.model.User;
import de.neuefische.bo231myfirstspring.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }


    public User getUserById(String id) {
        return repo.getUserById(id);
    }

    public User changeUserInformationById(String id, User user) {
        User user1 = repo.getUserById(id);
        user1.setUserName(user.getUserName());
        user1.setPassword(user.getPassword());
        return repo.changeUserInformation(user1);
    }
}
