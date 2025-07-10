package TestNgProject.Testt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Flipkart {
    WebDriver driver;
@Test
    public void as() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
//       WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.flipkart.com/");
        Actions a= new Actions(driver);
        WebElement E= driver.findElement(By.xpath("//span[text()='Fashion']"));
        a.moveToElement(E).perform();
        Thread.sleep(5000);
        WebElement f= driver.findElement(By.xpath("//div[@class='_16rZTH']//a[4]"));
    a.moveToElement(f).perform();
    Thread.sleep(5000);
    WebElement g= driver.findElement(By.xpath("//div[@class='_31z7R_']//a[5]"));
   g.click();
//   driver.navigate().back();
//    WebElement V= driver.findElement(By.xpath("//span[text()='Fashion']"));
//    a.moveToElement(V).perform();
//    Thread.sleep(5000);
//    WebElement d= driver.findElement(By.xpath("//a[text()='Women Western']"));
//    a.moveToElement(d).perform();
//    Thread.sleep(5000);
//    WebElement e= driver.findElement(By.xpath("//a[text()='Women Jeans']"));
//    e.click();
//    driver.navigate().back();
//    WebElement Q= driver.findElement(By.xpath("//span[text()='Fashion']"));
//    a.moveToElement(Q).perform();
//    Thread.sleep(5000);
//    WebElement i= driver.findElement(By.xpath("//a[text()='Women Western']/following::a[text()='Women Jeans']"));
//    i.click();

    }
}
