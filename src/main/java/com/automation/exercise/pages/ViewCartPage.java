package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ViewCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ViewCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    WebElement testCases;
    //b[normalize-space()='Test Cases']

    @CacheLookup
    @FindBy(xpath = "//li[@class='active']")
    WebElement shoppingCartText;
    //li[@class='active']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckout;
    //a[normalize-space()='Proceed To Checkout']

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLoginClick;
    //u[normalize-space()='Register / Login']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cartClick;
    //a[normalize-space()='Cart']


    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    WebElement emptyCartText;
    //b[normalize-space()='Cart is empty!']


    @CacheLookup
    @FindBy(xpath = "//tr//i[@class='fa fa-times']")
    WebElement cartDelete;
    //tr//i[@class='fa fa-times']

    @CacheLookup
    @FindBy(xpath = "//tbody//td//h4//a")
    List<WebElement> allCartItems;
    //tbody//td//h4]


    public String getShoppingCartText() {
        log.info("Get text from: " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void clickOnProceedToCheckout() {
        proceedToCheckout.click();
        log.info("click on : " + proceedToCheckout.toString());
    }

    public void clickOnRegisterLoginButton() {
        registerLoginClick.click();
        log.info("click on : " + registerLoginClick.toString());
    }

    public void clickOnTheCart() {
        cartClick.click();
        log.info("click on : " + cartClick.toString());

    }

    public void deleteCartItems(String product) {
        for (WebElement item : allCartItems) {
            if (item.getText().equalsIgnoreCase(product)) {
                try {
                    cartDelete.click();
                } catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//tr//i[@class='fa fa-times']")));
                }
                log.info("Click on " + product + " Add to Cart button : " + allCartItems.toString());
                break;
            }
        }
    }

    public String getEmptyCartText(){
        log.info("Get text from : " + emptyCartText.toString());
        return getTextFromElement(emptyCartText);
    }



}
