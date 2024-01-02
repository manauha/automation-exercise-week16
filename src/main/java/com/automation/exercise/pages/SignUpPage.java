package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement verifySignUpPage;

    @CacheLookup
    @FindBy(id = "id_gender1")
    WebElement titleMr;

    @CacheLookup
    @FindBy(id = "name")
    WebElement name;

    @CacheLookup
    @FindBy(id = "password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "days")
    WebElement days;

    @CacheLookup
    @FindBy(id = "months")
    WebElement months;

    @CacheLookup
    @FindBy(id = "years")
    WebElement years;

    @CacheLookup
    @FindBy(id = "newsletter")
    WebElement newsletter;

    @CacheLookup
    @FindBy(id = "optin")
    WebElement opting;

    @CacheLookup
    @FindBy(id = "first_name")
    WebElement first_name;
    //input[@id='first_name']

    @CacheLookup
    @FindBy(id = "last_name")
    WebElement last_name;
    //input[@id='last_name']

    @CacheLookup
    @FindBy(id = "company")
    WebElement enterCompany;
    //input[@id='company']

    @CacheLookup
    @FindBy(id = "address1")
    WebElement address1;
    //input[@id='address1']
    @CacheLookup
    @FindBy(id = "address2")
    WebElement address2;
    //input[@id='address2']
    @CacheLookup
    @FindBy(id = "country")
    WebElement enterCountry;
    //select[@id='country']
    @CacheLookup
    @FindBy(id = "state")
    WebElement enterState;
    //input[@id='state']
    @CacheLookup
    @FindBy(id = "city")
    WebElement enterCity;
    //input[@id='city']
    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement enterZipcode;
    //input[@id='zipcode']
    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement mobile_number;
    //input[@id='mobile_number']
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement createAccountBtn;
    //button[normalize-space()='Create Account']
    //button[normalize-space()='Create Account']


    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement emailExist;
    //p[normalize-space()='Email Address already exist!']

    public String emailAlreadyExist(){
        log.info("verify " + (emailExist).toString());
        return getTextFromElement(emailExist);
    }

    public String verifySignUpPage() {
        //System.out.println(getTextFromElement(verifySignUpPage));
        log.info("verify " + getTextFromElement(verifySignUpPage));
        return getTextFromElement(verifySignUpPage);
    }

    public void selectTitle() {
        clickOnElement(titleMr);
        log.info("select Mr " + titleMr.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);
        log.info("enter Password : " + enterPassword.toString());
    }

    public void enterDayOfDateOfBirth(String day) {
        selectByVisibleTextFromDropDown(days, day);
        log.info("select Day of DOB " + days.toString());
    }

    public void enterMonthOfDateOfBirth(String month) {
        selectByVisibleTextFromDropDown(months, month);
        log.info("select month of DOB " + months.toString());
    }

    public void enterYearOfDateOfBirth(String year) {
        selectByVisibleTextFromDropDown(years, year);
        log.info("select year of DOB " + years.toString());
    }

    public void tickOnNewsletter() {
        clickOnElement(newsletter);
        log.info("tick on newsletter : " + newsletter.toString());
    }

    public void tickOnSpecialOffer() {
        clickOnElement(opting);
        log.info("tick on Special Offer : " + opting.toString());
    }

    public void enterFirName(String firstName) {
        sendTextToElement(first_name, firstName);
        log.info("Enter first name : " + first_name.toString());
    }

    public void enterLastName(String lastName) {
        sendTextToElement(last_name, lastName);
        log.info("Enter last name : " + last_name.toString());
    }

    public void enterCompany(String company) {
        sendTextToElement(enterCompany, company);
        log.info("Enter Company : " + enterCompany.toString());
    }

    public void enterAddress(String address) {
        sendTextToElement(address1, address);
        log.info("Enter address1 : " + address1.toString());
    }

    public void enterAddressLine(String addressLine) {
        sendTextToElement(address2, addressLine);
        log.info("Enter address2 : " + address2.toString());
    }

    public void enterCountry(String country) {
        selectByVisibleTextFromDropDown(enterCountry, country);
        log.info("Enter Country : " + enterCountry.toString());
    }

    public void enterState(String state) {
        sendTextToElement(enterState, state);
        log.info("Enter State : " + enterState.toString());
    }

    public void enterCity(String city) {
        sendTextToElement(enterCity, city);
        log.info("Enter city : " + enterCity.toString());
    }

    public void enterZipcode(String zipcode) {
        sendTextToElement(enterZipcode, zipcode);
        log.info("Enter zipcode : " + enterZipcode.toString());
    }

    public void enterMobileNumber(String mobileNumber) {
        sendTextToElement(mobile_number, mobileNumber);
        log.info("Enter mobile number : " + mobile_number.toString());
    }

    public void clickOnCreateAccount() {
        try {
            clickOnElement(createAccountBtn);
            log.info("click on : " + createAccountBtn.toString());
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click();", driver.findElement(By.xpath("//button[normalize-space()='Create Account']")));
        }
        log.info("click on : " + createAccountBtn.toString());
    }


}









