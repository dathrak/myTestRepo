Feature: Home Test Cases

  Scenario: Verify user can search for an item
    Given I want to launch application on "chrome"
    And I want to search for an item "camera" from "Amazon Warehouse" category
    Then I want to verify search results "1-24 of over 6,000 results for" value

  Scenario Outline: Verify user can search for multiple items
    Given I want to launch application on "chrome"
    And I want to search for an item '<item>' from '<catge>' category
    Then I want to verify search results "1-24 of over 6,000 results for" value
    Examples: 
      | item   | 			catge 					|
      | iphone |     Amazon Warehouse |
      | camera |     Amazon Warehouse |