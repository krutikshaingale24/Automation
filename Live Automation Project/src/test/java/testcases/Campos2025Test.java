package testcases;

import Basetest.BaseTestConnect;
import config.PropertyReader;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Campos2025Test extends BaseTestConnect {
    @Test(description = "Verify New Window")
    public void NewWindow() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        homePage.clickAddOnCookie();
        campos2025.clickOnEnterButton();
        campos2025.switchToNewWindow();
        campos2025.switchToOriginalWindow();//
       sf.assertEquals(campos2025.VerifyText(), "BEST SELLERS", "BEST SELLERS text should be matched");
    }
}
