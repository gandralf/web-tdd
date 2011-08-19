package people.controller;

import org.japybara.WebTest;
import org.junit.Test;

public class PeopleControllerTest extends WebTest {
    @Test
    public void shouldGetIndex() throws Exception {
        visit("/people");
        assertHasContent("Listing people");
    }
}
