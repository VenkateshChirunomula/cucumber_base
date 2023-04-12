Feature: Verify login functionality

  @LoginTest @E2E
  Scenario: login test with valid test data
    Given user is on home page
    Then user redirected to "LoginPage"
    When user entered "standard_user" on "username" field of "LoginPage"
    And user entered "secret_sauce" on "password" field of "LoginPage"
    Then user clicked on "signInButton" on "LoginPage"
    Then user redirected to "MyAccountPage"
    And user clicked on "FirstProduct" on "SearchPage"
    Then user clicked on "buttonAddToCart" on "ProductPage"
    Then user clicked on "buttonCart" on "ProductPage"
    #Then user redirected to "CartPage"
    Then user clicked on "buttonCheckout" on "CartPage"
    Then user redirected to "CheckoutPage"
    Then user entered "Venkatesh" on "FirstName" field of "CheckoutPage"
    Then user entered "Tester" on "LastName" field of "CheckoutPage"
    Then user entered "565667" on "ZipCode" field of "CheckoutPage"
    Then user clicked on "buttonContinue" on "CheckoutPage"
    Then user clicked on "buttonFinish" on "CheckoutPage"
    Then user validated the text of "thankYouMessage" should display as "Thank you for your order!" on "CheckoutCompletePage"
    #And user closed the browser