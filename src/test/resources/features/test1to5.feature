@HU @Regression
Feature: Test Cases 1, 2, 3, 4, and 5

  As an User I want to check
  Test Case 1 Register User
  Test Case 2 Login User with correct email and password
  Test Case 3 Login User with incorrect email and password
  Test Case 4 Logout User
  Test Case 5 Register User with existing email


  Background: User is on Homepage and click on Signup/Login button
    Given I launch the browser
    And I navigate to given url
    And I verify that home page is visible successfully
    And I click on 'Signup / Login' button


  @Sanity @Smoke @Regression
  Scenario: Test Case 1 Register User
    When I verify 'New User Signup!' is visible
    And I enter name "Neil" and email "nctest123@test.com" address
    And I click 'Signup' button
    And I verify that 'ENTER ACCOUNT INFORMATION' is visible
    And I fill details: Title "Mr" Password "Pen2paper" DOBDay "5" DOBMonth "August" DOBYear "2003"
    And I select checkbox Sign up for our newsletter!
    And I select checkbox Receive special offers from our partners!
    And I fill details: First name "Neil" Last name "Cooper" Company "Cooper & Co" Address "Barr Road" AddressLine "Bath" Country "India" State "Bihar" City "Patna" Zipcode "117 657" Mobile Number "099887 766554"
    And I click 'Create Account button'
    And I verify that 'ACCOUNT CREATED!' page is visible
    And I click Continue button
    And I see that 'Logged in as Neil' is visible
    Then  I click the 'Delete Account' button
    And  I verify that 'ACCOUNT DELETED!' is visible and click Continue button


  @Smoke @Regression
  Scenario: Test Case 2: Login User with correct email and password
    When I verify 'New User Signup!' is visible
    And I enter name "Neil" and email "ncstar333@test.com" address
    And I click 'Signup' button
    And I verify that 'ENTER ACCOUNT INFORMATION' is visible
    And I fill details: Title "Mr" Password "Pen2paper" DOBDay "5" DOBMonth "August" DOBYear "2003"
    And I select checkbox Sign up for our newsletter!
    And I select checkbox Receive special offers from our partners!
    And I fill details: First name "Neil" Last name "Cooper" Company "Cooper & Co" Address "Barr Road" AddressLine "Bath" Country "India" State "Bihar" City "Patna" Zipcode "117 657" Mobile Number "099887 766554"
    And I click 'Create Account button'
    And I verify that 'ACCOUNT CREATED!' page is visible
    And I click Continue button
    And I see that 'Logged in as Neil' is visible
    And I click on 'Logout' button
    And I verify Login to your account 'Login to your account' is visible
    And I enter correct email address "ncstar123@test.com" and password "Pen2paper"
    And I click Login 'login' button
    And I see that 'Logged in as Neil' is visible
    Then I click on 'Delete Account' button
    And I verify that the 'ACCOUNT DELETED!' is visible


  @Regression
  Scenario: Test Case 3: Login User with incorrect email and password
    When I verify Login to your account 'Login to your account' is visible
    And I enter incorrect email address "ncooper@test.com" and password "Pen2paper"
    And I click Login 'login' button
    Then Verify error 'Your email or password is incorrect!' is visible


  @Regression
  Scenario: Test Case 4: Logout User
    When I verify 'New User Signup!' is visible
    And I enter name "Neil" and email "ncooper61@test.com" address
    And I click 'Signup' button
    And I verify that 'ENTER ACCOUNT INFORMATION' is visible
    And I fill details: Title "Mr" Password "Pen2paper" DOBDay "5" DOBMonth "August" DOBYear "2003"
    And I select checkbox Sign up for our newsletter!
    And I select checkbox Receive special offers from our partners!
    And I fill details: First name "Neil" Last name "Cooper" Company "Cooper & Co" Address "Barr Road" AddressLine "Bath" Country "India" State "Bihar" City "Patna" Zipcode "117 657" Mobile Number "099887 766554"
    And I click 'Create Account button'
    And I verify that 'ACCOUNT CREATED!' page is visible
    And I click Continue button
    And I click on 'Logout' button
    And I verify Login to your account 'Login to your account' is visible
    And I enter correct email address "ncooper61@test.com" and password "Pen2paper"
    And I click Login 'login' button
    And I see that 'Logged in as Neil' is visible
    Then I click on 'Logout' button
    And I verify that user is navigated to login page


  @Regression
  Scenario: Test Case 5: Register User with existing email
    When I verify 'New User Signup!' is visible
    And I enter name "Neil" and email "ncooper61@test.com" address
    And I click 'Signup' button
    Then Verify error Email Address already exist! 'Email Address already exist!' is visible