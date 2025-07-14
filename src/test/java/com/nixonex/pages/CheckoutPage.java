package com.nixonex.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(id = "name") WebElement nameField;
    @FindBy(id = "country") WebElement countryField;
    @FindBy(id = "city") WebElement cityField;
    @FindBy(id = "card") WebElement cardField;
    @FindBy(id = "month") WebElement monthField;
    @FindBy(id = "year") WebElement yearField;
    @FindBy(xpath = "//button[text()='Purchase']") WebElement purchaseButton;
    @FindBy(xpath = "//button[text()='OK']") WebElement okButton;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillDetailsAndPurchase(String name, String country, String city, String card, String month, String year) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(nameField));

        nameField.sendKeys(name);
        countryField.sendKeys(country);
        cityField.sendKeys(city);
        cardField.sendKeys(card);
        monthField.sendKeys(month);
        yearField.sendKeys(year);
        purchaseButton.click();
    }


    public void confirmOrder() {
        okButton.click();
    }
}
