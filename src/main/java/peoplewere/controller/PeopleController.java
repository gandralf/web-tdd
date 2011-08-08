package peoplewere.controller;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.Logic;
import peoplewere.model.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleController {
    private List<Person> people;

    public void index() {
        people = new ArrayList<Person>();
    }

    public List<Person> getPeople() {
        return people;
    }

    @Logic("new")
    public void newPerson() {

    }
}
