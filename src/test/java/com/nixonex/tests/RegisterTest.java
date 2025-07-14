package com.nixonex.tests;

import com.nixonex.base.BaseTest;
import com.nixonex.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void testUserRegistration() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register("user" + System.currentTimeMillis(), "pass123");
    }
}
