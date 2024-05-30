package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addToCartPage {
    WebDriver driver;
    By addToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By detailBike = By.xpath("//div[text()='Sauce Labs Bike Light']");
    By addToCartBike = By.id("add-to-cart-sauce-labs-bike-light");
    By iconShoopingCart = By.id("shopping_cart_container");
    By buttonCheckout = By.id("checkout");

    public addToCartPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickAddToCartBackpack(){
        driver.findElement(addToCartBackpack).click();
    }
    public void clickDetailBikeProd(){
        driver.findElement(detailBike).click();
    }
    public void clickAddToCartBike(){
        driver.findElement(addToCartBike).click();
    }
    public void clickShoopingCart(){
        driver.findElement(iconShoopingCart).click();
    }
    public void clickButtonCheckout(){
        driver.findElement(buttonCheckout).click();
    }
}
