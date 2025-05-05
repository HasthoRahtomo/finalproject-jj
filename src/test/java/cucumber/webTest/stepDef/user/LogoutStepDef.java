package cucumber.webTest.stepDef.user;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.webTest.page.HomePage;
import cucumber.webTest.BaseText;

public class LogoutStepDef extends BaseText {
    HomePage homePage;

    @When("user click logout button")
    public void userClickLogoutButton() {
        homePage = new HomePage(driver);
        homePage.clickTheLogoutButton();
    }

    @Then("there is no user's username on the top left, then the logout success")
    public void thereIsNoUserSUsernameOnTheTopLeftThenTheLogoutSuccess() {
        homePage.logoutValidation();
    }
}
