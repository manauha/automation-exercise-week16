package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignUp;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement signUpName;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signUpEmail;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signUp;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement incorrectIDPassword;


    //p[normalize-space()='Your email or password is incorrect!']


    public String verifyLoginToYourAccount() {
        log.info("verify " + loginText.toString());
        return getTextFromElement(loginText);
    }


    public String verifyNewUserSignUp() {
        //System.out.println(getTextFromElement(newUserSignUp));
        log.info("verify " + (newUserSignUp.toString()));
        return getTextFromElement(newUserSignUp);
    }

    public void inputNameAndEmail(String name, String email) {
        sendTextToElement(signUpName, name);
        log.info("Entering Sign Up Name :" + signUpName.toString() + name);
        sendTextToElement(signUpEmail, email);
        log.info("Entering Sign Up Name :" + signUpEmail.toString() + email);
    }

    public void clickOnSignUp() {
        try {
            clickOnElement(signUp);
        } catch (Exception e){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click;", driver.findElement(By.xpath("//button[normalize-space()='Signup']")));
        }
        log.info("clicking on " + signUp.toString());
    }

    public String verifyLogToYourAccount() {
        //System.out.println(getTextFromElement(newUserSignUp));
        log.info("verify " + (newUserSignUp).toString());
        return getTextFromElement(newUserSignUp);
    }

    public void clickOnLoginButton() {
        try {
            clickOnElement(login);
        } catch (Exception e){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click;", driver.findElement(By.xpath("//button[normalize-space()='Login']")));
        }
        log.info("clicking on " + login.toString());
    }


    public void enterEmailAddressAndPassword(String email, String password){
        sendTextToElement(enterEmail,email);
        log.info("Enter Email :" + enterEmail.toString() + email);
        sendTextToElement(enterPassword,password);
        log.info("Enter Password :" + enterPassword.toString() + password);
    }

    public boolean getIncorrectIDPasswordText(String errorText){
        //System.out.println(getTextFromElement(incorrectIDPassword));
        return getTextFromElement(incorrectIDPassword).contains(errorText);
    }


    public Boolean verifyLoginPage(){
        log.info("verifying LoginPage :" + driver.getCurrentUrl());
        //System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl().contains("https://automationexercise.com/login");
    }



}
