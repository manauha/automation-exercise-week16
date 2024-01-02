package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.File;


public class ContactUsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ContactUsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouch;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement enterName;
    //input[@placeholder='Name']

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement enterEmail;
    //input[@placeholder='Email']

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement enterSubject;
    //input[@placeholder='Subject']

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement enterMessage;
    //textarea[@id='message']

    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement uploadFile;
    //input[@name='upload_file']

    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement clickSubmit;
    //input[@name='submit']

    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successMessageText;
    //div[@class='status alert alert-success']

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement homeButton;

    //span[normalize-space()='Home']



    public String verifyGetInTouchText(){
        log.info("Get text from Get In Touch : " + getInTouch.toString());
        return getTextFromElement(getInTouch);
    }

    public void enterName(String name) {
        sendTextToElement(enterName, name);
        log.info("Enter " + name + enterName.toString());
    }

    public void enterEmail(String email) {
        sendTextToElement(enterEmail, email);
        log.info("Enter " + email + enterEmail.toString());
    }

    public void enterSubject(String subject) {
        sendTextToElement(enterSubject, subject);
        log.info("Enter " + subject + enterSubject.toString());
    }

    public void enterMessage(String message) {
        log.info("Enter " + message + enterMessage.toString());
        sendTextToElement(enterMessage, message);
    }

    public void uploadFile() {
        File uploadNewFile = new File("C:\\Users\\imsky\\IdeaProjects\\automation-exercise-com\\New.text");
        uploadFile.sendKeys(uploadNewFile.getAbsolutePath());
        //uploadFile.sendKeys("C:/Soft/New.txt");
        log.info("Upload file : " + uploadFile.toString());
    }

    public void clickOnSubmitButton() {
        //clickOnElement(submitButton);
        try {
            clickSubmit.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click();",driver.findElement(By.xpath("//input[@name='submit']")));
        }
        log.info("Click on submit : " + clickSubmit.toString());
    }

    public void acceptAlertMessage(){
        acceptAlert();
        log.info("Accept the alert");
    }

    public String getSuccessSubmittedText() {
        log.info("Get success message : " + successMessageText.toString());
        return getTextFromElement(successMessageText);
    }

    public void clickOnHomeButton() {
        try {
            homeButton.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click();",driver.findElement(By.xpath("//span[normalize-space()='Home']")));
        }
        log.info("Click on home button : " + homeButton.toString());
    }
}
