package peoplewere.controller;

import org.japybara.WebPage;
import org.japybara.WebTest;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PeopleControllerTest extends WebTest {
    @Test
    public void shouldGetPeople() throws IOException {
        visit("/");
        assertEquals("/people/", getCurrentPath());
        assertHasContent("Listing people");
    }

    @Test
    public void shouldGetIndex() throws IOException {
        visit("/people");
        assertHasContent("Listing people");
    }

    @Test
    public void shouldGetNew() throws IOException {
        WebPage page = visit("/people/new");
        assertHasContent("New person"); // Just a form page title

        // fill form, submit (post to /people)
        page.fillIn("name", "John Malkovich");
        page.clickButton("submit");

        // check: return to /people/:id
        assertTrue("Expected URL: /people/:id, but is " + getCurrentPath(),
                getCurrentPath().matches("/people/\\d+"));

        // check: recently added information
        // check: added to "/people"
   }
}
