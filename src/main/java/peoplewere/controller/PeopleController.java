package peoplewere.controller;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.In;
import org.vraptor.annotations.Logic;
import org.vraptor.plugin.jpa.Transaction;
import peoplewere.model.Person;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Component
public class PeopleController {
    @In
    private HttpServletRequest request;
    @In
    private HttpServletResponse response;
    private EntityManager em;
    private List<Person> people;

    public PeopleController(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Transaction
    public void index(Person person) throws IOException {
        System.out.println("/people [" + request.getMethod() + "]");
        if ("GET".equals(request.getMethod())) {
            people = em.createQuery("select P from peoplewere.model.Person P").getResultList();
        } else {
            em.persist(person);
            response.sendRedirect("/persons/" + person.getId());
        }
    }

    public List<Person> getPeople() {
        return people;
    }

    @Logic("new")
    public void newPerson() {

    }
}
