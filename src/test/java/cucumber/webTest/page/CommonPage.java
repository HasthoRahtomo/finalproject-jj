package cucumber.webTest.page;

import org.openqa.selenium.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CommonPage extends AuthenticationElements{
    WebDriverWait wait;
    WebDriver driver;

    public CommonPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void isAlertPopUp(String expected){
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        Assertions.assertEquals(expected,actualText);
        alert.accept();
    }

    public void clickCartAtNavbarBtn() {
        driver.findElement(cartBtn).click();
    }
}
