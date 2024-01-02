package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class ProductDetailsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductDetailsPage.class.getName());

    @CacheLookup
    //@FindBy (xpath = "//h2[normalize-space()='Blue Top']")
    @FindBy(xpath = "//div[@class = 'product-details']/div[2]/div/h2")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[1]")
    WebElement productCategory;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/span/span")
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[2]")
    WebElement productAvailability;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[3]")
    WebElement productCondition;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[4]")
    WebElement productBrand;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement productQuantity;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'nav nav-pills nav-justified']/li/a")
    WebElement clickViewProduct1;
    //ul[@class='nav nav-pills nav-justified']//li[@xpath='1']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement writeYourReview;
    //a[normalize-space()='Write Your Review']

    @CacheLookup
    @FindBy(xpath = "//input[@id='name']")
    WebElement writeReviewName;
    //input[@id='name']

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement writeReviewEmail;
    //input[@id='email']

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='review']")
    WebElement writeReviewText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-review']")
    WebElement clickReviewSubmit;
    //button[@id='button-review']

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']//span[normalize-space()='Thank you for your review.']")
    WebElement thankYouReviewText;
    //span[normalize-space()='Thank you for your review.']

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement quantity;
    //input[@id='quantity']


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement clickAddToCart;
    //button[normalize-space()='Add to cart']

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='4']")
    WebElement verifyQtyInCart;
    //button[normalize-space()='4']


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingButton;
    //button[normalize-space()='Continue Shopping']


    public boolean verifyUserLandedOnProductDetails() {

        return (driver.getCurrentUrl().contains("https://automationexercise.com/product_details/1"));
    }

    public String getProductName() {
        log.info("Get product name : " + productName.toString());
        return getTextFromElement(productName);
    }

    public String getProductCategory() {
        log.info("Get product category : " + productCategory.toString());
        return getTextFromElement(productCategory);
    }

    public String getProductPrice() {
        log.info("Get product price : " + productPrice.toString());
        return getTextFromElement(productPrice);
    }

    public String getProductAvailability() {
        log.info("Get product availability : " + productAvailability.toString());
        return getTextFromElement(productAvailability);
    }

    public String getProductCondition() {
        log.info("Get product condition : " + productCondition.toString());
        return getTextFromElement(productCondition);
    }

    public String getProductBrand() {
        log.info("Get product brand : " + productBrand.toString());
        return getTextFromElement(productBrand);
    }

    public void clickOnViewProductViewProductButton() {
        try {
            clickViewProduct1.click();
            log.info("click on View Product: " + clickViewProduct1.toString());
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click;", driver.findElement(By.xpath("//ul[@class='nav nav-pills nav-justified']//li[@xpath='1']")));
        }
        log.info("click on View Product : " + clickViewProduct1.toString());
    }

    public String verifyWriteYourReviewIsVisible() {
        log.info("Get Text from : " + writeYourReview.toString());
        return getTextFromElement(writeYourReview);
    }

    public void enterNameEmailAndReview(String name, String email, String review) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(writeReviewName, name);
        log.info("Enter Name : " + writeReviewName.toString());
        Thread.sleep(2000);
        sendTextToElement(writeReviewEmail, email);
        log.info("Enter Email : " + writeReviewEmail.toString());
        Thread.sleep(2000);
        sendTextToElement(writeReviewText, review);
        log.info("Enter Message : " + writeReviewText.toString());
    }

    public void clickOnReviewSubmitButton() {
        try {
            clickReviewSubmit.click();
            log.info("click on Arrow Up: " + clickReviewSubmit.toString());
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click;", driver.findElement(By.xpath("//button[@id='button-review']")));
        }
        log.info("click on Arrow Up : " + clickReviewSubmit.toString());
    }

    public String verifyThankYouForYourReviewMessage() {
        //System.out.println(getTextFromAlert());
        log.info("Get Text from : " + thankYouReviewText.toString());
        return getTextFromElement(thankYouReviewText);
    }

    public void updateQuantity(String qty) {
        quantity.clear();
        log.info("Clear Quantity : " + quantity.toString());
        sendTextToElement(quantity, qty);
        log.info("Update Quantity : " + quantity.toString());
    }

    public void clickToAddToCart() {
        try {
            clickAddToCart.click();
            log.info("click to Add to Cart : " + clickAddToCart.toString());
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click();",driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")));
        }
        log.info("click to Add to Cart : " + clickAddToCart.toString());
    }

    public String verifyQtyInTheCart() {
        log.info("Get text from : " + verifyQtyInCart.toString());
        return getTextFromElement(verifyQtyInCart);
    }

    public void clickOnContinueShopping() {

        try {
            continueShoppingButton.click();
            log.info("click on Continue Shopping Button: " + continueShoppingButton.toString());
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click();",driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")));
        }
        log.info("click to Add to Cart : " + continueShoppingButton.toString());
    }

//div[@class='productinfo text-center']//a[@data-product-id='1']
//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]

//button[normalize-space()='Continue Shopping']


//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]
//div[@class='productinfo text-center']//a[@data-product-id='2']


//u[normalize-space()='View Cart']


//tbody//tr


}

