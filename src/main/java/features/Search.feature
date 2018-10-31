Feature: Check Search functionality 

Scenario Outline: Check Search functionality with valid and invalid data
    Given user is on Vacation Exotica home page
    When user clicks on search icon 
    And enters search as "<Searchdata>"
    And press enter button
    Then user able to see data related to entered search

Examples:
|Searchdata|
|london|
|RRRRR|