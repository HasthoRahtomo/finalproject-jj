@api @get-user-by-id
Feature: Get single user by id

  @positive
  Scenario: GUBI-001 - Get user data with proper data
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/"
    And I fill the user id with "681787b5bc2dae9822f7970d"
    And I set the api method to "Get"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 200

  @negative
  Scenario: GUBI-002 - Get user data with with invalid user id
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/"
    And I fill the user id with "Kasane Teto"
    And I set the api method to "Get"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 400