package people.controller;

import org.japybara.WebTestCase;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest extends WebTestCase {
    @Test
    public void shouldRedirectToPeople() throws IOException {
        visit("/");
        assertEquals("/people", getCurrentPath());
    }
}
