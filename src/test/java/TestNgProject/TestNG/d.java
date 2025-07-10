package TestNgProject.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class d {
    WebDriver driver;


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
        List<WebElement> b=driver.findElements(By.xpath("//div[@class='  css-2613qy-menu']"));
        for(WebElement e:b)
        {
            if(b.equals("Group 1, option 1"))
            {
                e.click();
                break;
            }
        }
    }
}

