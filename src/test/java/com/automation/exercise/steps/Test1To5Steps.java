package com.automation.exercise.steps;

import com.automation.exercise.pages.AccountCreatedPage;
import com.automation.exercise.pages.HomePage;
import com.automation.exercise.pages.LoginPage;
import com.automation.exercise.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test1To5Steps {

    /** ******************Background Steps *********************************/

    @Given("I launch the browser") //Hooks and ManageBrowser
    public void iLaunchTheBrowser() {
    }

    @And("I navigate to given url") //navigate to given url
    public void iNavigateToGivenUrl() {
    }

    @And("I verify that home page is visible successfully") //verify homepage
    public void iVerifyThatHomePageIsVisibleSuccessfully() {
        //System.out.println();
        Assert.assertTrue(new HomePage().verifyHomepage(),"Homepage Error");
    }

    @And("I click on {string} button") //click on login/sign up link
    public void iClickOnSignupLoginButton(String menu) {
        new HomePage().clickOnMenu(menu);
    }


    /** *************************Test 1********************************/

    @When("I verify Login to your account {string} is visible")
    public void iVerifyLoginToYourAccountLoginToYourAccountIsVisible(String loginToYourAccount) {
        Assert.assertEquals(new LoginPage().verifyLoginToYourAccount(),loginToYourAccount, "Login to your account - Error");
    }

    @And("I enter incorrect email address {string} and password {string}")
    public void iEnterIncorrectEmailAddressAndPassword(String email, String password) {
        new LoginPage().enterEmailAddressAndPassword(email,password);
    }

    @And("I click Login {string} button")
    public void iClickLoginLoginButton(String loginButton) {
        new LoginPage().clickOnLoginButton();
    }

    @Then("Verify error {string} is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String errorText){
        Assert.assertTrue(new LoginPage().getIncorrectIDPasswordText(errorText),"Error");
    }

    @When("I verify {string} is visible") // verify New User Signup!
    public void iVerifyNewUserSignupIsVisible(String newUserSignUp) {
        Assert.assertEquals(new LoginPage().verifyNewUserSignUp(), newUserSignUp, "New User Signup! - Error");
    }

    @And("I enter name {string} and email {string} address") // enter name and email
    public void iEnterNameAndEmailAddress(String name, String email) {
        new LoginPage().inputNameAndEmail(name, email);
    }

    @And("I click {string} button")
    public void iClickSignupButton(String signUp) {
        new LoginPage().clickOnSignUp();
    }

    @And("I verify that {string} is visible") //verify ENTER ACCOUNT INFORMATION
    public void iVerifyThatENTERACCOUNTINFORMATIONIsVisible(String signUpText) {
        Assert.assertEquals(new SignUpPage().verifySignUpPage(),signUpText, "ENTER ACCOUNT INFORMATION - Error");
    }

    @And("I fill details: Title {string} Password {string} DOBDay {string} DOBMonth {string} DOBYear {string}")
    public void iFillDetailsTitlePasswordDOBDayDOBMonthDOBYear(String title, String password, String day, String month, String year) {
        new SignUpPage().selectTitle();
        new SignUpPage().enterPassword(password);
        new SignUpPage().enterDayOfDateOfBirth(day);
        new SignUpPage().enterMonthOfDateOfBirth(month);
        new SignUpPage().enterYearOfDateOfBirth(year);
    }

    @And("I select checkbox Sign up for our newsletter!")
    public void iSelectCheckboxSignUpForOurNewsletter() {
        new SignUpPage().tickOnNewsletter();
    }

    @And("I select checkbox Receive special offers from our partners!")
    public void iSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        new SignUpPage().tickOnSpecialOffer();
    }

    @And("I fill details: First name {string} Last name {string} Company {string} Address {string} AddressLine {string} Country {string} State {string} City {string} Zipcode {string} Mobile Number {string}")
    public void iFillDetailsFirstNameLastNameCompanyAddressAddressLineCountryStateCityZipcodeMobileNumber(String firstName, String lastName, String company, String address, String addressLine, String county, String state, String city, String zipcode, String mobileNumber) {
        new SignUpPage().enterFirName(firstName);
        new SignUpPage().enterLastName(lastName);
        new SignUpPage().enterCompany(company);
        new SignUpPage().enterAddress(address);
        new SignUpPage().enterAddressLine(addressLine);
        new SignUpPage().enterCountry(county);
        new SignUpPage().enterState(state);
        new SignUpPage().enterCity(city);
        new SignUpPage().enterZipcode(zipcode);
        new SignUpPage().enterMobileNumber(mobileNumber);
    }

    @And("I click {string}")
    public void iClickCreateAccountButton(String createAccountButton) {
        new SignUpPage().clickOnCreateAccount();
    }

    @And("I verify that {string} page is visible")
    public void iVerifyThatACCOUNTCREATEDPageIsVisible(String accountCreated) {
        Assert.assertEquals(new AccountCreatedPage().verifyAccountCreated(),accountCreated, "ACCOUNT CREATED! - Error");
    }

    @And("I click Continue button")
    public void iClickContinueButton() {
        new AccountCreatedPage().clickOnContinue();
    }

    @And("I see that {string} is visible")
    public void iSeeThatLoggedInAsUsernameIsVisible(String userLogged) {
        Assert.assertEquals(new HomePage().verifyLoggedInAs(),userLogged, "Logged in as - Error");
    }

    @Then("I click the {string} button")
    public void iClickTheDeleteAccountButton(String deleteAccount) {
        new HomePage().clickOnMenu(deleteAccount);
    }

    @And("I verify that {string} is visible and click Continue button")
    public void iVerifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton(String accountDeleted) {
        Assert.assertEquals(new HomePage().verifyAccountDeleted(), accountDeleted, "ACCOUNT DELETED - ERROR");
        new HomePage().clickOnContinue1();
    }




    @And("I click on the {string} button")
    public void iClickOnTheLogoutButton(String logout) {
        new HomePage().clickOnMenu(logout);
    }

    @And("I enter correct email address {string} and password {string}")
    public void iEnterCorrectEmailAddressAndPassword(String email, String password) {
        new LoginPage().enterEmailAddressAndPassword(email,password);
    }

    @And("I Verify that {string} is visible")
    public void iVerifyThatACCOUNTDELETEDIsVisible(String accountDelete) {
        Assert.assertEquals(new HomePage().verifyAccountDeleted(), accountDelete, "ACCOUNT DELETED - ERROR");
    }

    @And("I verify that user is navigated to login page")
    public void iVerifyThatUserIsNavigatedToLoginPage() {
        Assert.assertTrue(new LoginPage().verifyLoginPage(),"LoginPage Error");
    }

    @And("I verify that the {string} is visible")
    public void iVerifyThatTheACCOUNTDELETEDIsVisible(String accountDelete) {
        Assert.assertEquals(new HomePage().verifyAccountDeleted(), accountDelete, "ACCOUNT DELETED - ERROR");
    }

    @Then("Verify error Email Address already exist! {string} is visible")
    public void verifyErrorEmailAddressAlreadyExistEmailAddressAlreadyExistIsVisible(String emailExist) {
        Assert.assertEquals(new SignUpPage().emailAlreadyExist(),emailExist, "Email Address already exist! - Error" );
    }


}
