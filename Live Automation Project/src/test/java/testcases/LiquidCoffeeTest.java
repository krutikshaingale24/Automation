package testcases;

import Basetest.BaseTestConnect;
import config.PropertyReader;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LiquidCoffeeTest extends BaseTestConnect {
    @Test(description = "Sort Iteams on Page")
    public void SortItems() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        homePage.clickOnUserLogo();
        loginPage.closeAdd();
        loginPage.logIn(PropertyReader.getProperty("username"), PropertyReader.getProperty("password"));
        Thread.sleep(6000);
        homePage.selectNewArrivalFromList(PropertyReader.getProperty("shopOption3"));
    liquidCoffeePage.clickOnSortButton();
        liquidCoffeePage.selectFromSortList(PropertyReader.getProperty("sort"));
    }


}
