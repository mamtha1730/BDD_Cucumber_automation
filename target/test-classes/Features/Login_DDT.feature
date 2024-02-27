Feature: Login Data Driven with Excel

  Scenario Outline: Login Data Driven Excel
    Given user enters parameters with excel row "<row_index>"
    And user clicks login button
    Then user should be logged in successfully

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |
      |         6 |
