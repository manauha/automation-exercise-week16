@HU @Regression
Feature: Test Cases 22, 23, 24, 25 and 26

  As a User I want to check
  Test Case 22 Add to cart from Recommended items
  Test Case 23 Verify address details in checkout page
  Test Case 24 Download Invoice after purchase order
  Test Case 25 Verify Scroll Up using 'Arrow' button and Scroll Down functionality
  Test Case 26 Verify Scroll Up without 'Arrow' button and Scroll Down functionality


  Background: User is on Homepage and verify that
    Given I launch the browser
    And I navigate to given url
    And I verify that home page is visible successfully


  @Sanity @Smoke @Regression
  Scenario: Test Case 22 Add to cart from Recommended items
    When I scroll to bottom of page
    And I verify 'RECOMMENDED ITEMS' are visible
    And I Add to cart 'Blue Top' from Recommended Items
    Then I click on View Cart button
    #And I verify that product is displayed in cart page


  @Smoke @Regression
  Scenario: Test Case 23 Verify address details in checkout page
    When I click on 'Signup / Login' button
    And I enter name "Neil" and email "ncstaraap@test.com" address
    And I click 'Signup' button
    And I fill details: Title "Mr" Password "Pen2paper" DOBDay "5" DOBMonth "August" DOBYear "2003"
    And I select checkbox Sign up for our newsletter!
    And I select checkbox Receive special offers from our partners!
    And I fill details: First name "Neil" Last name "Cooper" Company "Cooper & Co" Address "Barr Road" AddressLine "Bath" Country "India" State "Bihar" City "Patna" Zipcode "117 657" Mobile Number "099887 766554"
    And I click 'Create Account button'
    And I verify that 'ACCOUNT CREATED!' page is visible
    And I click Continue button
    And I see that 'Logged in as Neil' is visible
    And I click on "Fancy Green Top" for any product on home page
    And I click to 'Add to cart' button
    And I click on Continue Shopping
    And I click on Products 'Products' button
    And I click on "Winter Top" for any product on home page
    And I click to 'Add to cart' button
    And I click View Cart button
    And I verify that cart page is displayed
    And I click Proceed To Checkout
    #And I verify that the delivery address is same address filled at the time registration of account
    #And I verify that the billing address is same address filled at the time registration of account
    Then  I click the 'Delete Account' button
    And  I verify that 'ACCOUNT DELETED!' is visible and click Continue button

  @Regression
  Scenario:  Test Case 24 Download Invoice after purchase order
    When I click on "Fancy Green Top" for any product on home page
    And I click to 'Add to cart' button
    And I click on Continue Shopping
    And I click on Products 'Products' button
    And I click on "Winter Top" for any product on home page
    And I click to 'Add to cart' button
    And I click View Cart button
    And I verify that cart page is displayed
    And I click Proceed To Checkout
    And I click on Register Login button
    And I enter name "Neil" and email "ncstaraao@test.com" address
    And I click 'Signup' button
    And I fill details: Title "Mr" Password "Pen2paper" DOBDay "5" DOBMonth "August" DOBYear "2003"
    And I select checkbox Sign up for our newsletter!
    And I select checkbox Receive special offers from our partners!
    And I fill details: First name "Neil" Last name "Cooper" Company "Cooper & Co" Address "Barr Road" AddressLine "Bath" Country "India" State "Bihar" City "Patna" Zipcode "117 657" Mobile Number "099887 766554"
    And I click 'Create Account button'
    And I verify that 'ACCOUNT CREATED!' page is visible
    And I click Continue button
    And I see that 'Logged in as Neil' is visible
    And I click Cart button
    And I click Proceed To Checkout
    And I Verify Address Details and Review Your Order
    And I enter description in comment text area and click 'Place Order'
    And I enter payment details Name on Card "Neil Cooper" Card Number "4545 6767 3434 1212"  CVC "342" Expiration Month "09" and Year "2027"
    And I click Pay and Confirm Order button
    And I verify the success message 'Your order has been placed successfully!'
    And I click 'Download Invoice' button and verify invoice is downloaded successfully.
    And I Click Continue button
    Then I click the 'Delete Account' button
    And  I verify that 'ACCOUNT DELETED!' is visible and click Continue button


  @Regression
  Scenario: Test Case 25 Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    When I scroll down page to bottom
    And I verify text 'SUBSCRIPTION'
    Then I click on arrow at bottom right side to move upward
    And I verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen


  @Regression
  Scenario: Test Case 26 Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    When I scroll down page to bottom
    And I verify text 'SUBSCRIPTION'
    And I scroll up page to top
    Then I verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen