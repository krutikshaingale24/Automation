package testcases;

import Basetest.BaseTestConnect;
import Pages.CreateAccountPage;
import config.PropertyReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTestConnect {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test(description = "Verify Login with valid credentials")
    public void VerifyLoginWithValidCrds() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        homePage.clickOnUserLogo();
        loginPage.closeAdd();
//        homePage.clickOnCreateAnAccount();
//        createAccountPage.createAccount(PropertyReader.getProperty("firstname"), ("lastname"));
//        createAccountPage.addEmail();
//createAccountPage.AddPass(PropertyReader.getProperty("CPassword"), PropertyReader.getProperty("confirmPassword"));
        loginPage.logIn(PropertyReader.getProperty("username"), PropertyReader.getProperty("password"));
        homePage.clickOnUserLogo();
        sf.assertEquals(myProfilePage.myProfile(), "MY PROFILE", "My Profile text should be matched");
        sf.assertAll();
    }


    @Test(description = "Verify Login with invalid Crds")
    public void VerifyLoginWithInvalidPassword() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        homePage.clickOnUserLogo();
     loginPage.closeAdd();
        loginPage.logIn(PropertyReader.getProperty("invalidUsername"), PropertyReader.getProperty("invalidPassword"));
        sf.assertEquals(loginPage.InvalidText(), "Incorrect email or password. Please try again", "Incorrect email or password. Please try again should be matched");
        sf.assertAll();
    }



}