package fruit;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by liudi on 5/3/15.
 */
public class RestSteps {
    @When("^the client requests GET /fruits$")
    public void theClientRequestsGETFruits() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the response should be JSON:$")
    public void theResponseShouldBeJSON(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
