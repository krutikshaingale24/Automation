package TestNgProject.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class DatePickerExample2 {
    @Test
    public void Test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
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
        driver.close();
    }


}
