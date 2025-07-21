package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionUtility;
import utils.waitUtility;

public class CapsulesPage {
    public WebDriver driver;

    public CapsulesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[text()='Roma Blend Capsules']")
    WebElement RomaBlendCapsules;

    public void HoverOnEcuadorElizaBourbonSidra()  {
        ActionUtility.moveToElement(RomaBlendCapsules, driver);}

    @FindBy(xpath = "(//button[text()='Shop Now'])[3]")
    WebElement ShopButton;

    public void clickOnShopButton() {
        waitUtility.waitUntilElementToBeClickable(ShopButton, driver);
    }
}
