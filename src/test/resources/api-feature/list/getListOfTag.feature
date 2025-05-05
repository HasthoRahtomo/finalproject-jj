@api @get-all-tags
Feature: Get List Of Tags

  @positive
  Scenario: Tags-001 - Get tags with proper data including page and limit
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "user?"
    And I fill the page with "95"
    And I fill the limit with "10"
    And I set the api method to "Get"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 200

  @positive
  Scenario: Tags-002 - Get tags without page data
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "user?"
    And I fill the page with ""
    And I fill the limit with "10"
    And I set the api method to "Get"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 200

  @positive
  Scenario: Tags-003 - Get tags without limit data
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "user?"
    And I fill the page with "1"
    And I fill the limit with ""
    And I set the api method to "Get"
    When I set app-id to "63a804408eb0cb069b57e43a"
    Then The response status code should be 200

  @negative
  Scenario: Tags-004 - Get tags without app-id data
    Given The API base URL is "https://dummyapi.io/data/v1/"
    And I put a request to "user?"
    And I fill the page with "1"
    And I fill the limit with "10"
    And I set the api method to "Get"
    When I set app-id to ""
    Then The response status code should be 403