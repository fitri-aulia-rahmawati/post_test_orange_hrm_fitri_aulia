package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

//    public void Login() {
//        Actions actions = new Actions(driver);
//        WebElement btnDismiss = driver.findElement(By.xpath("//a[@class='dismiss-link'"));
//        actions.moveToElement(btnDismiss).click().perform();
//        WebElement btnMyAcc = driver.findElement(By.xpath("//a[normalize-space()='My Account']"));
//        actions.moveToElement(btnMyAcc).click().perform();
//    }

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator @FindBy
    @FindBy(xpath = "//input[@id='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(xpath = "//button[contains(@class, 'login__submit')]")
    WebElement btnLogin;

    @FindBy(xpath = "//a[@class='custom-logo']")
    WebElement btnDashboard;

    // Custom Method
    public void login(){
        username.sendKeys("fitriauliaa3112@gmail.com");
        password.sendKeys("Fitriaulia");
        btnLogin.click();
        btnDashboard.click();
    }


    // Method return

}
