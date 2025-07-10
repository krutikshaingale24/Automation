
package TestNgProject.Testt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
public class Dropdown {
    WebDriver driver;

@Test
    public void as(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
//       WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://demoqa.com/select-menu");
        WebElement a=driver.findElement(By.xpath("//div[text()='Select Option']"));
        a.click();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement z = driver.findElement(By.xpath("//div[text()='Select One']"));

    js.executeScript("arguments[0].scrollIntoView();", z);
        List<WebElement> optionsList=driver.findElements(By.xpath("//div[@class='  css-2613qy-menu']"));

            for(WebElement option : optionsList) {
                if(option.getText().equals("Group 1, option 1")) {
                    option.click();
                    break;
                }
        }
    }
}
