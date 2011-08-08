package peoplewere.controller;

import org.japybara.WebIntegrationTest;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class PeopleControllerTest extends WebIntegrationTest {
    @Test
    public void testGetIndex() throws IOException {
        visit("/people");
    }

    @Test
    public void shouldGetNew() throws IOException {
        visit("/people/new");
    }
}
