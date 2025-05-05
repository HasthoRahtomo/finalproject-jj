package cucumber.webTest.stepDef.user;

import cucumber.webTest.BaseText;
import cucumber.webTest.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseText {
    HomePage homePage;

    @And("user click login button at the navigation bar")
    public void userClickLoginButtonAtTheNavigationBar() {
        homePage = new HomePage(driver);
        homePage.clickTheLoginButtonAtNavBar();
    }

    @And("user input username text box with {string}")
    public void userInputUsernameTextBoxWith(String username) {
        homePage.inputUsername(username);
    }

    @And("User input password text box with {string}")
    public void userInputPasswordTextBoxWith(String password) {
        homePage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        homePage.clickTheLoginButton();
    }

    @Then("there is a user's username on the top left, the login success")
    public void thereIsAUserSUsernameOnTheTopLeftTheLoginSuccess() {
        homePage.loginSuccessValidation();
    }
}
