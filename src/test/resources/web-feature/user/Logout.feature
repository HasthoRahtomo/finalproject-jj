@web @logout
Feature: Logout

  @positive
  Scenario: Logout test after login
    Given user in on the home page and already login
    When user click logout button
    Then there is no user's username on the top left, then the logout success