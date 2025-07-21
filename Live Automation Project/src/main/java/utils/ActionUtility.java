package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.PublicKey;

import static testBase.WebTestBase.driver;

public class ActionUtility {
    public static Actions actions;
    public static void moveToElement(WebElement element, WebDriver driver) {
        actions = new Actions(driver);
        waitUtility.waitUntilElementToBeVisible(element, driver);
        actions.moveToElement(element).perform();
    }
}
