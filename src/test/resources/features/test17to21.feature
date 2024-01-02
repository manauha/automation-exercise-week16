@HU @Regression
Feature: Test 17, Test 18, Test 19, Test 20 and Test 21

  As an User, I want to check
  Test Case 17 Remove Products From Cart
  Test Case 18 View Category Products
  Test Case 19 View & Cart Brand Products
  Test Case 20 Search Products and Verify Cart After Login
  Test Case 21 Add review on product


  Background: User is on Homepage and verify that
    Given I launch the browser
    And I navigate to given url
    And I verify that home page is visible successfully


  @Sanity @Smoke @Regression
  Scenario: Test Case 17 Remove Products From Cart
    When I mouse hover on product "Cotton Silk Hand Block Print Saree" and Add to cart
    And I click on Continue Shopping
    And I mouse hover on product "Beautiful Peacock Blue Cotton Linen Saree" and Add to cart
    And I click on Continue Shopping
    And I mouse hover on product "Rust Red Linen Saree" and Add to cart
    And I click View Cart button
    And I verify that cart page is displayed
    And I click X button corresponding to particular product "Cotton Silk Hand Block Print Saree"
    And I click X button corresponding to particular product "Beautiful Peacock Blue Cotton Linen Saree"
    And I click X button corresponding to particular product "Rust Red Linen Saree"
    Then I verify that product is removed from the cart


  @Smoke @Regression
  Scenario:  Test Case 18 View Category Products
    When I verify that categories are visible on left side bar
    And I click on "Women" category
    And I click on sub category of above category "Dress"
    And I verify sub category page is displayed and confirm text "WOMEN - DRESS PRODUCTS"
    And I click on "Men" category
    And I click on sub-category of Men category "Jeans"
    And I verify that user is navigated to "MEN - JEANS PRODUCTS" category page


  @Regression
  Scenario: Test Case 19 View & Cart Brand Products
    When I click on Products 'Products' button
    And I verify that Brands are visible on left side bar
    And  I click on "Babyhug" brand name
    And  I verify that user is navigated to brand page "TEXT"
    And  I click on "Madame" brand name
    And  I verify that user is navigated to that brand page "TEXT1"



@Regression
Scenario:  Test Case 20 Search Products and Verify Cart After Login
  When I click on Products 'Products' button
  And I verify user is navigated to All Products "ALL PRODUCTS" page successfully
  And I enter "Cotton Mull Embroidered Dress" in search input and click
  And I verify SEARCHED PRODUCTS "SEARCHED PRODUCTS" is visible
  And I add "Cotton Mull Embroidered Dress products" to cart
  And I click on View Cart button
  And I click on 'Signup / Login' button
  And I enter correct email address "ncstar000@test.com" and password "Pen2paper"
  And I click Login 'login' button
  And I see that 'Logged in as Neil' is visible
  And I click on 'Cart' button
  #Then I verify that those products are visible in cart after login as well



  @Regression
  Scenario: Test Case 21 Add review on product
    When I click on Products 'Products' button
    And I verify user is navigated to ALL PRODUCTS "ALL PRODUCTS" page successfully
    And I click on View Product 'View Product' button
    And I verify Write Your Review 'WRITE YOUR REVIEW' is visible
    And I enter name "Neil"  email "ncstar001@test.com" and review "Good Product"
    Then I click on Review Submit button
    And I verify success message 'Thank you for your review.'