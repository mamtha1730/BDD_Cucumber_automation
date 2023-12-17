Feature: Verify Login multiple scenarios

  Scenario Outline: Verify login for valid credentials
    #Given browser is open
    #When user is in login page
    When user enters parameters <username> <password>
    And user clicks login button
    Then user should be logged in successfully

    Examples: 
      | username                  | password       |
      | "standard_user"           | "secret_sauce" |
      | "locked_out_user"         | "secret_sauce" |
      | "problem_user"            | "secret_sauce" |
      | "performance_glitch_user" | "secret_sauce" |
