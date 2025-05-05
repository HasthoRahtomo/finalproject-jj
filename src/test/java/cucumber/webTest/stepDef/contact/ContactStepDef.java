package cucumber.webTest.stepDef.contact;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import cucumber.webTest.page.HomePage;
import cucumber.webTest.BaseText;

public class ContactStepDef extends BaseText{
    HomePage homePage;

    @And("user click contact button")
    public void userClickContactButton() {
        homePage = new HomePage(driver);
        homePage.clickContactInTheNavBar();
    }

    @And("user input contact email text box with {string}")
    public void userInputContactEmailTextBoxWith(String email) {
        homePage.inputContactEmail(email);
    }

    @And("User input contact name text box with {string}")
    public void userInputContactNameTextBoxWith(String name) {
        homePage.inputContactName(name);
    }

    @And("User input contact message text box with {string}")
    public void userInputContactMessageTextBoxWith(String message) {
        homePage.inputContactMessage(message);
    }

    @When("user click send message button")
    public void userClickSendMessageButton() {
        homePage.clickSendMessageBtn();
    }
}
