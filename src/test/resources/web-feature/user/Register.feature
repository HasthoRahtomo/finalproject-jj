@web @register
Feature: Register

  @positive
  Scenario: Register with correct username and password
    Given user in on the home page
    And user click sign up button at the navigation bar
    And user input username text box on sign up pop up with "random"
    And User input password text box on sign up pop up with "random"
    When user click sign up button
    Then an alert pop up will appear with "Sign up successful."
    And User will trying login using created account

  @negative
  Scenario: Register without password
    Given user in on the home page
    And user click sign up button at the navigation bar
    And user input username text box on sign up pop up with "random"
    And User input password text box on sign up pop up with ""
    When user click sign up button
    Then an alert pop up will appear with "Please fill out Username and Password."

  @negative
  Scenario: Register with existing user
    Given user in on the home page
    And user click sign up button at the navigation bar
    And user input username text box on sign up pop up with "Gaming_mouse"
    And User input password text box on sign up pop up with "12341234"
    When user click sign up button
    Then an alert pop up will appear with "This user already exist."