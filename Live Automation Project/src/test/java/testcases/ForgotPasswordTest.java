package testcases;

import Basetest.BaseTestConnect;
import config.PropertyReader;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ForgotPasswordTest extends BaseTestConnect {
    @Test(description = "Verify Forgot password")
    public void AddProduct() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        homePage.clickOnUserLogo();
        loginPage.closeAdd();
        forgotPasswordPage.clickOnForgotPassword();
        forgotPasswordPage.enterEmail(PropertyReader.getProperty("username"));
        forgotPasswordPage.clickOnResetButton();
        sf.assertEquals(forgotPasswordPage.emailVerification(), "NOW CHECK YOUR EMAIL", "Now check your email text should be matched");
        sf.assertAll();
        forgotPasswordPage.clickOnBackToLogin();
    }
}
