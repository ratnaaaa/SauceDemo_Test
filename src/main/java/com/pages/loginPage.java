package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class loginPage {
    WebDriver driver;
    By fieldUserName = By.id("user-name");
    By fieldPassword = By.id("password");
    By buttonSubmit = By.id("login-button");
    By errorLogin = By.xpath("//h3[text()='Epic sadface: Sorry, this user has been locked out.']");

    public loginPage(WebDriver driver){

        this.driver=driver;

    }
    public void inputUsername(String username){
        driver.findElement(fieldUserName).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(fieldPassword).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(buttonSubmit).click();
    }
    public void VerifyErrorMessage(){
        String getError = driver.findElement(errorLogin).getText().trim();
        assertEquals("Epic sadface: Sorry, this user has been locked out.", getError);
    }
}
