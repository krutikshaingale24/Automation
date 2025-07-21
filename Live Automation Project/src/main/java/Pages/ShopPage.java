package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionUtility;
import utils.WebElementUtility;
import utils.waitUtility;

import java.util.List;

import static utils.ActionUtility.actions;

public class ShopPage {
    public WebDriver driver;
    public ShopPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//ul[@class='submenu']//child::li")
    List<WebElement> allListOfShops;

    @FindBy(xpath = "//div[text()='Shop']")
    WebElement shopElement;

    public void moveToShopElement(String option)  {
        ActionUtility.moveToElement(shopElement, driver);
        waitUtility.waitUntilElementToBeVisible(allListOfShops.get(0), driver);
        WebElementUtility.iterateListOfElement(allListOfShops, driver, option);
    }
}
