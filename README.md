## Dependencies and notes
Note:

make sure "Cucumber for java" and "Gherkin" plugin are downloaded and activated by click ctrl + alt + s and then click the "plugins" menu (if you're using inteliJ) or by adding the maven script at gradle.build file

This project requires the following dependencies:

- Cucumber
- Selenium
- JUnit
- Gradle

## Project Structure

The project is organized as follows:

- `src/test/java/cucumber`: Contains the Page Object classes, step definition, base driver and execute class
- `src/test/java/cucumber/page`: Contains the Page Object classes
- `src/test/java/cucumber/stepDef`: Contains the the Step definitions for gherkin files and as a connector between gherkin to page folder
- `src/test/resources/`: Contains the Gherkin feature files
- `build.gradle`: Gradle build configuration file for dependencies and tasks.

## Where is the report result?

The report result can be found after executing the program, you can follow one of this step:
- write "./gradlew cucumber-api"" on terminal
- execute the CucumberRun class at 'src/test/java/cucumber/CucumberRun'
- execute the gherkin feature file

The report will appear in the "report" folder. The reports contain .html and .json files

## Setup and Configuration

- Clone this repository
- Run the gradle.build file for setup
- Type "./gradlew cucumber-api" in terminal to run for API test
- Type "./gradlew cucumber-web" in terminal to run for UI test
- You can use '-Ptags="@api"' to enable tag. For example './gradlew cucumber-api -Ptags="@api"'

## Feature file example

@login

Feature: Login

  @valid-login
  
  Scenario: Login with correct username and password. Expectation: user will redirect to home page
  
    Given user in on the login page
    
    And user input username text box with "standard_user"
    
    And User input password text box with "secret_sauce"
    
    When user click login button
    
    Then user will redirect to the home page

## Page Object Class example

package cucumber.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;

    By usernameInputTest = By.xpath("//*[@id=\"user-name\"]");
    By passwordInputTest = By.xpath("//*[@id=\"password\"]");
    By loginBtn = By.xpath("//*[@id=\"login-button\"]");

    public loginPage(WebDriver driver){
        this.driver = driver;
    }
  }

## Step definition example

package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.page.loginPage;
import cucumber.baseText;

public class loginStepDef extends baseText {
    loginPage loginPage;

    @Given("user in on the login page")
    public void userInOnTheLoginPage() {
        loginPage = new loginPage(driver);
        loginPage.goToLoginPage();
    }
  }
