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

    @Get
    @Path("/people")
    public List<Person> index() {
        Query query = em.createQuery("select P from Person P");
        return (List<Person>) query.getResultList();
    }

    @Path("/people/new")
    public void newPerson() {

    }

    @Post
    @Path("/people")
    public void create(Person person) {
        em.persist(person);
        result.redirectTo("/people/" + person.getId());
    }

    @Get
    @Path("/people/{id}")
    public Person show(Integer id) {
        String referer = request.getHeader("Referer");
        result.include("isNew", referer != null && referer.matches(".+/people/new$"));
        return em.find(Person.class, id);
    }

    @Path("/people/{id}/edit")
    public Person edit(Integer id) {
        return em.find(Person.class, id);
    }

    @Put
    @Path("/people/{person.id}")
    public void update(Person person) {
        em.merge(person);
        result.redirectTo("/people/" + person.getId());
    }
}
