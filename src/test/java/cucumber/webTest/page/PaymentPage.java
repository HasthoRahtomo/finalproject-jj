package cucumber.webTest.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage extends AuthenticationElements{
    WebDriver driver;
    WebDriverWait wait;

    public PaymentPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickPlaceOrderBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(orderBtn));
        driver.findElement(orderBtn).click();
    }

    public void inputName(String name){
        wait.until(ExpectedConditions.elementToBeClickable(namePayment));
        driver.findElement(namePayment).sendKeys(name);
    }

    public void inputCountry(String country){
        driver.findElement(countryPayment).sendKeys(country);
    }

    public void inputCity(String city){
        driver.findElement(cityPayment).sendKeys(city);
    }

    public void inputCreditCard(String creditCard){
        driver.findElement(creditCardPayment).sendKeys(creditCard);
    }

    public void inputMonth(String month){
        driver.findElement(monthPayment).sendKeys(month);
    }

    public void inputYear(String year){
        driver.findElement(yearPayment).sendKeys(year);
    }

    public void clickPurchaseBtn(){
        driver.findElement(purchaseBtn).click();
    }

    public void purchaseValidation(String expected){
        wait.until(ExpectedConditions.presenceOfElementLocated(popUpText));
        Assertions.assertEquals(expected,driver.findElement(popUpText).getText());
    }
}
