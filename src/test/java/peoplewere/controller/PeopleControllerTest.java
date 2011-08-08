package peoplewere.controller;

import org.japybara.WebIntegrationTest;
import org.junit.Test;

import java.io.IOException;

public class PeopleControllerTest extends WebIntegrationTest {
    @Test
    public void testGetIndex() throws IOException {
        visit("/people.index.logic");
    }

    @Test
    public void shouldGetNew() throws IOException {
        visit("/people.new.logic");
    }
}
