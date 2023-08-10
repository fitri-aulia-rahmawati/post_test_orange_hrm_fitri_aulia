package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='pink drop shoulder oversized t shirt']")
    private WebElement productLink;

    @FindBy(xpath = "//option[@value='pink']")
    private WebElement colorDropdown;

    @FindBy(xpath = "//option[@value='37']")
    private WebElement sizeDropdown;

    @FindBy(xpath = "//button[@class='add_to_cart_button']")
    private WebElement addToCartButton;

    public void addToCart() {
        productLink.click();
        // Select color and size from dropdowns
        colorDropdown.click();
        // Select size
        sizeDropdown.click();
        // Click Add to Cart button
        addToCartButton.click();
    }
}
