@HU @Regression
Feature: Test Cases 12, 13, 14, 15 and 16

  As an User, I want to check
  Test Case 12: Add Products in Cart
  Test Case 13: Verify Product quantity in Cart
  Test Case 14: Place Order: Register while Checkout
  Test Case 15: Place Order: Register before Checkout
  Test Case 16: Place Order: Login before Checkout


  Background: User is on Homepage and click on Signup/Login button
    Given I launch the browser
    And I navigate to given url
    And I verify that home page is visible successfully

  @Sanity @Smoke @Regression
  Scenario: Test Case 12 Add Products in Cart
    When I click on Products 'Products' button
    And I hover over "Blue Top" and click Add to cart
    And I click Continue Shopping button
    And I hover over "Men Tshirt" and click Add to cart
    And I click View Cart button
    Then I verify both products are added to Cart
    And I verify their prices, quantity and total price

  @Smoke @Regression
  Scenario: Test Case 13 Verify Product quantity in Cart
    When I click on "Fancy Green Top" for any product on home page
    And I verify that product name detail "Fancy Green Top" is visible
    And I verify that category detail "Category: Women > Tops" is visible
    And I verify that price detail "Rs. 700" is visible
    And I verify that availability detail "Availability: In Stock" is visible
    And I verify that condition detail "Condition: New" is visible
    And I verify that brand detail "Brand: Polo" is visible
    And I increase quantity to four "4"
    And  I click to 'Add to cart' button
    Then I click View Cart button
    And  I verify that product is displayed in cart page with exact quantity "4"

  @Regression
  Scenario:  Test Case 14 Place Order Register while Checkout
    When I click on "Fancy Green Top" for any product on home page
    And  I click to 'Add to cart' button
    And I verify that product name detail "Fancy Green Top" is visible
    And I verify that cart page is displayed
    And I click Proceed To Checkout
    And I click on 'Signup / Login' button
    And I enter name "Neil" and email "ncstaraax@test.com" address
    And I click 'Signup' button
    And I fill details: Title "Mr" Password "Pen2paper" DOBDay "5" DOBMonth "August" DOBYear "2003"
    And I select checkbox Sign up for our newsletter!
    And I select checkbox Receive special offers from our partners!
    And I fill details: First name "Neil" Last name "Cooper" Company "Cooper & Co" Address "Barr Road" AddressLine "Bath" Country "India" State "Bihar" City "Patna" Zipcode "117 657" Mobile Number "099887 766554"
    And I click 'Create Account button'
    And I verify that 'ACCOUNT CREATED!' page is visible
    And I click Continue button
    And I see that 'Logged in as Neil' is visible
    And I click on 'Cart' button
    And I click Proceed To Checkout
    And I Verify Address Details and Review Your Order
    And I enter description in comment text area and click 'Place Order'
    And I enter payment details Name on Card "Neil Cooper" Card Number "4545 6767 3434 1212"  CVC "342" Expiration Month "09" and Year "2027"
    And I click Pay and Confirm Order button
    And I verify the success message 'Your order has been placed successfully!'
    Then  I click the 'Delete Account' button
    And  I verify that 'ACCOUNT DELETED!' is visible and click Continue button

  @Regression
  Scenario: Test Case 15: Place Order: Register before Checkout
    When I click on 'Signup / Login' button
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
    And I click on "Fancy Green Top" for any product on home page
    And  I click to 'Add to cart' button
    And I verify that product name detail "Fancy Green Top" is visible
    And I click Proceed To Checkout
    And I Verify Address Details and Review Your Order
    And I enter description in comment text area and click 'Place Order'
    And I enter payment details Name on Card "Neil Cooper" Card Number "4545 6767 3434 1212"  CVC "342" Expiration Month "09" and Year "2027"
    And I click Pay and Confirm Order button
    And I verify the success message 'Your order has been placed successfully!'
    Then  I click the 'Delete Account' button
    And  I verify that 'ACCOUNT DELETED!' is visible and click Continue button

  @new
  Scenario: Test Case 16: Place Order Login before Checkout
    When I click on 'Signup / Login' button
    And I enter correct email address "ncooper61@test.com" and password "Pen2paper"
    And I click Login 'login' button
    And I see that 'Logged in as Neil' is visible
    And I click on "Fancy Green Top" for any product on home page
    And I click to 'Add to cart' button
    And I click View Cart button
    And I verify that product name detail "Fancy Green Top" is visible
    And I click Proceed To Checkout
    And I Verify Address Details and Review Your Order
    And I enter description in comment text area and click 'Place Order'
    And I enter payment details Name on Card "Neil Cooper" Card Number "4545 6767 3434 1212"  CVC "342" Expiration Month "09" and Year "2027"
    And I click Pay and Confirm Order button
    And I verify the success message 'Your order has been placed successfully!'
    Then I click the 'Delete Account' button
    And  I verify that 'ACCOUNT DELETED!' is visible and click Continue button