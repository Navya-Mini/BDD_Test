@Login
Feature: User Login
  User should be able to login using valid credentials

  @Valid
  Scenario Outline: Testing Login with Valid credentials
    Given I am on Login page
    When I enter <username> and <Password>
    And I click on submit button
    Then user clicks on new customer for verification

    Examples: 
      | username   | Password    |
      | mngr397779 | K8KHvTADODw=|
