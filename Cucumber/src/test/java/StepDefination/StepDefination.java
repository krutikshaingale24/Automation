package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class StepDefination {
    WebDriver driver;
    @Given("Open saucedemo application")
    public void open_saucedemo_application() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("Enter valid crdentails")
    public void enter_valid_crdentails() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @Then("Verify Swag Lab text on saucedemo login page")
    public void verify_swag_lab_text_on_saucedemo_login_page() {
        WebElement text = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        Assert.assertTrue(text.isDisplayed());
    }
}
