@web @payment
Feature: Payment

  @positive
  Scenario: Buying item with correct format
    Given user in on the home page and already login
    And user click an item menu
    When user click add to cart button
    Then an alert pop up will appear with "Product added."
    And user click the cart button on the nav bar
    And user click the place order button
    And user input name text box with "John Doe"
    And user input country text box with "Indonesia"
    And user input city text box with "Fukuoka"
    And user input credit card text box with "1234123456"
    And user input month text box with "12"
    And user input year text box with "2025"
    When user click purchase button
    Then an pop up will appear with "Thank you for your purchase!"

  @negative
  Scenario: Buying item without filling the purchases form
    Given user in on the home page and already login
    And user click an item menu
    When user click add to cart button
    Then an alert pop up will appear with "Product added."
    And user click the cart button on the nav bar
    And user click the place order button
    And user input name text box with ""
    And user input country text box with ""
    And user input city text box with ""
    And user input credit card text box with ""
    And user input month text box with ""
    And user input year text box with ""
    When user click purchase button
    Then an alert pop up will appear with "Please fill out Name and Creditcard."

  @negative
  Scenario: Buying nothing
    Given user in on the home page and already login
    And user click the cart button on the nav bar
    And user click the place order button
    And user input name text box with "John Doe"
    And user input country text box with "Indonesia"
    And user input city text box with "Fukuoka"
    And user input credit card text box with "1234123456"
    And user input month text box with "12"
    And user input year text box with "2025"
    When user click purchase button
    Then an pop up will appear with "Thank you for your purchase!"