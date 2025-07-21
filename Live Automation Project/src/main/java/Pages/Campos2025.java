package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.waitUtility;

import java.util.Set;

public class Campos2025 {
    public WebDriver driver;

    public Campos2025(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='slds-button slds-button_brand']")
    WebElement enterButton;

    public void clickOnEnterButton() {
        waitUtility.waitUntilElementToBeClickable(enterButton, driver);
    }

    public void switchToNewWindow() {
        String originalWindowHandle = driver.getWindowHandle();
        Set<String> AllWindowHandles = driver.getWindowHandles();
        for (String windowHandle : AllWindowHandles) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                System.out.println(driver.getTitle());
                break;

            }

            waitUtility.waitUntilElementToBeClickable(acceptCookie,driver);
        }
        driver.switchTo().window(originalWindowHandle);
    }
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptCookie;


    public void switchToOriginalWindow() {
        String originalWindowHandle = driver.getWindowHandle();
        Set<String> AllWindowHandles = driver.getWindowHandles();
        driver.switchTo().window(originalWindowHandle);
    }

    @FindBy(xpath = "//h3[text()='BEST SELLERS']")
    WebElement homeText;

    public String VerifyText() throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", homeText);
        return homeText.getText();
    }
}
