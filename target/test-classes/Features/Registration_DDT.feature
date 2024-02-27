Feature: To test sample set of  registration

  Scenario Outline: Validate registration data being successfully added
    Given customer click register  under Myaccout
    When user enters parameters with excel row "<row_index>"
    And user clicks privacy checkbox
    And user click continue button to register
    Then verify user registration account has created
    And user clicks logout under Myaccount

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      
      
      
     