package peoplewere.controller;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.Logic;
import peoplewere.model.Person;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleController {
    private EntityManager entityManager;
    private List<Person> people;

    public PeopleController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

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
