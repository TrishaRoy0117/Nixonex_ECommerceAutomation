package com.nixonex.tests;

import com.nixonex.base.BaseTest;
import com.nixonex.pages.*;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void testFullCheckoutFlow() throws InterruptedException {
        String username = "user" + System.currentTimeMillis();
        String password = "pass123";

        // Register + Login
        new RegisterPage(driver).register(username, password);
        new LoginPage(driver).login(username, password);

        // Select + Add Product
        new HomePage(driver).selectSamsungGalaxyS6();
        new ProductPage(driver).addToCart();

        // Go to Cart and Place Order
        CartPage cartPage = new CartPage(driver);
        cartPage.goToCart();
        cartPage.clickPlaceOrder();

        // Fill checkout form and confirm
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillDetailsAndPurchase("Trisha Roy", "India", "Kolkata", "1234567812345678", "07", "2025");
        checkoutPage.confirmOrder();
    }
}
