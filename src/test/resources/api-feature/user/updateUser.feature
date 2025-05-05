@api @update-user
Feature: Update user

  @positive
  Scenario: UU-001 - Update user with proper data
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/"
    And I fill the user id with "681787b5bc2dae9822f7970d"
    And I fill the firstName with "kasane"
    And I fill the lastName with "Teto"
    And I set the api method to "Put"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 200

  @positive
  Scenario: UU-002 - Update user only first name changed
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/"
    And I fill the user id with "681787b5bc2dae9822f7970d"
    And I fill the firstName with "kasane"
    And I set the api method to "Put"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 200

  @negative
  Scenario: UU-003 - Update user with without id
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/"
    And I fill the firstName with "kasane"
    And I fill the lastName with "Teto"
    And I set the api method to "Put"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 404

  @negative
  Scenario: UU-004 - Update user with weird id
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/"
    And I fill the user id with "Kasane Teto"
    And I fill the firstName with "kasane"
    And I fill the lastName with "Teto"
    And I set the api method to "Put"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 400

