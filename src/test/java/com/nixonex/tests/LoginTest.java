package com.nixonex.tests;

import com.nixonex.base.BaseTest;
import com.nixonex.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testUserLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "pass123");  // use valid user you registered
    }
}
