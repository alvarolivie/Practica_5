package PAT.Practica_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;


@RestController
public class Practica5Controller {

    private final Practica5Services practica5Services;

    @Autowired
    public Practica5Controller(Practica5Services practica5Services){
        this.practica5Services = practica5Services;
    }

    @PostMapping("/Practica5/add")
    public String addUser(@Valid @RequestBody User user){
           practica5Services.addUser(user);
           return "Los datos han sido guardados";

    }


    @GetMapping("/Practica5")
    public ArrayList<User> getUsers(){
        return practica5Services.getUsers();
    }
}

