package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.waitUtility;

public class RwandaTwumbaPage {
    public WebDriver driver;

    public RwandaTwumbaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Add to Cart']")
    WebElement AddToCart;

    public void ClickOnAddToCart() {
        waitUtility.waitUntilElementToBeClickable(AddToCart, driver);
    }
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    WebElement ContinueShopping;

    public void ClickOnContinueShopping() {
        waitUtility.waitUntilElementToBeClickable(ContinueShopping, driver);
    }

    public void navigate()
    {
        driver.navigate().back();
    }
}
