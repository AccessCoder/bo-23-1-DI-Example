package de.neuefische.bo231myfirstspring.repository;

import de.neuefische.bo231myfirstspring.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepo {

    private Map<String, User> userDB = new HashMap<>(Map.of("1", new User("test", "123", "1")));

    public User getUserById(String id){
        return userDB.get(id);
    }

    public boolean findUserById(String id) throws Exception {
        if (userDB.containsKey(id)){
            return true;
        }
        throw new Exception();
    }

    public User changeUserInformation(User user) {
       return userDB.replace(user.getId(), user);
    }
}
