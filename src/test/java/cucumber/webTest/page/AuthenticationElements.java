package cucumber.webTest.page;

import org.openqa.selenium.By;

public class AuthenticationElements {
    // Home page
    By loginPopUpBtn = By.xpath("//*[@id=\"login2\"]");
    By loginBtn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By usernameInput = By.xpath("//*[@id=\"loginusername\"]");
    By passwordInput = By.xpath("//*[@id=\"loginpassword\"]");
    By loginValidation = By.xpath("//*[@id=\"nameofuser\"]");
    By logoutBtn = By.xpath("//*[@id=\"logout2\"]");
    By signupPopUpBtn = By.xpath("//*[@id=\"signin2\"]");
    By signupBtn = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By usernameInputSign = By.xpath("//*[@id=\"sign-username\"]");
    By passwordInputSign = By.xpath("//*[@id=\"sign-password\"]");
    By productImage = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a");
    By contactBtn = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By contactEmailInput = By.xpath("//*[@id=\"recipient-email\"]");
    By contactNameInput = By.xpath("//*[@id=\"recipient-name\"]");
    By contactMessageInput = By.xpath("//*[@id=\"message-text\"]");
    By sendMessageBtn = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

    // product page
    By addToCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    By cartBtn = By.xpath("//*[@id=\"cartur\"]");

    // payment page
    By orderBtn = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By namePayment = By.xpath("//*[@id=\"name\"]");
    By countryPayment = By.xpath("//*[@id=\"country\"]");
    By cityPayment = By.xpath("//*[@id=\"city\"]");
    By creditCardPayment = By.xpath("//*[@id=\"card\"]");
    By monthPayment = By.xpath("//*[@id=\"month\"]");
    By yearPayment = By.xpath("//*[@id=\"year\"]");
    By purchaseBtn = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By popUpText = By.xpath("/html/body/div[10]/h2");
}
