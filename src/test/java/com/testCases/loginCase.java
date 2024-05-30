package com.testCases;

import com.pages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class loginCase {
    WebDriver driver;
    loginPage objLogin;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void invalidLogin() {
        objLogin = new loginPage(driver);
        objLogin.inputUsername("locked_out_user");
        objLogin.inputPassword("secret_sauce");
        objLogin.clickLogin();
        objLogin.VerifyErrorMessage();
    }
}
