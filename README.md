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
  
UI Test:
- `src/test/java/cucumber/webTest/page`: Contains the Page Object classes
- `src/test/java/cucumber/webTest/stepDef`: Contains the the Step definitions for gherkin files and as a connector between gherkin to page folder
- `src/test/resources/web-feature/`: Contains the Gherkin feature files
- `build.gradle`: Gradle build configuration file for dependencies and tasks.

API Test:
- `src/test/java/cucumber/apiTest/page`: Contains the Page Object classes
- `src/test/java/cucumber/apiTest/stepDef`: Contains the the Step definitions for gherkin files and as a connector between gherkin to page folder
- `src/test/resources/api-feature/`: Contains the Gherkin feature files
- `build.gradle`: Gradle build configuration file for dependencies and tasks.

Other file:
- commonStep: Contain a step definition that used in multiple feature
- commonPage (UI): Contain a logic for step that used in multiple feature (for example: Given user in on the home page)
- AuthenticationElements (UI): Used to store variable
- Variable (API): same as AuthenticationElements, it used to store variable
- ExpectedVerification (API): used for verification logic (Almost all of the expected verification for API testing has similar code). It can be used multiple time
- SetVariable (API): is used to set a variable value form "variable" file


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

