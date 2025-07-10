package TestNgProject.Testt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class RefactoredShoppingExampale {
    WebDriver driver;

    @BeforeClass
    public void Shopping(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
//       WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void Alogin(){
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
        driver.findElement(By.name("email")).sendKeys("test338@gmail.com");
        driver.findElement(By.name("password")).sendKeys("test123");
        driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
    }

    @Test
    public void BAddSareeToCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement z = driver.findElement(By.xpath("//div[@class='features_items']"));
        js.executeScript("arguments[0].scrollIntoView();", z);
        driver.findElement(By.xpath("(//span[@class='badge pull-right'])[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Saree')]")).click();
        WebElement x = driver.findElement(By.xpath("//a[text()='Kookie Kids']"));
        js.executeScript("arguments[0].scrollIntoView();", x);
        driver.findElement(By.cssSelector("a[href*='/product_details/40']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
        driver.findElement(By.cssSelector("button[class='btn btn-success close-modal btn-block']")).click();
        driver.navigate().back();
    }
    @Test
    public void CAddMadmeProduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement x = driver.findElement(By.xpath("//a[text()='Kookie Kids']"));
        js.executeScript("arguments[0].scrollIntoView();", x);
        driver.findElement(By.cssSelector("a[href*='/product_details/40']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
        driver.findElement(By.cssSelector("button[class='btn btn-success close-modal btn-block']")).click();
        driver.navigate().back();
        WebElement y = driver.findElement(By.xpath("//a[@href='/brand_products/Madame' and text()='Madame']"));
        js.executeScript("arguments[0].scrollIntoView();", y);
        WebElement a = driver.findElement(By.xpath("//a[@href='/brand_products/Madame' and text()='Madame']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(a).click().perform();
        driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart' and @data-product-id='3' and text()='Add to cart']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block' and text()='Continue Shopping']")).click();
    }
    @Test
    public void DAddAnotherProduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement x = driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart' and @data-product-id='4' and text()='Add to cart']"));
        driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart' and @data-product-id='4' and text()='Add to cart']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block' and text()='Continue Shopping']")).click();
//      driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
//        driver.navigate().back();
    }
    @Test
    public void EAddKidsDress(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement p = driver.findElement(By.xpath("//a[@href='#Kids']"));
                js.executeScript("arguments[0].scrollIntoView();", p);
        driver.findElement(By.xpath("//a[@href='#Kids']")).click();

        driver.findElement(By.xpath("//a[@href='/category_products/5' and contains(text(),'Tops & Shirts')]")).click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='title text-cendriver.findElement(By.xpath("//a[@href='/product_details/41' and text()='View Product']")).click();
//
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Beautiful Peacock Blue ']")));
//        driver.findElement(By.xpath("//input[@type='number' and @name='quantity' and @id='quantity']")).clear();
//        driver.findElement(By.xpath("//input[@type='number' and @name='quantity' and @id='quantity']")).sendKeys("6");
//        driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();ter' and contains(text(),'Kids - Tops & ')]")));

        driver.findElement(By.xpath("//a[@data-product-id='15' and @class='btn btn-default add-to-cart']")).click();

        driver.findElement(By.xpath("//a[@data-product-id='24' and @class='btn btn-default add-to-cart']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'close-modal') and text()='Continue Shopping']"))).click();

    }
    @Test
    public void FCheckout(){
        driver.findElement(By.xpath("//a[text()=' Cart']")).click();
        driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();

        driver.findElement(By.xpath("//a[text()='Place Order']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Payment']")));
        driver.findElement(By.name("name_on_card")).sendKeys("test");
        driver.findElement(By.name("card_number")).sendKeys("123");
        driver.findElement(By.name("cvc")).sendKeys("0");
        driver.findElement(By.name("expiry_month")).sendKeys("11");
        driver.findElement(By.name("expiry_year")).sendKeys("2025");
        driver.findElement(By.id("submit")).click();
    }
    @Test
    public void GProceedToCheckout(){
        String Message = driver.findElement(By.xpath("//p[text()='Congratulations! Your order has been confirmed!' and @style='font-size: 20px; font-family: garamond;']")).getText();
        String Messages = "Congratulations! Your order has been confirmed!";
        if (Message.equals(Messages)) {
            System.out.println("Order is placed");
        } else {
            System.out.println("Order failed");

        }
        driver.findElement(By.xpath("//a[@href='/download_invoice/41500' or text()='Download Invoice']")).click();
        driver.findElement(By.xpath("//a[text()='Continue']")).click();
    }
    @AfterClass
    public void LogOut(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//a[text()=' Logout' and @href='/logout']")).click();
        WebElement q = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
//        String s = "Login to your account";
        if (q.isDisplayed()) {
            System.out.println("Logout successfully");
        } else {
            System.out.println("Logout failed");

        }

        driver.quit();
    }
}
