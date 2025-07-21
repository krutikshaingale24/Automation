package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitUtility {
    public static int PAGE_INT_TIMEOUT =50;
    public static int EXPLICIT_WAIT=70;
    public static WebDriverWait wait;
    public static void waitUntilElementToBeClickable (WebElement element, WebDriver driver){
        wait =new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public static void waitUntilElementToBeVisible (WebElement element, WebDriver driver){
        wait =new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitUntilElementToBeVisibleToBeClick (WebElement element, WebDriver driver){
        wait =new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

}
