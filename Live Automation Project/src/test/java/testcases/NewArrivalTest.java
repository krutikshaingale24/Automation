package testcases;

import Basetest.BaseTestConnect;
import config.PropertyReader;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewArrivalTest extends BaseTestConnect {
    @Test(description = "Verify New Arrival Page")
    public void VerifyNewArrivalPage() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        homePage.selectNewArrivalFromList(PropertyReader.getProperty("shopOption"));
        Thread.sleep(3000);
        newArrivalPage.clickOnCloseAdd();
        sf.assertEquals(newArrivalPage.VerifyNewArrivalText(), "NEW ARRIVALS", "New Arrivals text should be matched");
        sf.assertAll();

    }

    @Test(description = "Add items in a Cart from the Arrival Page")
    public void AddItemsFromArrivalPage() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        homePage.clickOnUserLogo();
        loginPage.closeAdd();
        loginPage.logIn(PropertyReader.getProperty("username"), PropertyReader.getProperty("password"));
        Thread.sleep(6000);
        homePage.selectNewArrivalFromList(PropertyReader.getProperty("shopOption"));
//        Thread.sleep(6000);
//   newArrivalPage.clickOnCloseAdd();
        newArrivalPage.scrollDown();
        newArrivalPage.HoverOnEcuadorElizaBourbonSidra();
        newArrivalPage.ClickOnSecondProduct();
        ecuadorElizaBourbonSidraPage.ClickOnNumber(PropertyReader.getProperty("number"));
        ecuadorElizaBourbonSidraPage.ClickOnAddToCart();
        ecuadorElizaBourbonSidraPage.ClickOnContinueShopping();
        ecuadorElizaBourbonSidraPage.navigate();
        newArrivalPage.HoverOnRwandaTwumba();
        newArrivalPage.ClickOnFifthProduct();
        rwandaTwumbaPage.ClickOnAddToCart();
        rwandaTwumbaPage.ClickOnContinueShopping();
        rwandaTwumbaPage.navigate();
    }

    @Test(description = "Add Filter in Arrival Page")
    public void AddFilterInArrivalPage() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        homePage.clickOnUserLogo();
        loginPage.closeAdd();
        loginPage.logIn(PropertyReader.getProperty("username"), PropertyReader.getProperty("password"));
        Thread.sleep(5000);
        homePage.selectNewArrivalFromList(PropertyReader.getProperty("shopOption"));
        Thread.sleep(3000);
        newArrivalFiltersPage.ClickOnRoastTypeFilter();
        newArrivalFiltersPage.ClickOnEspressoChekbox();
        newArrivalPage.scrollDown();
        Thread.sleep(2000);
        newArrivalFiltersPage.ClickOnCoffeeTypeFilter();
        Thread.sleep(2000);
        newArrivalFiltersPage.ClickOnSingleChekbox();
        newArrivalFiltersPage.ClickOnRoastLevelFilter();
        Thread.sleep(2000);
        newArrivalFiltersPage.ClickOnMediumRoastChekbox();
        newArrivalFiltersPage.ClickOnTasteProfileFilter();
        Thread.sleep(2000);
        newArrivalFiltersPage.ClickOnFruityChekbox();
        Thread.sleep(2000);
        newArrivalFiltersPage.HoverOnBurundiMunkaze();
        newArrivalFiltersPage.ClickOnBurundiMunkazeProduct();
        rwandaTwumbaPage.ClickOnAddToCart();
        newArrivalFiltersPage.ClickOnCheckoutNowButton();
        sf.assertEquals(cartPage.VerifyCartText(), "CART", "Cart text should be matched");
        sf.assertAll();
    }
}

