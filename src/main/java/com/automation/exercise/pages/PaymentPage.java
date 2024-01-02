package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class PaymentPage extends Utility {

    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @CacheLookup
    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement cardName;
    //input[@name='name_on_card']

    @CacheLookup
    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardNumber;
    //input[@name='card_number']

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement cardPlaceholder;
    //input[@placeholder='ex. 311']

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='MM']")
    WebElement cardMonth;
    //input[@placeholder='MM']

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement cardYear;
    //input[@placeholder='YYYY']

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit']")
    WebElement clickSubmit;
    //button[@id='submit']

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your order has been placed successfully!')]")
    WebElement orderPlacedText;
    //div[contains(text(),'Your order has been placed successfully!')]

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Download Invoice']")
    WebElement invoiceDownload;
    //a[normalize-space()='Download Invoice']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement clickContinue;
    //a[normalize-space()='Continue']


    public void enterPaymentDetailsNameOnCardCard(String name, String number, String placeholder, String month, String year) {
        sendTextToElement(cardName, name);
        log.info("Enter text : " + cardName.toString());
        sendTextToElement(cardNumber, number);
        log.info("Enter text : " + cardNumber.toString());
        sendTextToElement(cardPlaceholder, placeholder);
        log.info("Enter text : " + cardPlaceholder.toString());
        sendTextToElement(cardMonth,month);
        log.info("Enter text : " + cardMonth.toString());
        sendTextToElement(cardYear,year);
        log.info("Enter text : " + cardYear.toString());
    }

    public void clickPayAndConfirmOrderButton() {
        try {
            clickSubmit.click();
            log.info("Click on : " + clickSubmit.toString());
        } catch (Exception e) {
            js.executeScript("argument[0].click();", driver.findElement(By.xpath("//button[@id='submit']")));
        }
        log.info("Click on : " + clickSubmit.toString());
    }

    public String verifyTheSuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        log.info("Get text from : " + orderPlacedText.toString());
        return getTextFromElement(orderPlacedText);
    }


    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
        try {
            invoiceDownload.click();
            log.info("click on : " + invoiceDownload.toString());
        } catch (Exception e) {
            js.executeScript("argument[0].click();", driver.findElement(By.xpath("//a[normalize-space()='Download Invoice']")));
        }
        log.info("click on : " + invoiceDownload.toString());
    }


    public void clickContinueButton() {
        try {
            clickContinue.click();
            log.info("click on : " + clickContinue.toString());
        } catch (Exception e) {
            js.executeScript("argument[0].click();", driver.findElement(By.xpath("//a[normalize-space()='Continue']")));
        }
        log.info("click on : " + clickContinue.toString());
    }

}

