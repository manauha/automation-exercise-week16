package com.automation.exercise.steps;

import com.automation.exercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test6To11Steps {


    @Then("I verify user is navigated to test cases page successfully")
    public void iVerifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertEquals(new TestCasesPage().verifyTestCasesPage(), "TEST CASES", "Test Cases Page - Error");
    }

    @And("I verify GET IN TOUCH {string} is visible")
    public void iVerifyGETINTOUCHGETINTOUCHIsVisible(String getInTouch) {
        Assert.assertEquals(new ContactUsPage().verifyGetInTouchText(), getInTouch, "GET IN TOUCH - ERROR");
    }

    @And("I enter name {string} email {string} subject {string} and message {string}")
    public void iEnterNameEmailSubjectAndMessage(String name, String email, String subject, String message) {
        new ContactUsPage().enterName(name);
        new ContactUsPage().enterEmail(email);
        new ContactUsPage().enterSubject(subject);
        new ContactUsPage().enterMessage(message);
    }

    @And("I upload file")
    public void iUploadFile() {
        new ContactUsPage().uploadFile();
    }

    @And("I click submit {string} button")
    public void iClickSubmitSubmitButton(String submit) {
        new ContactUsPage().clickOnSubmitButton();
    }

    @And("I click OK button")
    public void iClickOKButton() {
        new ContactUsPage().acceptAlertMessage();
    }

    @And("I Verify success message {string} is visible")
    public void iVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String successMessage) {
        Assert.assertEquals(new ContactUsPage().getSuccessSubmittedText(), successMessage, "Error");
    }

    @Then("I click {string} button and verify that landed to home page successfully")
    public void iClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully(String home) {
        new ContactUsPage().clickOnHomeButton();
        new HomePage().verifyHomepage();
    }

    @When("I click on Products {string} button")
    public void iClickOnProductsProductsButton(String products) {
        new HomePage().clickOnProducts();
    }

    @And("I verify user is navigated to ALL PRODUCTS {string} page successfully")
    public void iVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully(String allProducts) {
        Assert.assertEquals(new ProductsPage().verifyAllProducts(), allProducts, "ALL PRODUCTS - ERROR");
        Assert.assertTrue(new ProductsPage().verifyProductsPage(), "Products Page - Error");
    }

    @And("I see The products list is visible")
    public void iSeeTheProductsListIsVisible() {
        new ProductsPage().getAllProductsList();
    }

    @And("I click on view product of first product {string}")
    public void iClickOnViewProductOfFirstProduct(String product) {
        new ProductsPage().clickOnViewProductOfTheProduct(product);
    }

    @And("I user is landed to product detail page")
    public void iUserIsLandedToProductDetailPage() {
        Assert.assertTrue(new ProductDetailsPage().verifyUserLandedOnProductDetails(), "Product Details - Error");
    }

    @Then("I verify that product name detail {string} is visible")
    public void iVerifyThatProductNameDetailIsVisible(String productName) {
        Assert.assertEquals(new ProductDetailsPage().getProductName(), productName , "Product Name -Error");
    }

    @And("I verify that category detail {string} is visible")
    public void iVerifyThatCategoryDetailIsVisible(String category) {
        Assert.assertEquals(new ProductDetailsPage().getProductCategory(),category, "Category -Error");
    }

    @And("I verify that price detail {string} is visible")
    public void iVerifyThatPriceDetailIsVisible(String price) {
        Assert.assertEquals(new ProductDetailsPage().getProductPrice(), price, "Price -Error");
    }

    @And("I verify that availability detail {string} is visible")
    public void iVerifyThatAvailabilityDetailIsVisible(String availability) {
        Assert.assertEquals(new ProductDetailsPage().getProductAvailability(), availability, "Availability -Error");
    }


    @And("I verify that condition detail {string} is visible")
    public void iVerifyThatConditionDetailIsVisible(String condition) {
        Assert.assertEquals(new ProductDetailsPage().getProductCondition(),condition, "Condition - Error");
    }

    @And("I verify that brand detail {string} is visible")
    public void iVerifyThatBrandDetailIsVisible(String brand) {
        Assert.assertEquals(new ProductDetailsPage().getProductBrand(), brand, "Brand -Error");
    }

    @And("I Enter product name {string} in search input and click search button")
    public void iEnterProductNameInSearchInputAndClickSearchButton(String search) {
        new ProductsPage().enterTextInSearchBox(search);
        new ProductsPage().clickOnSearch();
    }

    @And("I Verify {string} is visible")
    public void iVerifySEARCHEDPRODUCTSIsVisible(String searches) {
        Assert.assertEquals(new ProductsPage().getSearchProductText(), searches, "SEARCHED PRODUCTS - Error");
    }

    @And("I Verify all the products related to search are visible")
    public void iVerifyAllTheProductsRelatedToSearchAreVisible() {
        String expected = "[Soft Stretch Jeans, Regular Fit Straight Jeans, Grunt Blue Slim Fit Jeans]";
        String actual = String.valueOf(new ProductsPage().getSearchedProducts());
       Assert.assertEquals(actual, expected,  "Search - Error");
    }

    @When("I scroll down to footer")
    public void iScrollDownToFooter() {
        new HomePage().scrollDownToFooter();
    }

    @And("I verify text {string}")
    public void iVerifyTextSUBSCRIPTION(String subscription) throws InterruptedException{
      Assert.assertEquals(new HomePage().verifySubscriptionTextOnFooter(), subscription, "SUBSCRIPTION - ERROR");
    }

    @And("I enter email address {string} in input and click arrow button")
    public void iEnterEmailAddressInInputAndClickArrowButton(String email) throws InterruptedException {
        new HomePage().enterEmailAddressInInputAndClickArrowButton(email);
    }

    @Then("I verify success message {string} is visible")
    public void iVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String subscriptionSuccess) {
        Assert.assertEquals(new HomePage().verifySubscriptionSuccessMessage(), subscriptionSuccess, "No Message - Error" );
    }


//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]
}
