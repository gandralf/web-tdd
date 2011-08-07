package peoplewere.controller;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PeopleControllerTest {
    @Test
    public void shouldGetIndex() {
        PeopleController peopleController = new PeopleController();
        peopleController.index();
        assertNotNull(peopleController.getPeople());
    }
}
