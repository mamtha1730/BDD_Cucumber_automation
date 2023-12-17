Feature: Verify Login scenarios

  Background: Verify login for valid credentials
    When user enters parameters "standard_user" "secret_sauce"
    And user clicks login button
   Then user should be logged in successfully

  Scenario: Verify homepage menu
    When user is in homepage and click homepage icon
    Then menu items are displayed

  Scenario: Verify user buy sauce_labs_backpack
    When user clicks sauce_labs_backpack
    And user clicks cart_icon
    And user clicks check_out_button
    And user enters his info
    And user clicks finish_button
    And user clicks Back_home

  #Scenario: Verify About page
  #When user is in homepage and click homepage icon
  #And user clicks about icon
  #Then menu items are displayed
  #Then user views about items
  
  Scenario: Verify select option display
    Given user is home page and clicks select icon
    Then user views contents according to his selection
