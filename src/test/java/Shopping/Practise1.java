package Shopping;

import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.reactor.Command;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
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
public class Practise1 {

    WebDriver driver;

    @BeforeTest
    public void before() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/");
    }

    @Test
    public void A() {
        driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.cssSelector("button#start")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//        WebElement s1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Liftoff!']")));
        WebElement s1 = driver.findElement(By.xpath("//div[text()='Liftoff!']"));
        if (s1.isDisplayed()) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    @Test
    public void B() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.navigate().back();
        driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[8]")).click();
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//label[text()='What is your favorite color?']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[2]"))).click();
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//label[text()='Automation tools']")));
        WebElement text_to_copy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Katalon Studio']")));
        String s3 = text_to_copy.getText();
        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(s3);
    }

    @Test
    public void C() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[14]")).click();
        driver.findElement(By.id("alert")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirm")).click();
        driver.switchTo().alert().dismiss();
        WebElement s1 = driver.findElement(By.xpath("//p[text()='Cancel it is!']"));
        System.out.println(s1.isDisplayed());
        driver.findElement(By.id("prompt")).click();
        driver.switchTo().alert().sendKeys("k");
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//div[@class='tooltip_1']")).click();
        WebElement s2 = driver.findElement(By.id("myTooltip"));
        s2.isDisplayed();
    }

    @Test
    public void D() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement c = driver.findElement(By.xpath("//a[text()='JavaScript Delays']"));
        js.executeScript("arguments[0].scrollIntoView();", c);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@class='wp-block-button__link wp-element-button'])[9]")))).click();
        driver.findElement(By.name("g1065-1-selectorenteradate")).click();
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='dp-days']//button"));
        WebElement s2 = driver.findElement(By.xpath("//button[@class='dp-day dp-current dp-selected dp-focusable dp-day-today ']"));
        for (WebElement e : list) {
            if (e.getText().equals(s2.getText())) {
                e.click();
                break;
            }
        }
        WebElement s= driver.findElement(By.xpath("//input[@class='date jp-contact-form-date grunion-field has-value']"));
   System.out.print(s.getText());
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        WebElement z = driver.findElement(By.xpath("//div[@class='field-value']"));
        if(s.getText().equals(z.getText()))
        {
            System.out.println("PASS");
        }
    }
    @Test
    public void E() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 700);");
        Thread.sleep(5000);
        WebElement c = driver.findElement(By.xpath("//a[text()='Hover']"));
        wait.until(ExpectedConditions.visibilityOf(c)).click();
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.id("mouse_over"))).perform();

    }
    @Test
    public void FE() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        Actions a = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");
        Thread.sleep(5000);
        WebElement c = driver.findElement(By.xpath("//a[text()='Gestures']"));
        c.click();
                WebElement d = driver.findElement(By.id("dragMe"));
                WebElement b =driver.findElement(By.id("div2"));
                a.dragAndDrop(d,b).perform();

    }
    @Test
    public void G() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        Actions a = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='File Download']")).click();
        String pass = driver.findElement(By.xpath("//strong[text()='“automateNow”']")).getText();
        System.out.println(pass);
        driver.findElement(By.xpath("(//a[text()='Download'])[2]")).click();
////      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("enter_pass_label_921"))));
        WebElement p0 = driver.findElement(By.xpath("//input[@type='password']"));
        p0.sendKeys("automateNow");
      driver.findElement(By.id("wpdm_submit_68e28b2c3689a_921")).click();
    }
}

