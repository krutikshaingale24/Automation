package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.waitUtility;

public class CreateAccountPage {
    public WebDriver driver;
    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@data-id='firstName']")
    WebElement addFirstName;
    @FindBy(xpath = "//input[@data-id='lastName']")
    WebElement addLastname;
    @FindBy(xpath = "//input[@data-id='email']")
    WebElement addEmail;
    @FindBy(xpath = "//input[@data-id='password']")
    WebElement addpassword;
    @FindBy(xpath = "//input[@data-id='confirmPassword']")
    WebElement addconfirmPassword;

    public void createAccount(String firstname, String lastName) {
        waitUtility.waitUntilElementToBeClickable(addFirstName, driver);
        addFirstName.sendKeys(firstname);
        addLastname.sendKeys("ingale");
    }

    public void addEmail() {
        waitUtility.waitUntilElementToBeClickable(addEmail, driver);
        addEmail.sendKeys("krutikshaingale4@gmail.com");
    }
    public void AddPass(String CPassword, String confirmPassword) {
        waitUtility.waitUntilElementToBeClickable(addpassword, driver);
        addpassword.sendKeys(CPassword);
        waitUtility.waitUntilElementToBeClickable(addconfirmPassword, driver);
        addconfirmPassword.sendKeys(confirmPassword);
    }
}
