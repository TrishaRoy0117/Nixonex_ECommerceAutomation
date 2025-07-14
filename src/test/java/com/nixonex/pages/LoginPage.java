package com.nixonex.pages;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "login2") WebElement loginLink;
    @FindBy(id = "loginusername") WebElement usernameInput;
    @FindBy(id = "loginpassword") WebElement passwordInput;
    @FindBy(xpath = "//button[text()='Log in']") WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) throws InterruptedException {
        loginLink.click();
        Thread.sleep(1000);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

        
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.alertIsPresent());
            String alertText = driver.switchTo().alert().getText();
            System.out.println("Login Alert: " + alertText);
            driver.switchTo().alert().accept();
        } catch (TimeoutException e) {
            // No alert appeared — all good
        }

    }
}
