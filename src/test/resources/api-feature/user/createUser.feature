@api @create-user
Feature: Create user

  @positive
  Scenario: CU-001 - Create user with proper data
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/create"
    And I fill the firstName with "John"
    And I fill the lastName with "Key"
    And I fill the email with "random"
    And I set the api method to "Post"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 200

  @negative
  Scenario: CU-002 - Create user without email
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/create"
    And I fill the firstName with "lil"
    And I fill the lastName with "pump"
    And I fill the email with ""
    And I set the api method to "Post"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 400

  @negative
  Scenario: CU-003 - Create user without name
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/create"
    And I fill the firstName with ""
    And I fill the lastName with ""
    And I fill the email with "book@gmail.com"
    And I set the api method to "Post"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 400

  @negative
  Scenario: CU-003 - Create user without data
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/create"
    And I fill the firstName with ""
    And I fill the lastName with ""
    And I fill the email with ""
    And I set the api method to "Post"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 400

  @negative
  Scenario: CU-004 - Create user with an existing data
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "/user/create"
    And I fill the firstName with "jane"
    And I fill the lastName with "do re mi"
    And I fill the email with "MouseGamingTWS@gmail.com"
    And I set the api method to "Post"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 400