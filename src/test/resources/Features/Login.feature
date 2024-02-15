Feature: Verify Login scenarios

  Scenario: Verify login for valid credentials
    Given user enters parameters "standard_user" "secret_sauce"
    And user clicks login button
    Then user should be logged in successfully

  Scenario Outline: Verify login for valid credentials
    Given user enters parameters "<username>" "<password>"
    And user clicks login button
    Then user should be logged in successfully

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
