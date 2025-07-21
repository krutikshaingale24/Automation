package testBase;

import constant.BrowserType;
import org.openqa.selenium.WebDriver;
import config.PropertyReader;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static utils.waitUtility.PAGE_INT_TIMEOUT;

public class WebTestBase {
    public static WebDriver driver;

    public  void initialization(){

        String browserName= PropertyReader.getProperty("browser");
        if (browserName.equalsIgnoreCase(BrowserType.CHROME.toString())) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase(BrowserType.FIREFOX.toString()))  {
           System.setProperty("webdriver.gecko.driver", "C:\\path\\to\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase(BrowserType.EDGE.toString()))  {
           System.setProperty("webdriver.edge.driver", "C:\\path\\to\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.get(PropertyReader.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_INT_TIMEOUT));
    }
}
