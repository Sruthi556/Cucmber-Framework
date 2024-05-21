Feature: feature to test Google search functionality

  Scenario: validate Google search is working
  
    Given browser is open
    And user is on Google search page
    When user enter text in a search box
    And hits enter
    Then user navigate to Search results
