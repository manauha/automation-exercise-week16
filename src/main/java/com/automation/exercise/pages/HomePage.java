package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a")
    List<WebElement> topMenu;
    //div[@class='shop-menu pull-right']//li//a[normalize-space()=' + menu + ']
    //div[@class='shop-menu pull-right']//li

    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement products;
    //a[@href='/products']

    @CacheLookup
    @FindBy (xpath = "//div[@class='product-image-wrapper']/div/div/p")
    List<WebElement> allItemList;

    @CacheLookup
    @FindBy (xpath = "//a[@class='btn btn-default add-to-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Features Items']")
    WebElement homepageText;

    @CacheLookup
    @FindBy(xpath = "//li[10]//a[1]")
    WebElement loggedInAs;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logout;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement accountDeleted;
    //b[normalize-space()='Account Deleted!']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueDelete;

    @CacheLookup
    @FindBy(id = "footer")
    WebElement footer;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement sText;
    //h2[normalize-space()='Subscription']

    @CacheLookup
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement sEmail;
    //input[@id='susbscribe_email']

    @CacheLookup
    @FindBy(xpath = "//button[@id='subscribe']")
    WebElement clickSubscribe;
    //button[@id='subscribe']

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement subscriptionText;
    //div[@class='alert-success alert']

    @CacheLookup
    @FindBy(xpath = "//div[@class='footer-bottom']")
    WebElement footerBottom;
    //div[@class='footer-bottom']

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement homePageTextFullFledged;
    //div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    WebElement arrowUp;
    //i[@class='fa fa-angle-up']

    @CacheLookup
    @FindBy (xpath = "//div[@id = 'recommended-item-carousel']//div[@class = 'productinfo text-center']/p")
    List<WebElement> recommendedItemsList;
    //div[@id = 'recommended-item-carousel']//div[@class = 'productinfo text-center']/p

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItemsText;
    //h2[normalize-space()='recommended items']
    //WebElement rcText = driver.findElement(By.xpath(//h2[normalize-space()='recommended items']));

    @CacheLookup
    @FindBy(xpath = "div[@class='item active']//div[3]//div[1]//div[1]//div[1]//a[1]")
    WebElement addToCartRI;
    //div[@class='item active']//div[3]//div[1]//div[1]//div[1]//a[1]

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartClick;
    //u[normalize-space()='View Cart']

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement categoryText;
    //h2[normalize-space()='Category']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement categoryWomen;
    //a[normalize-space()='Women']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement categoryMen;
    //a[normalize-space()='Men']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Kids']")
    WebElement categoryKids;
    //a[normalize-space()='Kids']

    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement womenDress;
    //div[@id='Women']//a[contains(text(),'Dress')]

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tops']")
    WebElement womenTops;
    //a[normalize-space()='Tops']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Saree']")
    WebElement womenSaree;
    //a[normalize-space()='Saree']

    @CacheLookup
    @FindBy (xpath = "//h2[@class = 'title text-center']")
    WebElement subMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Saree Products']")
    WebElement productSaree;
    //h2[normalize-space()='Women - Saree Products']

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement productDress;
    //h2[normalize-space()='Women - Dress Products']

    @CacheLookup
    @FindBy(xpath = "/h2[normalize-space()='Women - Tops Products']")
    WebElement productTops;
    //h2[normalize-space()='Women - Tops Products']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    WebElement menTshirt;
    //a[normalize-space()='Tshirts']

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Jeans']")
    WebElement menJeans;
    //a[normalize-space()='Jeans']

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Jeans Products']")
    WebElement jeansText;
    //h2[normalize-space()='Men - Jeans Products']
    //h2[normalize-space()='Men - Tshirts Products']

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    WebElement brandText;
    //h2[normalize-space()='Brands']

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked']//a[@href='/brand_products/ + brand +']")
    List <WebElement> brandNames;
    //ul[@class='nav nav-pills nav-stacked']//li//a
    //ul[@class='nav nav-pills nav-stacked']//a[@href='/brand_products/ +brand+' ]

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Babyhug Products']")
    WebElement verifyBabyhug;
    //h2[normalize-space()='Brand - Babyhug Products']

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Madame Products']")
    WebElement verifyMadame;
    //h2[normalize-space()='Brand - Madame Products']


    public String verifyThatCategoriesAreVisibleOnLeftSideBar() {
        log.info("Get text from : " + categoryText.toString());
        return getTextFromElement(categoryText);
    }

    public void clickOnCategory(String category) {
        if (category.equalsIgnoreCase("Men")){
            categoryMen.click();
            log.info("Clicking on Men category : " + categoryMen.toString());
        } else if (category.equalsIgnoreCase("Women")) {
            categoryWomen.click();
            log.info("Clicking on Women category : " + categoryWomen.toString());
        } else if (category.equalsIgnoreCase("Kids")) {
            categoryKids.click();
            log.info("Clicking on Kids category : " + categoryKids.toString());
        } else {
            System.out.println("Invalid Category");
        }
    }

    public void clickOnSubCategoryOfAboveCategory(String subcategory) {
        if (subcategory.equalsIgnoreCase("Dress")){
            womenDress.click();
            log.info("Clicking on Women Dress: " + womenDress.toString());
        } else if (subcategory.equalsIgnoreCase("Tops")) {
            womenTops.click();
            log.info("Clicking on Women Dress : " + womenTops.toString());
        } else if (subcategory.equalsIgnoreCase("Saree")) {
            womenSaree.click();
            log.info("Clicking on Women Saree : " + womenSaree.toString());
        } else {
            System.out.println("Invalid Category");
        }
    }

    public String verifySubCategoryPageIsDisplayedAndConfirmText() {
            log.info("Getting Sub Category Page Text : " + productDress.toString());
            return getTextFromElement(productDress);
        }

    public void iClickOnSubCategoryOfMenCategory(String text1)  {
        if (text1.equalsIgnoreCase("Jeans")){
            menJeans.click();
            log.info("Clicking on Men Jeans : " + menJeans.toString());
        } else if (text1.equalsIgnoreCase("Tshirt")) {
            menTshirt.click();
            log.info("Clicking on Men Tshirt : " + menTshirt.toString());
        } else {
            System.out.println("Invalid Category");
        }
    }


    public String verifyThatUserIsNavigatedToThatCategoryPage() {
        log.info("Getting Sub Category Page Text : " + jeansText.toString());
        return getTextFromElement(jeansText);
    }


    public void mouseHoverOnProductAndAddToCart(String product){
        for (WebElement item : allItemList) {
            if(item.getText().equalsIgnoreCase(product)) {
                mouseHoverToElementAndClick(item);
                log.info("Hovering mouse on " + product + " : " + allItemList.toString());
                try {
                    addToCart.click();
                } catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")));
                }
                log.info("Click on " + product + " Add to Cart button : " + allItemList.toString());
                break;
            }
        }
    }

    public Boolean verifyHomepage() {
        log.info("verifying HomePage URL : " + driver.getCurrentUrl());
        //System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl().contains("https://automationexercise.com/");
    }

    public void clickOnMenu(String menu) {
        try {
            for (WebElement element : topMenu) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                    log.info("clicking on top menu : " + menu);
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }

    public String verifyLoggedInAs() {
        log.info("Get text from : " + loggedInAs.toString());
        //System.out.println(getTextFromElement(loggedInAs));
        return getTextFromElement(loggedInAs);
    }

    public void clickOnLogout() throws InterruptedException {
        try {
            wait(4000);
            (logout).click();
            log.info("click on : " + logout.toString());
        } catch (Exception e) {
            js.executeScript("argument[0].click;", driver.findElement(By.xpath("//a[normalize-space()='Logout']")));
        }
        log.info("click on : " + logout.toString());
    }

    public String verifyAccountDeleted() {

        //System.out.println(getTextFromElement(accountDeleted));
        log.info("Get text from : " + accountDeleted.toString());
        return getTextFromElement(accountDeleted);
    }

    public void clickOnContinue1() {
        try {
            (continueDelete).click();
            log.info("click on : " + continueDelete.toString());
        } catch (Exception e) {
            js.executeScript("argument[0].click;", driver.findElement(By.xpath("//a[normalize-space()='Continue']")));
        }

        log.info("click on : " + continueDelete.toString());
    }

    public void clickOnProducts() {
        try {
            products.click();
            log.info("click on : " + products.toString());
        } catch (Exception e) {
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click();", driver.findElement(By.xpath("//a[@href='/products']")));
        }
        log.info("Click on Products : " + products.toString());
    }

    public void scrollDownToFooter() {
        int deltaY = footer.getRect().y;
        new Actions(driver)
                .scrollByAmount(0, deltaY)
                .perform();
        log.info("scroll down to footer");
    }

    public String verifySubscriptionTextOnFooter() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Get text from : " + sText.toString());
        return getTextFromElement(sText);
    }

    public void enterEmailAddressInInputAndClickArrowButton(String emailID) throws InterruptedException {
        sendTextToElement(sEmail, emailID);
        log.info("Send Text to : " + sEmail.toString());
        try {
            clickSubscribe.click();
            log.info("click on : " + clickSubscribe.toString());
        } catch (Exception e) {
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click();", driver.findElement(By.xpath("//button[@id='subscribe']")));
            Thread.sleep(2000);
        }
        log.info("Click on : " + clickSubscribe.toString());
    }

    public String verifySubscriptionSuccessMessage() {
        log.info("Get text from : " + subscriptionText.toString());
        return getTextFromElement(subscriptionText);
    }


    public void scrollDownToFooterBottom() {
        int deltaY = footerBottom.getRect().y;
        new Actions(driver)
                .scrollByAmount(0, deltaY)
                .perform();
        log.info("scroll down to footer");
    }

    public void scrollUpToTop() {
        new Actions(driver)
                .scrollByAmount(0, 0)
                .perform();
        log.info("scroll up to top");
    }

    public String verifyHomePageTextFullFledged() {
        log.info("Get text from : " + homePageTextFullFledged.toString());
        return getTextFromElement(homePageTextFullFledged);
    }

    public void clickOnArrowUp() {
        try {
            arrowUp.click();
            log.info("click on Arrow Up: " + arrowUp.toString());
        } catch (Exception e) {
            js.executeScript("argument[0].click;", driver.findElement(By.xpath("//i[@class='fa fa-angle-up']")));
        }
        log.info("click on Arrow Up : " + logout.toString());
    }

    public void scrollToBottomOfPage() {
        //new Actions(driver).scrollToElement(recommendedItemsText).perform();
        int deltaY = recommendedItemsText.getRect().y;
        new Actions(driver)
                .scrollByAmount(0, deltaY)
                .perform();
        log.info("scroll To Bottom Of page");
    }

    public String verifyRECOMMENDEDITEMSAreVisible() {
        log.info("Get text from : " + recommendedItemsText.toString());
        return getTextFromElement(recommendedItemsText);
    }

    public void clickOnAddToCartOnRecommendedProduct(String product) {
        for (WebElement item : recommendedItemsList) {
            if(item.getText().equalsIgnoreCase(product)) {
                driver.findElement(with(By.xpath("//a[@class='btn btn-default add-to-cart']")).below(item)).click();
                log.info("Click on " + product + " Add to Cart button : " + recommendedItemsList.toString());
                break;
            }
        }

    }

    public void clickOnViewCartButton() {
        try {
            waitUntilVisibilityOfElementLocated(viewCartClick, 2).click();
            log.info("click on Add To Cart: " + viewCartClick.toString());
        } catch (Exception e) {
            js.executeScript("argument[0].click;", driver.findElement(By.xpath("//div[@class='item active']//div[3]//div[1]//div[1]//div[1]//a[1]")));
        }
        log.info("click on Add To Cart: " + viewCartClick.toString());
    }


    //u[normalize-space()='View Cart']
    public String verifyThatBrandsAreVisibleOnLeftSideBar(){
        log.info("Get text from : " + brandText.toString());
        return getTextFromElement(brandText);

    }



    public void clickOnBrandOnBrandsTab(String brand){
        for (WebElement b : brandNames) {
            System.out.println(b);
            if (b.getText().equalsIgnoreCase(brand)){
                b.click();
                log.info("Clicking on " + brand + " in Brands tab : " + brandNames.toString());
                break;
            } else {
                System.out.println("Brand name is not available");
            }
        }
    }

    public String verifyThatUserIsNavigatedToBrandPage() {
        log.info("Get text from : " + verifyBabyhug.toString());
        return getTextFromElement(verifyBabyhug);
    }

    public String verifyThatUserIsNavigatedToThatBrandPage() {
        log.info("Get text from : " + verifyMadame.toString());
        return getTextFromElement(verifyMadame);
    }

}








