package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
    public WebDriver driver;
    public MyProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h2[text()='My Profile']")
    WebElement clickOnMyProfile;

    public String myProfile() throws InterruptedException {
        Thread.sleep(5000);

        return clickOnMyProfile.getText();

    }
}
