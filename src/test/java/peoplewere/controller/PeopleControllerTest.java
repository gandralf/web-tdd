package peoplewere.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PeopleControllerTest {
    private PeopleController peopleController;

    @Before
    public void setUp() {
        peopleController = new PeopleController();
    }

    @Test
    public void shouldGetIndex() {
        peopleController.index();
        assertNotNull(peopleController.getPeople());
    }

    @Test
    public void shouldGetNew() {
        peopleController.newPerson();
    }
}
