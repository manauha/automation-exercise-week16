package com.automation.exercise.steps;

import com.automation.exercise.pages.ProductDetailsPage;
import com.automation.exercise.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test12To16Steps {

    @And("I hover over {string} and click Add to cart")
    public void iHoverOverAndClickAddToCart(String product) {
        new ProductsPage().mouseHoverAndClickAddToCartOnProduct(product);
    }

    @And("I click Continue Shopping button")
    public void iClickContinueShoppingButton() {
        new ProductsPage().clickContinueShoppingButton();
    }

    @And("I click View Cart button")
    public void iClickViewCartButton() {
        new ProductsPage().clickViewCartButton();
    }

    @Then("I verify both products are added to Cart")
    public void iVerifyBothProductsAreAddedToCart() {
    }

    @And("I verify their prices, quantity and total price")
    public void iVerifyTheirPricesQuantityAndTotalPrice() {
    }

    @And("I Wait")
    public void iWait() throws InterruptedException{
        new ProductsPage().waitTime();
    }

    @When("I click on {string} for any product on home page")
    public void iClickOnForAnyProductOnHomePage(String product) {
        new ProductsPage().clickOnViewProductOfTheProduct(product);
    }

    @And("I verify that product is displayed in cart page with exact quantity")
    public void iVerifyThatProductIsDisplayedInCartPageWithExactQuantity() {
    }

    @And("I increase quantity to four {string}")
    public void iIncreaseQuantityToFour(String qty) {
        new ProductDetailsPage().updateQuantity(qty);
    }

    @And("I click to {string} button")
    public void iClickToAddToCartButton(String addToCart) {
        new ProductDetailsPage().clickToAddToCart();
    }

    @And("I verify that product is displayed in cart page with exact quantity {string}")
    public void iVerifyThatProductIsDisplayedInCartPageWithExactQuantity(String qty) {
        System.out.println(new ProductDetailsPage().verifyQtyInTheCart());
        Assert.assertEquals(new ProductDetailsPage().verifyQtyInTheCart(), qty, "Quantity - Error");
    }

}
