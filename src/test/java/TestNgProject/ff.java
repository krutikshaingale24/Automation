package TestNgProject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ff {
    @Test
    public void BAddSareeToCart() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebElement a = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
        Actions s=new Actions(driver);
        s.click(a).keyDown(Keys.SHIFT).sendKeys("saree").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
    }
}
