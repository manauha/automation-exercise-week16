package com.automation.exercise.steps;

import com.automation.exercise.pages.HomePage;
import com.automation.exercise.pages.ProductDetailsPage;
import com.automation.exercise.pages.ProductsPage;
import com.automation.exercise.pages.ViewCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test17To21Steps {

    /*************************  Test 17  ******************************/

    @When("I mouse hover on product {string} and Add to cart")
    public void iMouseHoverOnProductAndAddToCart(String product) {
        new HomePage().mouseHoverOnProductAndAddToCart(product);
    }

    @And("I click X button corresponding to particular product {string}")
    public void iClickXButtonCorrespondingToParticularProduct(String item) {
        new ViewCartPage().deleteCartItems(item);
    }

    @Then("I verify that product is removed from the cart")
    public void iVerifyThatProductIsRemovedFromTheCart() {
        System.out.println(new ViewCartPage().getEmptyCartText());
        Assert.assertEquals(new ViewCartPage().getEmptyCartText(), "Cart is empty!","Cart is empty!-Error" );
    }

    /*************************  Test 18  ******************************/


    @When("I verify that categories are visible on left side bar")
    public void iVerifyThatCategoriesAreVisibleOnLeftSideBar() {
       Assert.assertEquals(new HomePage().verifyThatCategoriesAreVisibleOnLeftSideBar(), "CATEGORY", "Error");
    }

    @And("I click on {string} category")
    public void iClickOnCategory(String category) {
        new HomePage().clickOnCategory(category);
    }

    @And("I click on sub category of above category {string}")
    public void iClickOnSubCategoryOfAboveCategory(String subcategory) {
        new HomePage().clickOnSubCategoryOfAboveCategory(subcategory);
    }

    @And("I verify sub category page is displayed and confirm text {string}")
    public void iVerifySubCategoryPageIsDisplayedAndConfirmText(String text) {
        //System.out.println(new HomePage().verifySubCategoryPageIsDisplayedAndConfirmText());
        Assert.assertEquals(new HomePage().verifySubCategoryPageIsDisplayedAndConfirmText(), text, "Error");
    }

    @And("I click on sub-category of Men category {string}")
    public void iClickOnSubCategoryOfMenCategory(String text1) {
        new HomePage().iClickOnSubCategoryOfMenCategory(text1);
    }

    @And("I verify that user is navigated to {string} category page")
    public void iVerifyThatUserIsNavigatedToCategoryPage(String jeans) {
        //System.out.println(new HomePage().verifyThatUserIsNavigatedToThatCategoryPage());
        Assert.assertEquals(new HomePage().verifyThatUserIsNavigatedToThatCategoryPage(), jeans, "Error");
    }

    /*************************  Test 19  ******************************/

    @And("I verify that Brands are visible on left side bar")
    public void iVerifyThatBrandsAreVisibleOnLeftSideBar() {
        //System.out.println(new HomePage().verifyThatBrandsAreVisibleOnLeftSideBar());
        Assert.assertEquals(new HomePage().verifyThatBrandsAreVisibleOnLeftSideBar(),"BRANDS", "Error" );
    }

    @And("I click on {string} brand name")
    public void iClickOnBrandName(String brand) {
        new HomePage().clickOnBrandOnBrandsTab(brand);
    }

    @And("I verify that user is navigated to brand page {string}")
    public void iVerifyThatUserIsNavigatedToBrandPage(String brandText) {
        System.out.println(new HomePage().verifyThatUserIsNavigatedToBrandPage());
        //Assert.assertEquals(new HomePage().verifyThatUserIsNavigatedToBrandPage(),"BRANDS", "Error" );
    }

    @And("I verify that user is navigated to that brand page {string}")
    public void iVerifyThatUserIsNavigatedToThatBrandPage(String brandText1) {
        System.out.println(new HomePage().verifyThatUserIsNavigatedToThatCategoryPage());
        //Assert.assertEquals(new HomePage().verifyThatUserIsNavigatedToThatCategoryPage(),"BRANDS", "Error" );
    }

    @And("I click on View Product {string} button")
    public void iClickOnViewProductViewProductButton(String product) {
        new ProductDetailsPage().clickOnViewProductViewProductButton();
    }

    @And("I verify Write Your Review {string} is visible")
    public void iVerifyWriteYourReviewWRITEYOURREVIEWIsVisible(String review) {
        System.out.println(new ProductDetailsPage().verifyWriteYourReviewIsVisible());
        Assert.assertEquals(new ProductDetailsPage().verifyWriteYourReviewIsVisible(), review, "Error");
    }

    @And("I enter name {string}  email {string} and review {string}")
    public void iEnterNameEmailAndReview(String name, String email, String review) throws InterruptedException {
        new ProductDetailsPage().enterNameEmailAndReview(name,email,review);
    }

    @Then("I click on Review Submit button")
    public void iClickOnReviewSubmitButton() {
        new ProductDetailsPage().clickOnReviewSubmitButton();
    }


    @And("I verify success message {string}")
    public void iVerifySuccessMessageThankYouForYourReview(String message) {
        System.out.println(new ProductDetailsPage().verifyThankYouForYourReviewMessage());
        Assert.assertEquals(new ProductDetailsPage().verifyThankYouForYourReviewMessage(),message, "Error");
    }

    //

    @And("I verify user is navigated to All Products {string} page successfully")
    public void iVerifyUserIsNavigatedToAllProductsPageSuccessfully(String allProducts) {
        System.out.println(new ProductsPage().verifyProductsPage());
        Assert.assertEquals(new ProductsPage().verifyAllProducts(), allProducts, "ALL PRODUCTS - ERROR");
    }

    @And("I enter {string} in search input and click")
    public void iEnterInSearchInputAndClick(String searchItem) {
        new ProductsPage().enterProductNameInSearchBoxAndClick(searchItem);
    }

    @And("I verify SEARCHED PRODUCTS {string} is visible")
    public void iVerifySEARCHEDPRODUCTSIsVisible(String searchedProducts) {
        System.out.println(new ProductsPage().verifySEARCHEDPRODUCTSIsVisible());
        //Assert.assertEquals(new ProductsPage().verifySEARCHEDPRODUCTSIsVisible(), searchedProducts, "Error");
    }

    @And("I verify searched product {string} are visible")
    public void iVerifySearchedProductAreVisible(String visible) {
    }

    @And("I add {string} to cart")
    public void iAddToCart(String product) {
        new HomePage().mouseHoverOnProductAndAddToCart(product);
    }

    @And("I click {string} button and verify that products are visible in cart")
    public void iClickCartButtonAndVerifyThatProductsAreVisibleInCart(String cart) {
        new ProductsPage().clickViewCartButton();
    }
}
