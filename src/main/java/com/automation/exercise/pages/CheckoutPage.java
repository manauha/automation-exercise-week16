package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class CheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_firstname address_lastname'][normalize-space()='Mr. Neil Cooper']")
    WebElement deliveryName;
    //ul[@id='address_delivery']//li[@class='address_firstname address_lastname'][normalize-space()='Mr. Neil Cooper']

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Cooper & Co']")
    WebElement deliveryCompany;
    //ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Cooper & Co']

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Barr Road']")
    WebElement deliveryAddress;
    //ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Barr Road']

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Bath']")
    WebElement deliveryCity;
    //ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Bath']

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode'][contains(text(),'Patna Bihar')]")
    WebElement deliveryState;
    //ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode'][contains(text(),'Patna Bihar')]

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_country_name'][normalize-space()='India']")
    WebElement deliveryCountry;
    //ul[@id='address_delivery']//li[@class='address_country_name'][normalize-space()='India']

    @CacheLookup
    @FindBy(xpath = "///ul[@id='address_delivery']//li[@class='address_phone'][normalize-space()='099887 766554']")
    WebElement deliveryNumber;
    //ul[@id='address_delivery']//li[@class='address_phone'][normalize-space()='099887 766554']

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_firstname address_lastname'][normalize-space()='Mr. Neil Cooper']")
    WebElement billingName;
    //ul[@id='address_invoice']//li[@class='address_firstname address_lastname'][normalize-space()='Mr. Neil Cooper']

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_address1 address_address2'][normalize-space()='Cooper & Co']")
    WebElement billingCompany;
    //ul[@id='address_invoice']//li[@class='address_address1 address_address2'][normalize-space()='Cooper & Co']

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_address1 address_address2'][normalize-space()='Barr Road']")
    WebElement billingAddress;
    //ul[@id='address_invoice']//li[@class='address_address1 address_address2'][normalize-space()='Barr Road']

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_address1 address_address2'][normalize-space()='Bath']")
    WebElement billingCity;
    //ul[@id='address_invoice']//li[@class='address_address1 address_address2'][normalize-space()='Bath']

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_city address_state_name address_postcode'][contains(text(),'Patna Bihar')]")
    WebElement billingState;
    //ul[@id='address_invoice']//li[@class='address_city address_state_name address_postcode'][contains(text(),'Patna Bihar')]

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_country_name'][normalize-space()='India']")
    WebElement billingCountry;
    //ul[@id='address_invoice']//li[@class='address_country_name'][normalize-space()='India']

    @CacheLookup
    @FindBy(xpath = "/ul[@id='address_invoice']//li[@class='address_phone'][normalize-space()='099887 766554']")
    WebElement billingNumber;
    //ul[@id='address_invoice']//li[@class='address_phone'][normalize-space()='099887 766554']

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewYouOrder;
    //h2[normalize-space()='Review Your Order']

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement addComments;
    //textarea[@name='message']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrderClick;
    //a[normalize-space()='Place Order']


    public String getDeliveryName(){
        log.info("Get text from : " + deliveryName.toString());
        return getTextFromElement(deliveryName);
    }

    public String getDeliveryCompany(){
        log.info("Get text from : " + deliveryCompany.toString());
        return getTextFromElement(deliveryCompany);
    }

    public String getDeliveryAddress(){
        log.info("Get text from : " + deliveryAddress.toString());
        return getTextFromElement(deliveryAddress);
    }

    public String getDeliveryCity(){
        log.info("Get text from : " + deliveryCity.toString());
        return getTextFromElement(deliveryCity);
    }

    public String getDeliveryState(){
        log.info("Get text from : " + deliveryState.toString());
        return getTextFromElement(deliveryState);
    }

    public String getDeliveryCountry(){
        log.info("Get text from : " + deliveryCountry.toString());
        return getTextFromElement(deliveryCountry);
    }

    public String getDeliveryNumber(){
        log.info("Get text from : " + deliveryNumber.toString());
        return getTextFromElement(deliveryNumber);
    }

    public String getBillingName(){
        log.info("Get text from : " + billingName.toString());
        return getTextFromElement(billingName);
    }

    public String getBillingCompany(){
        log.info("Get text from : " + billingName.toString());
        return getTextFromElement(billingName);
    }

    public String getBillingAddress(){
        log.info("Get text from : " + billingAddress.toString());
        return getTextFromElement(billingAddress);
    }

    public String getBillingCity(){
        log.info("Get text from : " + billingCity.toString());
        return getTextFromElement(billingCity);
    }

    public String getBillingState(){
        log.info("Get text from : " + billingState.toString());
        return getTextFromElement(billingState);
    }

    public String getBillingCountry(){
        log.info("Get text from : " + billingCountry.toString());
        return getTextFromElement(billingCountry);
    }

    public String getBillingNumber(){
        log.info("Get text from : " + billingNumber.toString());
        return getTextFromElement(billingNumber);
    }

    public String verifyAddressDetailsAndReviewYourOrder() {
        log.info("Get text from : " + reviewYouOrder.toString());
        return getTextFromElement(reviewYouOrder);
    }

    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder(String comments) {
        sendTextToElement(addComments, comments);
        log.info("Send text from : " + addComments.toString());
        placeOrderClick.click();
        log.info("Click on : " + placeOrderClick.toString());
    }

}
