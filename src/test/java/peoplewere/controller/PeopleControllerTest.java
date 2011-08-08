package peoplewere.controller;

import org.japybara.WebIntegrationTest;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class PeopleControllerTest extends WebIntegrationTest {
    @Test
    public void shouldGetPeople() throws IOException {
        visit("/");
        assertEquals("/people/", getCurrentPath());
        assertTrue(hasContent("Listing people"));
    }

    @Test
    public void shouldGetIndex() throws IOException {
        visit("/people");
        assertTrue(hasContent("Listing people"));
        // assertTrue(hasContent("zeh"));
    }

    @Test
    public void shouldGetNew() throws IOException {
        visit("/people/new");
        assertTrue(hasContent("New person"));
   }
}
