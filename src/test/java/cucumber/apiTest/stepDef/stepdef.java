package cucumber.apiTest.stepDef;
import io.cucumber.java.en.*;
import cucumber.apiTest.apiClass.setVariable;
import cucumber.apiTest.apiClass.expectedVerification;
import java.util.Random;

public class stepdef {
    setVariable apiTask = new setVariable();
    expectedVerification verification = new expectedVerification(apiTask);

    String pageValue;
    String limitValue;
    String emailValue;

    @Given("The API base URL is {string}")
    public void theAPIBaseURLIs(String link) {
        apiTask.setURL(link);
    }

    @And("I put a request to {string}")
    public void iPutARequestTo(String api) {
        apiTask.setAPI(api);
    }

    @Then("The response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int code) {
        verification.expectedStatusCode(code);
    }

    @When("I set app-id to {string}")
    public void iSetAppIdTo(String appId) {
        apiTask.setAppId(appId);
    }

    @And("I fill the page with {string}")
    public void iFillThePageWith(String page) {
        if (page != null) {
            pageValue = "page="+page;
        }
        apiTask.setPage(pageValue);
    }

    @And("I fill the limit with {string}")
    public void iFillTheLimitWith(String limit) {
        if(limit != null){
            limitValue="&limit="+limit;
        }
        apiTask.setLimit(limitValue);
    }

    @And("I fill the user id with {string}")
    public void iFillTheUserIdWith(String userID) {
        apiTask.setUserId(userID);
    }

    @And("I set the api method to {string}")
    public void iSetTheApiMethodTo(String method) {
        apiTask.setMethod(method);
    }

    @And("I fill the firstName with {string}")
    public void iFillTheFirstNameWith(String firstName) {
        apiTask.setFirstName(firstName);
    }

    @And("I fill the lastName with {string}")
    public void iFillTheLastNameWith(String lastName) {
        apiTask.setLastName(lastName);
    }

    @And("I fill the email with {string}")
    public void iFillTheEmailWith(String email) {
        emailValue = email;

        // if user says "random"?
        if(email.equals("random")){
            Random random = new Random();
            int randomNumber = random.nextInt(10000000);
            emailValue = randomNumber+"@gmail.com";
        }

        apiTask.setEmail(emailValue);
    }
}
