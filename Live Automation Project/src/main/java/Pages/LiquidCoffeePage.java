package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.waitUtility;

import java.util.List;

public class LiquidCoffeePage {
    public WebDriver driver;

    public LiquidCoffeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@type='button'])[1]")
    WebElement sortButton;
//    @FindBy(xpath = "//lightning-menu-item[@ROLE='presentation']")//first xpath
//second path
@FindBy(xpath = "//div[@class='slds-dropdown slds-dropdown_right']//following::lightning-menu-item")
    List<WebElement> SortList;
    public void clickOnSortButton() {
        waitUtility.waitUntilElementToBeClickable(sortButton, driver);
    }

    public void selectFromSortList(String option) {
        for (WebElement e : SortList) {
            if (e.getText().trim().equalsIgnoreCase(option)) {
                waitUtility.waitUntilElementToBeVisibleToBeClick(e,driver);
                break;
            }
        }
    }


}
