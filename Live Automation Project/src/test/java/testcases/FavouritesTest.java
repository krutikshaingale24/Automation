package testcases;

import Basetest.BaseTestConnect;
import config.PropertyReader;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FavouritesTest extends BaseTestConnect {

    @Test(description = "Verify Itams In Favourite Page")
    public void FavouritePageItems() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        homePage.clickOnUserLogo();
        loginPage.closeAdd();
        loginPage.logIn(PropertyReader.getProperty("username"), PropertyReader.getProperty("password"));
        Thread.sleep(6000);
        homePage.selectNewArrivalFromList(PropertyReader.getProperty("shopOption2"));
        newArrivalPage.scrollDown();
        capsulesPage.HoverOnEcuadorElizaBourbonSidra();
      capsulesPage.clickOnShopButton();
        Thread.sleep(2000);
        favouritesPage.SelectValueFromDropdown();
      favouritesPage.clickOnAddToFav();
        homePage.clickOnUserLogo();
        favouritesPage.clickOnFavourites();
        sf.assertEquals(favouritesPage.VerifyText(), "Roma Blend Capsules", "Roma Blend Capsules text should be matched");
        sf.assertAll();
    }


}
