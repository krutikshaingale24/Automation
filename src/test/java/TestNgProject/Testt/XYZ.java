package TestNgProject.Testt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class XYZ {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));

    }


    @Test
    public void test1() {
        driver.findElement(By.id("datepicker")).click();
        List<WebElement> a = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr/td/a"));
        for ( WebElement date : a) {
            if (date.getText().equals("15")) {
                date.click();
                break;
            }
        }
    }

        @Test
        public void test2() {
            driver.findElement(By.id("datepicker")).click();
            List<WebElement> a = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
            WebElement b = driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']"));
            for (WebElement date : a) {
                if (date.getText().equals(b.getText())) {
                    date.click();
                    break;
                }
            }
//
//            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
//            WebElement d=driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
//            wait.until(ExpectedConditions.visibilityOf(d));
//            d.click();
//            WebElement c= driver.findElement(By.xpath("//td[contains(@class, 'ui-datepicker-days-cell-over') and contains(@class, 'ui-datepicker-today')]"));
//            List<WebElement> a=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//table//tr//td"));
//
//            for (WebElement e: a)
//            {
//                if (e.getText().equals(c.getText()))
//                {
//                    e.click();
//                    break;
//                }
//            }
        }
    @Test
    public void Test3(){
        driver.findElement(By.id("datepicker")).click();
        //Select next month 15date
        driver.findElement(By.xpath("//a[@class=\"ui-datepicker-next ui-corner-all\"]")).click();
        List<WebElement> a = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr/td/a"));
        for (WebElement date : a) {
            if (date.getText().equals("15")) {
                date.click();
                break;
            }
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}