Feature: Verify login functionality

  @LoginTest
  Scenario: login test with valid test data
    Given user is on home page
    Then user redirected to "LoginPage"
    When user entered "standard_user" on "username" field of "LoginPage"
    And user entered "secret_sauce" on "password" field of "LoginPage"
    Then user clicked on "signInButton" on "LoginPage"
    Then user redirected to "MyAccountPage"
    And user clicked on "FirstProduct" on "SearchPage"
    Then user clicked on "buttonAddToCart" on "ProductPage"
    And user closed the browser