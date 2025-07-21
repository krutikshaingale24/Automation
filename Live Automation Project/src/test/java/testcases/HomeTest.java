package testcases;

import Basetest.BaseTestConnect;
import config.PropertyReader;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTest extends BaseTestConnect{

    @Test(description = "Search Iteams on Page")
    public void SearchItems() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        homePage.clickOnUserLogo();
        loginPage.closeAdd();
        loginPage.logIn(PropertyReader.getProperty("username"), PropertyReader.getProperty("password"));
        Thread.sleep(6000);
        homePage.clickOnSearchButton();
        homePage.enterTextOnSearchTextBox(PropertyReader.getProperty("searchProduct1"));
        sf.assertEquals(homePage.VerifySearchResultText(), "SEARCH RESULTS", "SEARCH RESULTS should be matched");
        sf.assertAll();
    }
    @Test(description = "Verify text on after searching invalid text ")
    public void invalidSearchResultText() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        homePage.clickOnUserLogo();
        loginPage.closeAdd();
        loginPage.logIn(PropertyReader.getProperty("username"), PropertyReader.getProperty("password"));
        Thread.sleep(3000);
        homePage.clickOnSearchButton();
        homePage.enterTextOnSearchTextBox(PropertyReader.getProperty("searchinvalidProduct1"));
        sf.assertEquals(homePage.VerifyInvalidSearchResultText(), "WE CAN’T SEEM TO FIND ANY PRODUCTS THAT MATCH YOUR SEARCH.", "We can’t seem to find any products that match your search. should be matched");
        sf.assertAll();
    }

}
