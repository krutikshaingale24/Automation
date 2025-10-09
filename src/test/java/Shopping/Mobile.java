package Shopping;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import java.time.Duration;
import java.util.List;

public class Mobile {
    @Test
    public void user() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement d = driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
        wait.until(ExpectedConditions.visibilityOf(d));
        d.click();
        WebElement c = driver.findElement(By.xpath("//td[contains(@class, 'ui-datepicker-days-cell-over') and contains(@class, 'ui-datepicker-today')]"));
        List<WebElement> a = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//table//tr//td"));

        for (WebElement e : a) {
            if (e.getText().equals(c.getText())) {
                e.click();
                break;
            }
        }
    }
}

