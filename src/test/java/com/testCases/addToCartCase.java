package com.testCases;

import com.pages.LogoutPage;
import com.pages.addToCartPage;
import com.pages.checkoutPage;
import com.pages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class addToCartCase {
    WebDriver driver;
    loginPage objLogin;
    addToCartPage objAddToCart;
    checkoutPage objCheckOut;
    LogoutPage objLogout;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void doAddToCart(){
        objLogin = new loginPage(driver);
        objAddToCart = new addToCartPage(driver);
        objCheckOut = new checkoutPage(driver);
        objLogin.inputUsername("standard_user");
        objLogin.inputPassword("secret_sauce");
        objLogin.clickLogin();
        objAddToCart.clickAddToCartBackpack();
        objAddToCart.clickDetailBikeProd();
        objAddToCart.clickAddToCartBike();
        objAddToCart.clickShoopingCart();
        objAddToCart.clickButtonCheckout();
        objCheckOut.inputFirstName("Dummy");
        objCheckOut.inputZipCode("12345");
        objCheckOut.clickContinue();
        objCheckOut.VerifyErrorLastName();
    }

    @Test
    public void doValidAddToCart(){
        objLogin = new loginPage(driver);
        objAddToCart = new addToCartPage(driver);
        objCheckOut = new checkoutPage(driver);
        objLogout = new LogoutPage(driver);
        objLogin.inputUsername("standard_user");
        objLogin.inputPassword("secret_sauce");
        objLogin.clickLogin();
        objAddToCart.clickAddToCartBackpack();
        objAddToCart.clickDetailBikeProd();
        objAddToCart.clickAddToCartBike();
        objAddToCart.clickShoopingCart();
        objAddToCart.clickButtonCheckout();
        objCheckOut.inputFirstName("Dummy");
        objCheckOut.inputZipCode("12345");
        objCheckOut.inputLastName("user");
        objCheckOut.clickContinue();
        objCheckOut.verifyTotalPrices();
        objCheckOut.verifyProduct1();
        objCheckOut.verifyProduct2();
        objCheckOut.clickButtonFinish();
        objCheckOut.clickBackToHome();
        objCheckOut.verifyHome();
        objLogout.clickhamburgerMenu();
        objLogout.clickLogout();
        objLogout.verifyLoginPage();
    }
}
