package cucumber.webTest.stepDef;
import cucumber.webTest.page.CommonPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import cucumber.webTest.page.HomePage;
import cucumber.webTest.BaseText;
import io.cucumber.java.en.Then;

public class CommonStep extends BaseText {
    HomePage homePage;
    CommonPage commonPage;

    @Given("user in on the home page")
    public void userInOnTheHomePage() {
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);
        homePage.goToHomePage();
    }

    @Given("user in on the home page and already login")
    public void userInOnTheHomePageAndAlreadyLogin() {
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);
        homePage.performLogin("Gaming_mouse", "12345678");
    }

    @Then("an alert pop up will appear with {string}")
    public void anAlertPopUpWillAppearWith(String expected) {
        commonPage.isAlertPopUp(expected);
    }

    @And("user click the cart button on the nav bar")
    public void userClickTheCartButtonOnTheNavBar() {
        commonPage.clickCartAtNavbarBtn();
    }
}
