package TestNgProject.Testt;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class ShoppingProjectExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.automationexercise.com/");
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
        driver.findElement(By.name("email")).sendKeys("test338@gmail.com");
        driver.findElement(By.name("password")).sendKeys("test123");
        driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("i[class='fa fa-trash-o']")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement z = driver.findElement(By.xpath("//div[@class='features_items']"));
        js.executeScript("arguments[0].scrollIntoView();", z);

        driver.findElement(By.xpath("(//span[@class='badge pull-right'])[1]")).click();

        driver.findElement(By.xpath("//a[contains(text(), 'Saree')]")).click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='productinfo text-center']")));
        WebElement x = driver.findElement(By.xpath("//a[text()='Kookie Kids']"));
        js.executeScript("arguments[0].scrollIntoView();", x);
        driver.findElement(By.cssSelector("a[href*='/product_details/40']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.view-product")));
        driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-success close-modal btn-block']")));
        driver.findElement(By.cssSelector("button[class='btn btn-success close-modal btn-block']")).click();
        driver.navigate().back();
        WebElement y = driver.findElement(By.xpath("//a[@href='/brand_products/Madame' and text()='Madame']"));
        js.executeScript("arguments[0].scrollIntoView();", y);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Brands']")));
        WebElement a = driver.findElement(By.xpath("//a[@href='/brand_products/Madame' and text()='Madame']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(a).click().perform();

        driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart' and @data-product-id='3' and text()='Add to cart']")).click();

//       driver.findElement(By.xpath("//u[text()='View Cart']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block' and text()='Continue Shopping']")).click();

// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-success close-modal btn-block']")));
        driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart' and @data-product-id='4' and text()='Add to cart']")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block' and text()='Continue Shopping']")).click();


        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
        driver.navigate().back();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='title text-center' and text()='Brand - Madame Products']")));

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Category']")));
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

        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block' and text()='Continue Shopping']")).click();

//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");


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
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Order Placed!']")));
        String Message = driver.findElement(By.xpath("//p[text()='Congratulations! Your order has been confirmed!' and @style='font-size: 20px; font-family: garamond;']")).getText();
        String Messages = "Congratulations! Your order has been confirmed!";
        if (Message.equals(Messages)) {
            System.out.println("Order is placed");
        } else {
            System.out.println("Order failed");

        }
        driver.findElement(By.xpath("//a[@href='/download_invoice/41500' or text()='Download Invoice']")).click();
        driver.findElement(By.xpath("//a[text()='Continue']")).click();

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
