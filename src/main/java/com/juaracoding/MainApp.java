package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class MainApp {
    static WebDriver driver;

    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com/my-account/");

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        System.out.println("Test Login");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)");

        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();

        CartPage addToCartPage = new CartPage(driver);
        addToCartPage.addToCart();
    }
}