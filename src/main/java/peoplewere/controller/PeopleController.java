package peoplewere.controller;

import peoplewere.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PeopleController {
    private List<Person> people;

    public void index() {
        people = new ArrayList<Person>();
    }

    public List<Person> getPeople() {
        return people;
    }
}
