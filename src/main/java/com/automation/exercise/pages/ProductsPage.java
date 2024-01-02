package com.automation.exercise.pages;

import com.automation.exercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class ProductsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductsText;
    //h2[normalize-space()='All Products']

    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p")
    List<WebElement> allProductsList;
    //ul[@class='nav nav-pills nav-justified']/li/a
    //div[@class='productinfo text-center']//p

    @CacheLookup
    @FindBy (xpath = "//a[@class='btn btn-default add-to-cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingClick;

    @CacheLookup
    @FindBy (xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartClick;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-justified']/li/a")
    List<WebElement> viewProductsTab;


    @CacheLookup
    @FindBy (xpath = "//td[@class = 'cart_description']/h4/a")
    List<WebElement> cartItemsList;


    @CacheLookup
    @FindBy (xpath = "//td[@class = 'cart_price']/p")
    List<WebElement> cartPriceList;

    @CacheLookup
    @FindBy (xpath = "//td[@class = 'cart_quantity']/button")
    List<WebElement> cartQuantityList;

    @CacheLookup
    @FindBy (xpath = "//td[@class = 'cart_total']/p")
    List<WebElement> cartTotalPriceList;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchBox;
    //input[@id='search_product']

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit_search']")
    WebElement searchClick;
    //button[@id='submit_search']

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchProductsText;
    //h2[normalize-space()='Searched Products']

    //div[@class='features_items']
    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']/p")
    List<WebElement> searchedProducts;
    //div[@class='features_items']//div[@class='col-sm-4']

    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement enterSearch;
    //input[@id='search_product']

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit_search']")
    WebElement clickSearchBox;
    //button[@id='submit_search']


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement sProducts;
    //h2[normalize-space()='Searched Products']

    //div[3]//div[1]//div[1]//div[2]//div[1]//a[1]



    //button[normalize-space()='Continue Shopping']

    //div[3]//div[1]//div[1]//div[2]//div[1]//a[1]

    //u[normalize-space()='View Cart']


    //button[normalize-space()='4']

    public String verifySEARCHEDPRODUCTSIsVisible(){
        return getTextFromElement(sProducts);
    }

    public void enterProductNameInSearchBoxAndClick(String searchItem){
        sendTextToElement(enterSearch, searchItem);
        clickSearchBox.click();
    }


    public boolean verifyProductsPage() {
        log.info("Get Products Page URL : " + driver.getCurrentUrl());
        return driver.getCurrentUrl().contains("https://automationexercise.com/products");
    }

    public String verifyAllProducts() {
        log.info("verify All Products text : " + allProductsText.toString());
        return getTextFromElement(allProductsText);
    }

    public void getAllProductsList() {
        for (WebElement productList : allProductsList) {
            System.out.println(productList.getText());
        }
    }

    public void clickOnViewProductOfTheProduct(String product) {
        for (WebElement products : allProductsList) {
            if (products.getText().equalsIgnoreCase(product)) {
                driver.findElement(with(By.xpath("//ul[@class = 'nav nav-pills nav-justified']/li/a")).below(products)).click();
                log.info("Clicking on view product tab of " + product);
                break;
            }
        }
    }

    public void enterTextInSearchBox(String search_product) {
        sendTextToElement(searchBox, search_product);
    }

    public void clickOnSearch() {
        try {
            searchClick.click();
            //log.info("click on : " + products.toString());
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].click();", driver.findElement(By.xpath("//button[@id='submit_search']")));
        }
        log.info("Click on Products : " + searchClick.toString());
    }

    public String getSearchProductText() {
        log.info("Get Text from : " + searchProductsText.toString());
        return getTextFromElement(searchProductsText);
    }

    public ArrayList getSearchedProducts() {
        List<WebElement> serachProductsList = searchedProducts;
        ArrayList <String> searchedList = new ArrayList<>();
        for(WebElement s : serachProductsList){
            searchedList.add(s.getText());
        }
        System.out.println(searchedList);
        log.info("Searched Products : " + searchedProducts.toString());
        return searchedList;
    }

    public void mouseHoverAndClickAddToCartOnProduct(String product){
        for (WebElement pr : allProductsList) {
            if(pr.getText().equalsIgnoreCase(product)) {
                mouseHoverToElement(pr);
                log.info("Hovering mouse over " + product + " : " + allProductsList.toString());
                try {
                    addToCartButton.click();
                } catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")));
                }
                log.info("Click on " + product + " Add to Cart button : " + allProductsList.toString());
                break;
            }
        }
    }

    public void clickContinueShoppingButton(){
        continueShoppingClick.click();
        log.info("Click on continueShopping : " + continueShoppingClick.toString());
    }

    public void clickViewCartButton(){
        clickOnElement(viewCartClick);
        log.info("Click on view Cart : " + viewCartClick.toString());
    }

    public void waitTime()throws InterruptedException{
        log.info("Wait : ");
        Thread.sleep(1000);
    }
}
