Feature: Verify various Homepage options

  Background: Verify login for valid credentials
    Given user enters parameters "standard_user" "secret_sauce"
    And user clicks login button
    Then user should be logged in successfully

  Scenario: Verify homepage menu
    Given user is in homepage and click homepage icon
    Then user chooses nameselect

  