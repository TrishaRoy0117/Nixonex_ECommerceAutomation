package com.nixonex.tests;

import com.nixonex.base.BaseTest;
import com.nixonex.pages.HomePage;
import com.nixonex.pages.LoginPage;
import com.nixonex.pages.ProductPage;
import com.nixonex.pages.RegisterPage;

import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

	@Test
	public void testAddProductToCart() throws InterruptedException {
	    String username = "user" + System.currentTimeMillis();
	    String password = "pass123";

	    // Register new user
	    RegisterPage registerPage = new RegisterPage(driver);
	    registerPage.register(username, password);

	    // Login with that same user
	    LoginPage loginPage = new LoginPage(driver);
	    loginPage.login(username, password);

	    // Add product
	    HomePage homePage = new HomePage(driver);
	    homePage.selectSamsungGalaxyS6();

	    ProductPage productPage = new ProductPage(driver);
	    productPage.addToCart();
	}
}