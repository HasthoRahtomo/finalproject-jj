package cucumber.webTest.stepDef.user;

import cucumber.webTest.BaseText;
import cucumber.webTest.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.Random;

public class RegisterStepDef extends BaseText {
    HomePage homePage;

    String usernameValue;
    String passwordValue;

    @And("user click sign up button at the navigation bar")
    public void userClickSignUpButtonAtTheNavigationBar() {
        homePage = new HomePage(driver);
        homePage.clickTheSignupButtonAtNavBar();
    }

    @And("user input username text box on sign up pop up with {string}")
    public void userInputUsernameTextBoxOnSignUpPopUpWith(String username) {
        if(username.equals("random")){
            Random random = new Random();
            int randomNumber = random.nextInt(10000000);
            usernameValue = randomNumber+"ThisIsUser";
        }
        else{
            usernameValue=username;
        }

        homePage.inputUsernameSignup(usernameValue);
    }

    @And("User input password text box on sign up pop up with {string}")
    public void userInputPasswordTextBoxOnSignUpPopUpWith(String password) {
        if(password.equals("random")){
            Random random = new Random();
            int randomNumber = random.nextInt(10000000);
            passwordValue = randomNumber+"Password";
        }
        else{
            passwordValue=password;
        }
        homePage.inputPasswordSignup(passwordValue);
    }

    @When("user click sign up button")
    public void userClickSignUpButton() {
        homePage.clickTheSignupButton();
    }

    @And("User will trying login using created account")
    public void userWillTryingLoginUsingCreatedAccount() {
        homePage.performLogin(usernameValue, passwordValue);
    }
}
