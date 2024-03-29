package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class TestCasesPage extends Utility {

    private static final Logger log = LogManager.getLogger(TestCasesPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    WebElement testCases;
    //b[normalize-space()='Test Cases']

    public String verifyTestCasesPage(){
        //waitUntilVisibilityOfElementLocated(testCases,4);
        log.info("Get Text from : " + testCases.toString());
        return getTextFromElement(testCases);
    }
}
