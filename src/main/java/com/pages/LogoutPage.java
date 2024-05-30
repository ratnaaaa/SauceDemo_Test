package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class LogoutPage {
    WebDriver driver;

    By hamburgerMenu = By.id("react-burger-menu-btn");
    By logoutMenu = By.id("logout_sidebar_link");
    By loginPage = By.xpath("//div[text()='Swag Labs']");

    public LogoutPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickhamburgerMenu(){
        driver.findElement(hamburgerMenu).click();
    }
    public void clickLogout(){
        driver.findElement(logoutMenu).click();
    }
    public void verifyLoginPage(){
        String getLogin = driver.findElement(loginPage).getText().trim();
        assertEquals("Swag Labs", getLogin);
    }
}
