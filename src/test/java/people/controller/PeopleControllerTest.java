package people.controller;

import org.japybara.WebPage;
import org.japybara.WebTest;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PeopleControllerTest extends WebTest {
    @Test
    public void shouldGetIndex() throws Exception {
        visit("/people");
        assertHasContent("Listing people");
    }

    @Test
    public void shouldCRUD() throws IOException {
        WebPage page = visit("/people/new");
        page.fillIn("name", "Zeh Ruela");
        page.clickButton("submit");

        assertTrue(getCurrentPath().matches("/people/\\d+$"));
        assertHasContent("Zeh Ruela");
        assertHasContent("Person was successfully created");

        visit("/people");
        assertHasContent("Zeh Ruela");

        visit("/people/1");
        assertHasContent("Zeh Ruela");
        assertFalse(getBody().contains("Person was successfully created"));

        page = visit("/people/1/edit");
        assertHasContent("Zeh Ruela");
        page.fillIn("name", "Zeh Maneh");
        page.clickButton("submit");

        assertTrue(getCurrentPath().matches("/people/\\d+$"));
        assertHasContent("Zeh Maneh");
    }
}
