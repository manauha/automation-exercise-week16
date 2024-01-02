package com.automation.exercise.steps;

import com.automation.exercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test22To26Steps {

    @And("I verify that product is displayed in cart page")
    public void iVerifyThatProductIsDisplayedInCartPage() {

    }

    @Then("I click on View Cart button")
    public void iClickOnViewCartButton() {
        new HomePage().clickOnViewCartButton();
    }

    @And("I Add to cart {string} from Recommended Items")
    public void iAddToCartBlueTopFromRecommendedItems(String product) {
        new HomePage().clickOnAddToCartOnRecommendedProduct(product);
    }

    @And("I verify {string} are visible")
    public void iVerifyRECOMMENDEDITEMSAreVisible(String items) {
        System.out.println(new HomePage().verifyRECOMMENDEDITEMSAreVisible());
        Assert.assertEquals(new HomePage().verifyRECOMMENDEDITEMSAreVisible(), items, "Error");
    }

    @When("I scroll to bottom of page")
    public void iScrollToBottomOfPage() {
        new HomePage().scrollToBottomOfPage();
    }

    //

    @And("I Click Continue button")
    public void iClickContinueButton() {
        new PaymentPage().clickContinueButton();
    }

    @And("I click {string} button and verify invoice is downloaded successfully.")
    public void iClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully(String invoice) {
        new PaymentPage().clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully();
    }

    @And("I verify the success message {string}")
    public void iVerifyTheSuccessMessageYourOrderHasBeenPlacedSuccessfully(String message) {
        System.out.println(new PaymentPage().verifyTheSuccessMessageYourOrderHasBeenPlacedSuccessfully());
        Assert.assertEquals(new PaymentPage().verifyTheSuccessMessageYourOrderHasBeenPlacedSuccessfully(),message, "Error");
    }

    @And("I click Pay and Confirm Order button")
    public void iClickPayAndConfirmOrderButton() {
        new PaymentPage().clickPayAndConfirmOrderButton();
    }

    @And("I enter payment details Name on Card {string} Card Number {string}  CVC {string} Expiration Month {string} and Year {string}")
    public void iEnterPaymentDetailsNameOnCardCardNumberCVCExpirationMonthAndYear(String name, String number, String placeholder, String month, String year) {
        new PaymentPage().enterPaymentDetailsNameOnCardCard(name, number, placeholder, month, year);
    }

    @And("I enter description in comment text area and click {string}")
    public void iEnterDescriptionInCommentTextAreaAndClickPlaceOrder(String comment) {
        new CheckoutPage().enterDescriptionInCommentTextAreaAndClickPlaceOrder(comment);
    }

    @And("I Verify Address Details and Review Your Order")
    public void iVerifyAddressDetailsAndReviewYourOrder() {
        new CheckoutPage().verifyAddressDetailsAndReviewYourOrder();
    }

    @And("I click Cart button")
    public void iClickCartButton() {
        new ViewCartPage().clickOnTheCart();
    }


    @And("I click on Register Login button")
    public void iClickOnRegisterLoginButton() {
        new ViewCartPage().clickOnRegisterLoginButton();
    }

    @And("I click Proceed To Checkout")
    public void iClickProceedToCheckout() {
        new ViewCartPage().clickOnProceedToCheckout();
    }

    @And("I verify that cart page is displayed")
    public void iVerifyThatCartPageIsDisplayed() {
        System.out.println(new ViewCartPage().getShoppingCartText());
    }


    @And("I click on Continue Shopping")
    public void iClickOnContinueShopping() {
        new ProductDetailsPage().clickOnContinueShopping();
    }

    //

    @Then("I click on arrow at bottom right side to move upward")
    public void iClickOnArrowAtBottomRightSideToMoveUpward() {
        new HomePage().clickOnArrowUp();
    }

    //

    @When("I scroll down page to bottom")
    public void iScrollDownPageToBottom() {
        new HomePage().scrollDownToFooterBottom();
    }

    @And("I scroll up page to top")
    public void iScrollUpPageToTop() {
        new HomePage().scrollUpToTop();
    }

    @Then("I verify that page is scrolled up and {string} text is visible on screen")
    public void iVerifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String full) {
        //System.out.println(new HomePage().verifyHomePageTextFullFledged());
        Assert.assertEquals(new HomePage().verifyHomePageTextFullFledged(), full, "FullFledged Error");
    }
    //
}
