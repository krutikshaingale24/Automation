package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionUtility;
import utils.WebElementUtility;
import utils.waitUtility;

import java.util.List;

public class HomePage {

    public WebDriver driver;
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptCookie;

    @FindBy(xpath = "(//li[@class='icon-menu'])[2]")
    WebElement userLogo;

    @FindBy(xpath = "//a[text()='Create an Account']")
    WebElement createAnAccount;

    public HomePage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    public void clickAddOnCookie()  {
        waitUtility.waitUntilElementToBeClickable(acceptCookie,driver);
    }
    public void clickOnUserLogo() throws InterruptedException {
        Thread.sleep(5000);
        waitUtility.waitUntilElementToBeClickable(userLogo,driver);
    }
    public void clickOnCreateAnAccount() {
        waitUtility.waitUntilElementToBeClickable(createAnAccount,driver);
    }

    @FindBy(xpath = "//div[text()='Shop']")
    WebElement shopElement;

    @FindBy(xpath = "//ul[@class='submenu']//child::li")
    List<WebElement> allListOfShops;
//
//    public void selectNewArrivalFromList(String option)  {
//        ActionUtility.moveToElement(shopElement, driver);
//        WebElementUtility.iterateListOfElement(allListOfShops, driver, option);
//    }

public void selectNewArrivalFromList(String shopOption) {
    Actions a = new Actions(driver);
    a.moveToElement(shopElement).build().perform();
    for (WebElement e : allListOfShops) {
        if (e.getText().trim().equalsIgnoreCase(shopOption)) {
            e.click();
            break;
        }
    }
}
    @FindBy(xpath = "(//li[@class='icon-menu'])[1]")
    WebElement SearchClick;
    public void clickOnSearchButton() {
        waitUtility.waitUntilElementToBeClickable(SearchClick, driver);
    }
    @FindBy(xpath = "(//input[@type='text'])[1]")
    WebElement TextEnter;
    public void enterTextOnSearchTextBox(String searchProduct1) {
        waitUtility.waitUntilElementToBeClickable(TextEnter, driver);
//        TextEnter.sendKeys(searchProduct1);
        Actions a= new Actions(driver);
        a.click(TextEnter).sendKeys(searchProduct1).sendKeys(Keys.ENTER).build().perform();
    }
   @FindBy(xpath = "//h2[text()='SEARCH RESULTS']")
    WebElement VerifyText;

    public String VerifySearchResultText() {
        waitUtility.waitUntilElementToBeVisible(VerifyText, driver);
        return VerifyText.getText();
    }

    @FindBy(xpath = "//p[contains(text(),'We can’t seem to find any products')]")
    WebElement VerifyInvalidSearch;

    public String VerifyInvalidSearchResultText() {
        waitUtility.waitUntilElementToBeVisible(VerifyInvalidSearch, driver);
        return VerifyInvalidSearch.getText();
    }
}
