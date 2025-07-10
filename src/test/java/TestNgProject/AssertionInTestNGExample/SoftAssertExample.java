

package TestNgProject.AssertionInTestNGExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
public class SoftAssertExample {
    WebDriver driver;
    @Test
    public void Shopping(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement a= driver.findElement(By.xpath("//a[@class='_1TOQfO']"));
        WebElement b= driver.findElement(By.name("qaa"));
        WebElement c= driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(a.getText(), "Login");
        softAssert.assertTrue(b.isDisplayed());
        softAssert.assertTrue(c.isDisplayed());
        System.out.println("Hello All");
     softAssert.assertAll();
        driver.close();
    }
}

