package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.waitUtility;

import java.util.List;

public class WebElementUtility {

    public static void iterateListOfElement(List<WebElement> elements, WebDriver driver, String value){

            for (WebElement e : elements) {
                if (e.getText().equalsIgnoreCase(value)) {
                    waitUtility.waitUntilElementToBeClickable(e, driver);
                    e.click();
                    break;
                }
            }

        }
    }
