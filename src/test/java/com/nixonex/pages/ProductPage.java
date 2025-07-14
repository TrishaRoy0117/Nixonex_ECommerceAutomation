package com.nixonex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class ProductPage {
    WebDriver driver;

    @FindBy(xpath = "//a[text()='Add to cart']") WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Add to cart']")));
        PageFactory.initElements(driver, this);
    }

    public void addToCart() throws InterruptedException {
        addToCartButton.click();
        Thread.sleep(2000); // Wait for alert
        driver.switchTo().alert().accept();
    }
}
