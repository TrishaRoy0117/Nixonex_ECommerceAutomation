package com.nixonex.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    @FindBy(id = "signin2") WebElement signUpLink;
    @FindBy(id = "sign-username") WebElement usernameField;
    @FindBy(id = "sign-password") WebElement passwordField;
    @FindBy(xpath = "//button[text()='Sign up']") WebElement signUpButton;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void register(String username, String password) throws InterruptedException {
        signUpLink.click();
        Thread.sleep(1000); // Wait for modal
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        signUpButton.click();
        Thread.sleep(2000); // Wait for alert
        driver.switchTo().alert().accept();
    }
}
