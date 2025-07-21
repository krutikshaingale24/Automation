package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionUtility;
import utils.waitUtility;

import java.time.Duration;

public class NewArrivalPage {
    public WebDriver driver;
    public NewArrivalPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@title='Close'])[1]")
    WebElement CloseAdd;

    public void clickOnCloseAdd() {
        waitUtility.waitUntilElementToBeClickable(CloseAdd, driver);
    }
    @FindBy(xpath = "//h1[text()='New Arrivals']")
    WebElement NewArrivalText;

    public String VerifyNewArrivalText() {

        return NewArrivalText.getText();
    }

    @FindBy(xpath = "(//button[text()='Shop Now'])[3]")
    WebElement productSecond;
    @FindBy(xpath = "(//button[text()='Shop Now'])[9]")
    WebElement productFifth;
    @FindBy(xpath = "//h3[text()='Coffee Type']")
    WebElement CoffeeType;

    public void ClickOnSecondProduct() {
        waitUtility.waitUntilElementToBeClickable(productSecond, driver);
    }
    @FindBy(xpath = "//p[text()='Rwanda Twumba']")
    WebElement RwandaTwumba;

    public void HoverOnRwandaTwumba()  {
        ActionUtility.moveToElement(RwandaTwumba, driver);}

    @FindBy(xpath = "//p[text()='Ecuador Eliza Bourbon Sidra']")
    WebElement EcuadorElizaBourbonSidra;

    public void HoverOnEcuadorElizaBourbonSidra()  {
        ActionUtility.moveToElement(EcuadorElizaBourbonSidra, driver);}

    public void ClickOnFifthProduct() {
        waitUtility.waitUntilElementToBeClickable(productFifth, driver);
    }
    public void scrollDown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", CoffeeType);
    }

}
