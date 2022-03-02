package PAT.Practica_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class Practica5Controller {

    private final Practica5Services practica5Services;

    @Autowired
    public Practica5Controller(Practica5Services practica5Services){
        this.practica5Services = practica5Services;
    }

    @PostMapping("/Practica5/add")
    public User addUser(@RequestBody User user){
        return practica5Services.addUser(user);
    }
}

