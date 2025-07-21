package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.waitUtility;

public class LoginPage {
    public WebDriver driver;
    @FindBy(xpath = "(//button[@title='Close'])[2]")
    WebElement closeAdd;
    @FindBy(xpath = "//input[@data-id='inputUsername']")
    WebElement userTextBox;
    @FindBy(xpath = "//input[@data-id='inputPassword']")
    WebElement passwordTextBox;
    @FindBy(xpath = "//button[text()=' Login']")
    WebElement loginTextBox;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void closeAdd() {
        waitUtility.waitUntilElementToBeClickable(closeAdd, driver);
    }

    public void logIn(String username, String password) {
        waitUtility.waitUntilElementToBeClickable(userTextBox, driver);
        userTextBox.sendKeys(username);

        waitUtility.waitUntilElementToBeClickable(passwordTextBox, driver);
        passwordTextBox.sendKeys(password);

        waitUtility.waitUntilElementToBeClickable(loginTextBox, driver);
    }


    @FindBy(xpath = "//span[text()='Incorrect email or password. Please try again']")
    WebElement InvalidText;

    public String InvalidText() throws InterruptedException {
        Thread.sleep(5000);
        return InvalidText.getText();
    }


}
