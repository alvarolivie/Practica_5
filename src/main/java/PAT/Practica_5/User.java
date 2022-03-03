package PAT.Practica_5;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private int id;
    private String email;
    private String name;
    private String surname;
    private LocalDate dob;
    private Cities city;

    public User(){
        super();
    }

    public User(String email, String name, String surname, LocalDate dob, Cities city) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.city = city;
    }

    public User(String email, String name, String surname, Cities city) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public User(int id, String email, String name, String surname, LocalDate dob, Cities city) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }
}
