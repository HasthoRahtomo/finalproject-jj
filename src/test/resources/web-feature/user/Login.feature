@web @login
Feature: Login

  @positive
  Scenario: Login with correct username and password
    Given user in on the home page
    And user click login button at the navigation bar
    And user input username text box with "Gaming_mouse"
    And User input password text box with "12345678"
    When user click login button
    Then there is a user's username on the top left, the login success

  @negative
  Scenario: Login with correct without password
    Given user in on the home page
    And user click login button at the navigation bar
    And user input username text box with "Gaming_mouse"
    And User input password text box with ""
    When user click login button
    Then an alert pop up will appear with "Please fill out Username and Password."

  @negative
  Scenario: Login with correct without data
    Given user in on the home page
    And user click login button at the navigation bar
    And user input username text box with ""
    And User input password text box with ""
    When user click login button
    Then an alert pop up will appear with "Please fill out Username and Password."

  @negative
  Scenario: Login with invalid user
    Given user in on the home page
    And user click login button at the navigation bar
    And user input username text box with "HEADSET_GAMING_WARNA_HITAM"
    And User input password text box with "12341234"
    When user click login button
    Then an alert pop up will appear with "User does not exist."

  @negative
  Scenario: Login with valid user but wrong password
    Given user in on the home page
    And user click login button at the navigation bar
    And user input username text box with "Gaming_mouse"
    And User input password text box with "11113333"
    When user click login button
    Then an alert pop up will appear with "Wrong password."
