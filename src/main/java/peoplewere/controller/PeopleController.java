package peoplewere.controller;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.Logic;
import org.vraptor.plugin.jpa.Transaction;
import peoplewere.model.Person;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleController {
    private EntityManager em;
    private List<Person> people;

    public PeopleController(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Transaction
    public void index() {
        people = em.createQuery("select P from peoplewere.model.Person P").getResultList();
    }

    public List<Person> getPeople() {
        return people;
    }

    @Logic("new")
    public void newPerson() {

    }
}
