Feature: Verify login functionality

  @Login
  Scenario: login test with valid test dat
    Given user is on home page
    Then user clicked on "LoginButton" on "HomePage"
    Then user redirected to "LoginPage"
    When user entered "username" on "LoginPage"
    And user entered "password" on "LoginPage"
    Then user clicked on "signInButton" on "LoginPage"
    Then user redirected to "MyAccountPage"
    Then user entered "SearchText" on "MyAccountPage"
    And user clicked on "FirstProduct" on "SearchPage"

  @LoginTest
  Scenario: login test with valid test data
    Given user is on home page
    Then user redirected to "LoginPage"
    When user entered "standard_user" on "username" field on "LoginPage"
    And user entered "secret_sauce" on "password" field on "LoginPage"
    Then user clicked on "signInButton" on "LoginPage"
    Then user redirected to "MyAccountPage"
    And user clicked on "FirstProduct" on "SearchPage"
    Then user clicked on "buttonAddToCart" on "ProductPage"
    And user closed the browser