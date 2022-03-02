package PAT.Practica_5;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Practica5Services {
    List<User> userList = new ArrayList<>();

    public User addUser(User user){
        userList.add(user);
        user.setId(userList.indexOf(user));
        return user;
    }
}