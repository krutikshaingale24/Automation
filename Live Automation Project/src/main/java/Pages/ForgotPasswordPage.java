package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.waitUtility;

public class ForgotPasswordPage {
    public WebDriver driver;
    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Forgot your password?']")
    WebElement addForgotPassword;
    public void clickOnForgotPassword() {
        waitUtility.waitUntilElementToBeClickable(addForgotPassword,driver);
    }
    @FindBy(xpath = "//input[@class='slds-input']")
    WebElement validEmail;
    public void enterEmail(String username) {
        waitUtility.waitUntilElementToBeClickable(validEmail,driver);
        validEmail.sendKeys(username);
    }
    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement resetButton;
    public void clickOnResetButton() {
        waitUtility.waitUntilElementToBeClickable(resetButton,driver);
    }

    @FindBy(xpath = "//h2[text()='Now check your email']")
    WebElement text;

    public String emailVerification() throws InterruptedException {
        Thread.sleep(5000);
        return text.getText();

    }
    @FindBy(xpath = "//button[text()='Back to login']")
    WebElement backToLogin;
    public void clickOnBackToLogin() {
        waitUtility.waitUntilElementToBeClickable(backToLogin,driver);
    }
}
