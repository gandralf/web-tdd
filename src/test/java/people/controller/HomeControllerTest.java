package people.controller;

import org.japybara.WebTest;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest extends WebTest {
    @Test
    public void shouldRedirectToPeople() throws IOException {
        visit("/");
        assertEquals("/people", getCurrentPath());
    }
}
