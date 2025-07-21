package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionUtility;
import utils.waitUtility;

public class NewArrivalFiltersPage {
    public WebDriver driver;

    public NewArrivalFiltersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//button[@title='Toggle filter, collapsed'])[1]")
    WebElement filterRoastType;
    public void ClickOnRoastTypeFilter() {
        waitUtility.waitUntilElementToBeClickable(filterRoastType, driver);
    }
    @FindBy(xpath = "(//span[@class='slds-checkbox_faux'])[1]")
    WebElement EspressoChekbox ;
    public void ClickOnEspressoChekbox() {
        waitUtility.waitUntilElementToBeClickable(EspressoChekbox, driver);
    }

    @FindBy(xpath = "(//button[@title='Toggle filter, collapsed'])[1]")
    WebElement filterCoffeeType;
    public void ClickOnCoffeeTypeFilter() {
        waitUtility.waitUntilElementToBeClickable(filterCoffeeType, driver);
    }
    @FindBy(xpath = "(//span[@class='slds-checkbox_faux'])[3]")
    WebElement SingleChekbox ;
    public void ClickOnSingleChekbox() {
        waitUtility.waitUntilElementToBeVisibleToBeClick(SingleChekbox, driver);
    }

    @FindBy(xpath = "(//button[@title='Toggle filter, collapsed'])[1]")
    WebElement filterRoastLevel;
    public void ClickOnRoastLevelFilter() {
        waitUtility.waitUntilElementToBeClickable(filterRoastLevel, driver);
    }
    @FindBy(xpath = "(//span[@class='slds-checkbox_faux'])[4]")
    WebElement MediumRoastChekbox ;
    public void ClickOnMediumRoastChekbox() {
        waitUtility.waitUntilElementToBeVisibleToBeClick(MediumRoastChekbox, driver);
    }

    @FindBy(xpath = "//button[@title='Toggle filter, collapsed']")
    WebElement filterTasteProfile;
    public void ClickOnTasteProfileFilter() {
        waitUtility.waitUntilElementToBeClickable(filterTasteProfile, driver);
    }
    @FindBy(xpath = "(//span[@class='slds-checkbox_faux'])[6]")
    WebElement FruityChekbox ;
    public void ClickOnFruityChekbox() {
        waitUtility.waitUntilElementToBeVisibleToBeClick(FruityChekbox, driver);
    }
    @FindBy(xpath = "//p[text()='Burundi Munkaze']")
    WebElement BurundiMunkaze;
    @FindBy(xpath = "(//button[text()='Shop Now'])[3]")
    WebElement BurundiMunkazeShop;

    public void HoverOnBurundiMunkaze()  {
        ActionUtility.moveToElement(BurundiMunkaze, driver);}

    public void ClickOnBurundiMunkazeProduct() {
        waitUtility.waitUntilElementToBeClickable(BurundiMunkazeShop, driver);
    }
    @FindBy(xpath = "//button[text()='Checkout Now']")
    WebElement CheckoutNowButton;

    public void ClickOnCheckoutNowButton() {
        waitUtility.waitUntilElementToBeClickable(CheckoutNowButton, driver);
    }
}
