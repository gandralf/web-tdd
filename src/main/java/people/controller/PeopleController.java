package people.controller;

import br.com.caelum.vraptor.*;
import people.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Resource
public class PeopleController {
    private EntityManager em;
    private Result result;
    private HttpServletRequest request;

    public PeopleController(EntityManager em, Result result, HttpServletRequest request) {
        this.em = em;
        this.result = result;
        this.request = request;
    }

    @SuppressWarnings({"unchecked"})
    @Get("/people")
    public List<Person> index() {
        Query query = em.createQuery("select P from Person P");
        return (List<Person>) query.getResultList();
    }

    @Get("/people/new")
    public void newPerson() {

    }

    @Post("/people")
    public void create(Person person) {
        em.persist(person);
        result.redirectTo(this).show(person.getId());
    }

    @Get("/people/{id}")
    public Person show(Integer id) {
        String referer = request.getHeader("Referer");
        result.include("isNew", referer != null && referer.matches(".+/people/new$"));
        return em.find(Person.class, id);
    }

    @Get("/people/{id}/edit")
    public Person edit(Integer id) {
        return em.find(Person.class, id);
    }

    @Put("/people/{person.id}")
    public void update(Person person) {
        em.merge(person);
        result.redirectTo(this).show(person.getId());
    }
}
