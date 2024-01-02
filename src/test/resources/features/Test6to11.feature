@HU @Regression
Feature: Test Cases 6, 7, 8, 9, 10 and 11

  As an User I want to check
  Test Case 6 Contact Us Form
  Test Case 7 Verify Test Cases Page
  Test Case 8 Verify All Products and product detail page
  Test Case 9 Search Product
  Test Case 10 Verify Subscription in home page
  Test Case 11 Verify Subscription in Cart page


  Background: User is on Homepage and click on Signup/Login button
    Given I launch the browser
    And I navigate to given url
    And I verify that home page is visible successfully


  @Sanity @Smoke @Regression
  Scenario: Test Case 6 Contact Us Form
    When I click on 'Contact Us' button
    And I verify GET IN TOUCH 'GET IN TOUCH' is visible
    And I enter name "Neil" email "ncstar000@test.com" subject "Feedback" and message "Excellent Website for Automation"
    And I upload file
    And I click submit 'Submit' button
    And I click OK button
    And I Verify success message 'Success! Your details have been submitted successfully.' is visible
    Then I click 'Home' button and verify that landed to home page successfully


  @Smoke @Regression
  Scenario: Test Case 7 Verify Test Cases Page
    When I click on 'Test Cases' button
    Then I verify user is navigated to test cases page successfully


  @Regression
  Scenario: Test Case 8 Verify All Products and product detail page
    When I click on Products 'Products' button
    And I verify user is navigated to ALL PRODUCTS "ALL PRODUCTS" page successfully
    And I see The products list is visible
    And I click on view product of first product "Blue Top"
    And I user is landed to product detail page
    Then I verify that product name detail "Blue Top" is visible
    And I verify that category detail "Category: Women > Tops" is visible
    And I verify that price detail "Rs. 500" is visible
    And I verify that availability detail "Availability: In Stock" is visible
    And I verify that condition detail "Condition: New" is visible
    And I verify that brand detail "Brand: Polo" is visible


  @Regression
  Scenario: Test Case 9 Search Product
    When I click on Products 'Products' button
    And I verify user is navigated to ALL PRODUCTS "ALL PRODUCTS" page successfully
    And I Enter product name "jeans" in search input and click search button
    And I Verify 'SEARCHED PRODUCTS' is visible
    And I Verify all the products related to search are visible


  @Regression
  Scenario: Test Case 10: Verify Subscription in home page
    When I scroll down to footer
    And I verify text 'SUBSCRIPTION'
    And I enter email address "ncstar001@test.com" in input and click arrow button
    Then I verify success message 'You have been successfully subscribed!' is visible


  @Regression
  Scenario: Test Case 11 Verify Subscription in Cart page
    When I click on 'Cart' button
    And I scroll down to footer
    And I verify text 'SUBSCRIPTION'
    And I enter email address "ncstar001@test.com" in input and click arrow button
    And I verify success message 'You have been successfully subscribed!' is visible