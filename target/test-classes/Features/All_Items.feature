Feature: Verify user able to buy a product 

  Background: Verify login for valid credentials
    Given user enters parameters "standard_user" "secret_sauce"
    And user clicks login button
    Then user should be logged in successfully

  Scenario: Verify user buy sauce_labs_backpack
    Given user clicks sauce_labs_backpack
    And user clicks cart_icon
    And user clicks check_out_button
    And user enters his info
    And user clicks finish_button
    And user clicks Back_home
    Then validate success buy
