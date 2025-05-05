@web @contact
Feature: Contact

  @positive
  Scenario: Send message with proper data
    Given user in on the home page
    And user click contact button
    And user input contact email text box with "John@gmail.com"
    And User input contact name text box with "john"
    And User input contact message text box with "Hai nama saya john"
    When user click send message button
    Then an alert pop up will appear with "Thanks for the message!!"

  @negative
  Scenario: Send message without message and email
    Given user in on the home page
    And user click contact button
    And user input contact email text box with ""
    And User input contact name text box with "Teto"
    And User input contact message text box with ""
    When user click send message button
    Then an alert pop up will appear with "Thanks for the message!!"