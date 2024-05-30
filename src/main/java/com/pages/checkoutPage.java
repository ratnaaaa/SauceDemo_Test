package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class checkoutPage {
    WebDriver driver;
    By fieldFirtsName = By.id("first-name");
    By fieldLastName = By.id("last-name");
    By fieldZipCode = By.id("postal-code");
    By buttonContinue = By.id("continue");
    By errorLastName = By.xpath("//h3[text()='Error: Last Name is required']");
    By buttonfinish = By.id("finish");
    By buttonBackHome = By.id("back-to-products");
    By Price = By.xpath("//div[@class='summary_info_label summary_total_label']");
    By product1 = By.xpath("(//div[@class='inventory_item_name'])[1]");
    By product2 = By.xpath("(//div[@class='inventory_item_name'])[2]");
    By backToHome = By.xpath("//span[text()='Products']");

    public checkoutPage(WebDriver driver){
        this.driver = driver;
    }
    public void inputFirstName(String firstname){
        driver.findElement(fieldFirtsName).sendKeys(firstname);
    }
    public void inputLastName(String lastname){
        driver.findElement(fieldLastName).sendKeys(lastname);
    }
    public void inputZipCode(String zipcode){
        driver.findElement(fieldZipCode).sendKeys(zipcode);
    }
    public void clickContinue(){
        driver.findElement(buttonContinue).click();
    }
    public void VerifyErrorLastName(){
        String getError = driver.findElement(errorLastName).getText().trim();
        assertEquals("Error: Last Name is required", getError);
    }
    public void verifyTotalPrices(){
        String verifyPrice = driver.findElement(Price).getText().trim();
        assertEquals("Total: $43.18",verifyPrice);
    }
    public void verifyProduct1(){
        String getProduct1 = driver.findElement(product1).getText().trim();
        assertEquals("Sauce Labs Backpack",getProduct1);
    }
    public void verifyProduct2(){
        String getProduct2 = driver.findElement(product2).getText().trim();
        assertEquals("Sauce Labs Bike Light",getProduct2);
    }
    public void clickButtonFinish(){
        driver.findElement(buttonfinish).click();
    }
    public void clickBackToHome(){
        driver.findElement(buttonBackHome).click();
    }
    public void verifyHome(){
        String getHome = driver.findElement(backToHome).getText().trim();
        assertEquals("Products", getHome);
    }
}
