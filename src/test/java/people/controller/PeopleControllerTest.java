package people.controller;

import org.japybara.WebPage;
import org.japybara.WebTestCase;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class PeopleControllerTest extends WebTestCase {
    @Test
    public void shouldGetIndex() throws Exception {
        visit("/people");
        assertHasContent("Listing people");
    }

    @Test
    public void shouldCRUD() throws IOException {
        WebPage page = visit("/people");
        page.click("New Person");

        assertEquals("/people/new", getCurrentPath());
        page = getCurrentPage();

        page.fillIn("name", "Zeh Ruela");
        page.click("submit");

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
        page.click("submit");

        assertTrue(getCurrentPath().matches("/people/\\d+$"));
        assertHasContent("Zeh Maneh");
    }

    /*
    Todo
      test "should get new" do
        get :new
        assert_response :success
      end

      test "should create person" do
        assert_difference('Person.count') do
          post :create, :person => @person.attributes
        end

        assert_redirected_to person_path(assigns(:person))
      end

      test "should show person" do
        get :show, :id => @person.to_param
        assert_response :success
      end

      test "should get edit" do
        get :edit, :id => @person.to_param
        assert_response :success
      end

      test "should update person" do
        put :update, :id => @person.to_param, :person => @person.attributes
        assert_redirected_to person_path(assigns(:person))
      end

      test "should destroy person" do
        assert_difference('Person.count', -1) do
          delete :destroy, :id => @person.to_param
        end

        assert_redirected_to people_path
      end
     */
}
