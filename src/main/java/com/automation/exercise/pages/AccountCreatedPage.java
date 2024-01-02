package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountCreatedPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreated;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueBtn;


    public String verifyAccountCreated() {
        log.info("Get account created text : " + accountCreated.toString());
        return getTextFromElement(accountCreated);
    }

    public void clickOnContinue() {
        try {
            clickOnElement(continueBtn);

        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click();", driver.findElement(By.xpath("//a[normalize-space()='Continue']")));
        }
        log.info("Click on : " + continueBtn.toString());
    }

}