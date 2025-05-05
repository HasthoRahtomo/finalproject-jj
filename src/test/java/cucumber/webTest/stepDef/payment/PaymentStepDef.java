package cucumber.webTest.stepDef.payment;

import cucumber.webTest.BaseText;
import cucumber.webTest.page.CommonPage;
import cucumber.webTest.page.HomePage;
import cucumber.webTest.page.ProdDetailPage;
import cucumber.webTest.page.PaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentStepDef extends BaseText {
    HomePage homePage;
    ProdDetailPage prodDetailPage;
    PaymentPage paymentPage;

    @And("user click an item menu")
    public void userClickAnItemMenu() {
        homePage = new HomePage(driver);
        homePage.clickTheProductImage();
    }

    @When("user click add to cart button")
    public void userClickAddToCartButton() {
        prodDetailPage = new ProdDetailPage(driver);
        prodDetailPage.clickAddToCartBtn();
    }

    @And("user click the place order button")
    public void userClickThePlaceOrderButton() {
        paymentPage = new PaymentPage(driver);
        paymentPage.clickPlaceOrderBtn();
    }

    @And("user input name text box with {string}")
    public void userInputNameTextBoxWith(String name) {
        paymentPage.inputName(name);
    }

    @And("user input country text box with {string}")
    public void userInputCountryTextBoxWith(String country) {
        paymentPage.inputCountry(country);
    }

    @And("user input city text box with {string}")
    public void userInputCityTextBoxWith(String city) {
        paymentPage.inputCity(city);
    }

    @And("user input credit card text box with {string}")
    public void userInputCreditCardTextBoxWith(String creditCard) {
        paymentPage.inputCreditCard(creditCard);
    }

    @And("user input month text box with {string}")
    public void userInputMonthTextBoxWith(String month) {
        paymentPage.inputMonth(month);
    }

    @And("user input year text box with {string}")
    public void userInputYearTextBoxWith(String year) {
        paymentPage.inputYear(year);
    }

    @When("user click purchase button")
    public void userClickPurchaseButton() {
        paymentPage.clickPurchaseBtn();
    }

    @Then("an pop up will appear with {string}")
    public void anPopUpWillAppearWith(String expected) {
        paymentPage.purchaseValidation(expected);
    }
}
