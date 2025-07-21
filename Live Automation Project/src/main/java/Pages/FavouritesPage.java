package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ActionUtility;
import utils.waitUtility;

public class FavouritesPage {
    public WebDriver driver;

    public FavouritesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//img[starts-with(@src,'/webruntime/org-asset/f61a2ba3b9')])[7]")
    WebElement AddToFav;

    public void clickOnAddToFav() {
        waitUtility.waitUntilElementToBeClickable(AddToFav, driver);
    }

    @FindBy(xpath = "//select[@class='select-option']")
    WebElement Dropdown;


    public void SelectValueFromDropdown() {
        Select s = new Select(Dropdown);
        s.selectByIndex(1);
    }

    public void clickOnFavourites() {
        waitUtility.waitUntilElementToBeClickable(Favourites,driver);
    }

    @FindBy(xpath = "//a[text()='Favourites']")
    WebElement Favourites;
    @FindBy(xpath = "//span[text()='Roma Blend Capsules']")
    WebElement VerifyElement;

    public String VerifyText() throws InterruptedException {
        return VerifyElement.getText();}
}
