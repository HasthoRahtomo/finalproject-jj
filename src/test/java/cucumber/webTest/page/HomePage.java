package cucumber.webTest.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HomePage extends AuthenticationElements{

    WebDriver driver;
    String usernameText;
    WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void goToHomePage(){
        driver.get("https://www.demoblaze.com/index.html");
    }

    public void clickTheLoginButtonAtNavBar(){
        driver.findElement(loginPopUpBtn).click();
    }

    public void clickTheSignupButtonAtNavBar(){
        driver.findElement(signupPopUpBtn).click();
    }

    public void inputUsernameSignup(String username){
        wait.until(ExpectedConditions.elementToBeClickable(usernameInputSign));
        driver.findElement(usernameInputSign).sendKeys(username);
    }

    public void inputPasswordSignup(String password){
        wait.until(ExpectedConditions.elementToBeClickable(passwordInputSign));
        driver.findElement(passwordInputSign).sendKeys(password);
    }

    public void clickTheSignupButton(){
        driver.findElement(signupBtn).click();
    }

    public void inputUsername(String username){
        usernameText = username;
        wait.until(ExpectedConditions.elementToBeClickable(usernameInput));
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void inputPassword(String password){
        wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickTheLoginButton(){
        driver.findElement(loginBtn).click();
    }

    public void loginSuccessValidation(){
        wait.until(ExpectedConditions.textToBe(loginValidation, "Welcome "+usernameText));

        Assertions.assertEquals("Welcome "+usernameText,driver.findElement(loginValidation).getText());
        Assertions.assertTrue(driver.findElement(logoutBtn).isDisplayed());
    }

    public void performLogin(String username, String password) {
        goToHomePage();
        clickTheLoginButtonAtNavBar();
        inputUsername(username);
        inputPassword(password);
        clickTheLoginButton();
        loginSuccessValidation();
    }

    public void clickTheLogoutButton(){
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
        driver.findElement(logoutBtn).click();
    }

    public void logoutValidation(){
        wait.until(ExpectedConditions.presenceOfElementLocated(loginPopUpBtn));
        Assertions.assertTrue(driver.findElement(loginPopUpBtn).isDisplayed());
    }

    public void clickTheProductImage(){
    wait.until(ExpectedConditions.elementToBeClickable(productImage));
        driver.findElement(productImage).click();
    }

    public void clickContactInTheNavBar(){
        driver.findElement(contactBtn).click();
    }

    public void inputContactEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(contactEmailInput));
        driver.findElement(contactEmailInput).sendKeys(email);
    }

    public void inputContactName(String name){
        wait.until(ExpectedConditions.elementToBeClickable(contactNameInput));
        driver.findElement(contactNameInput).sendKeys(name);
    }

    public void inputContactMessage(String message){
        wait.until(ExpectedConditions.elementToBeClickable(contactMessageInput));
        driver.findElement(contactMessageInput).sendKeys(message);
    }

    public void clickSendMessageBtn(){
        driver.findElement(sendMessageBtn).click();
    }
}
