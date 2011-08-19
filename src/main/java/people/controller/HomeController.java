package people.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class HomeController {
    private Result result;

    public HomeController(Result result) {
        this.result = result;
    }

    @Path("/")
    public void redirect() {
        result.redirectTo("/people");
    }
}
