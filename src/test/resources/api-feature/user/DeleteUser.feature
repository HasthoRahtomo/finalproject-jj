@api @delete-user
Feature: Delete user by id

  @positive
  Scenario: DUBI-001 - Delete user data with proper data
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/"
    And I fill the user id with "60d0fe4f5311236168a109ce"
    And I set the api method to "Delete"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 200

  @negative
  Scenario: DUBI-002 - Delete user data with with invalid user id
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/"
    And I fill the user id with "Kasane Teto"
    And I set the api method to "Delete"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 400