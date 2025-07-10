package TestNgProject.Testt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Project1 {
    WebDriver driver;

    @BeforeClass
    public void Element() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/elements");
    }
//
//    @DataProvider(name = "Test-Data")
//    public Object[][] dataFun() {
//        return new Object[][]{
//                {"standard_user", "user@gmail.com", "ABC", "XYZ"},
//        };
//    }
//
//@Test (dataProvider = "Test-Data")
//  public void ATextBox(String username, String userEmail, String currentAddress, String permanentAddress) {
//
////    WebDriverManager.chromedriver().setup();
////    WebDriver driver = new ChromeDriver();
////    driver.manage().window().maximize();
////    driver.get("https://demoqa.com/elements");
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//    JavascriptExecutor js=(JavascriptExecutor)driver;
//
////    / /       driver.findElement(By.xpath("//div[text()='Elements']")).click();
//driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//WebElement a= driver.findElement(By.xpath("//span[text()='Buttons']"));
//    js.executeScript("arguments[0].scrollIntoView();",a);
//        driver.findElement(By.id("userName")).sendKeys(username);
//        driver.findElement(By.id("userEmail")).sendKeys(userEmail);
//        driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
//        driver.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);
//        driver.findElement(By.id("submit")).click();
//
//    }
//    @Test
//    public void BCheckBox() {
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//   driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//        WebElement a= driver.findElement(By.xpath("//span[text()='Buttons']"));
//        js.executeScript("arguments[0].scrollIntoView();",a);
//        driver.findElement(By.xpath("//button[@title='Toggle']")).click();
//        driver.findElement(By.xpath("(//button[@title='Toggle'])[3]")).click();
//        driver.findElement(By.xpath("(//li[@class='rct-node rct-node-parent rct-node-collapsed'])[2]")).click();
//        driver.findElement(By.xpath("(//button[@title='Toggle'])[5]")).click();
//      driver.findElement(By.xpath("//span[text()='Public']")).click();
//        driver.findElement(By.xpath("//span[text()='Classified']")).click();
//    }
//    @Test
//    public void CRadioButton() {
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//   driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
//        WebElement a= driver.findElement(By.xpath("//span[text()='Buttons']"));
//        js.executeScript("arguments[0].scrollIntoView();",a);
//        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
//        driver.findElement(By.xpath("(//button[@title='Toggle'])[3]")).click();
//        driver.findElement(By.xpath("(//li[@class='rct-node rct-node-parent rct-node-collapsed'])[2]")).click();
//        driver.findElement(By.xpath("(//button[@title='Toggle'])[5]")).click();
//      driver.findElement(By.xpath("//span[text()='Public']")).click();
//        driver.findElement(By.xpath("//span[text()='Classified']")).click();
//    }
//    @Test
//    public void DWebTables() {
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//   driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
//        WebElement a= driver.findElement(By.xpath("//span[text()='Buttons']"));
//        js.executeScript("arguments[0].scrollIntoView();",a);
//        driver.findElement(By.id("edit-record-2")).click();
//        WebElement b=driver.findElement(By.id("firstName"));
//        b.clear();
//                b.sendKeys("Test");
//        WebElement c=driver.findElement(By.id("lastName"));
//       c.clear();
//        c.sendKeys("Demo");
//        WebElement d=driver.findElement(By.id("age"));
//        d.clear();
//        d.sendKeys("20");
//        driver.findElement(By.id("submit")).click();
//        driver.findElement(By.id("delete-record-2")).click();
//    }
//@Test
//public void EButtons() {
//    JavascriptExecutor js=(JavascriptExecutor)driver;
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//    driver.findElement(By.xpath("//span[text()='Buttons']")).click();
//    WebElement b= driver.findElement(By.xpath("//span[text()='Buttons']"));
//    js.executeScript("arguments[0].scrollIntoView();",b);
//    Actions a=new Actions(driver);
//    WebElement c=driver.findElement(By.id("doubleClickBtn"));
//a.doubleClick(c).perform();
//    WebElement d=driver.findElement(By.id("rightClickBtn"));
//    a.contextClick(d).perform();
//}
//    @Test
//    public void FButtons() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.findElement(By.xpath("//span[text()='Links']")).click();
//        WebElement b = driver.findElement(By.xpath("//span[text()='Buttons']"));
//        js.executeScript("arguments[0].scrollIntoView();", b);
//        driver.findElement(By.linkText("Home")).click();
//        String originalWindowHandle = driver.getWindowHandle();
//        Set<String> AllWindowHandles = driver.getWindowHandles();
//        for (String windowHandle : AllWindowHandles) {
//            if (!windowHandle.equals(originalWindowHandle)) {
//                driver.switchTo().window(windowHandle);
//                System.out.println(driver.getTitle());
//                break;
//            }
//        }
//        driver.close();
//        driver.switchTo().window(originalWindowHandle);
//        System.out.println(driver.getTitle());
//    }
//    @Test
//    public void GFileUpload() {
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        WebElement c= driver.findElement(By.xpath("//span[text()='Upload and Download']"));
//        js.executeScript("arguments[0].scrollIntoView();",c);
//   driver.findElement(By.xpath("//span[text()='Upload and Download']")).click();
//        WebElement a= driver.findElement(By.xpath("//span[text()='Buttons']"));
//        js.executeScript("arguments[0].scrollIntoView();",a);
//        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\acer\\Downloads\\sampleFile.jpeg");
//        WebElement b= driver.findElement(By.xpath("//p[text()='C:\\fakepath\\sampleFile.jpeg']"));
//        if(b.isDisplayed()) {
//            System.out.println("File upload successfully");
//        }else {
//            System.out.println("File upload failed");
//        }driver.close();
//    }
//@Test
//public void HPracticeForm() throws InterruptedException {
//    JavascriptExecutor js=(JavascriptExecutor)driver;
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//   driver.findElement(By.xpath("//div[text()='Elements']")).click();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Forms']")));
//    element.click();
//    driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
//    WebElement a= driver.findElement(By.xpath("//div[text()='Widgets']"));
//    js.executeScript("arguments[0].scrollIntoView();",a);
////    driver.findElement(By.id("dateOfBirthInput")).click();
////    List<WebElement> b= driver.findElements(By.xpath("//div[@class='react-datepicker__month-container']//div/div/div"));
////            for(WebElement date:b) {
////                if (date.getText().equals("23")){
////        date.click();
////        break;
////    }
////    }
//    driver.findElement(By.id("dateOfBirthInput")).click();
//    List<WebElement> c= driver.findElements(By.xpath("//div[@class='react-datepicker__month-container']//div/div/div"));
//    WebElement d=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--003 react-datepicker__day--selected react-datepicker__day--today']"));
//    for(WebElement date:c) {
//        if (date.getText().equals(d.getText())){
//            date.click();
//            break;
//        }
//    }
//
//    WebElement f=driver.findElement(By.id("uploadPicture"));
//    f.sendKeys("C:\\Users\\acer\\Downloads\\sampleFile.jpeg");

    /// /    WebElement f= driver.findElement(By.xpath("//p[text()='C:\\fakepath\\sampleFile.jpeg']"));
//    if(f.isDisplayed()) {
//        System.out.println("File upload successfully");
//    }else {
//        System.out.println("File upload failed");
//    }
//}
//    @Test
//    public void IPracticeForm() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.findElement(By.xpath("//div[text()='Elements']")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Alerts, Frame & Windows']")));
//    element.click();
//        driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
//        WebElement c = driver.findElement(By.xpath("//div[text()='Widgets']"));
//        js.executeScript("arguments[0].scrollIntoView();", c);
//        driver.findElement(By.id("tabButton")).click();
//        String a = driver.getWindowHandle();
//        Set<String> b = driver.getWindowHandles();

    /// /        for (String s : b) {
    /// /            if (!s.equals(a)) {
    /// /                driver.switchTo().window(s);
    /// /                System.out.println(driver.getCurrentUrl());
    /// /                driver.close();
    /// /                break;
    /// /            }
    /// /        }
    /// /        driver.switchTo().window(a);
    /// /        System.out.println(driver.getCurrentUrl());
//        driver.findElement(By.id("windowButton")).click();
//
//        for (String q : b) {
//            if (!q.equals(a)) {
//                driver.switchTo().window(q);
//                System.out.println(driver.getCurrentUrl());
//                driver.close();
//                break;
//            }
//        }
//        driver.switchTo().window(a);
//        System.out.println(driver.getCurrentUrl());
//    }
    /*@Test
    public void JAlerts() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//div[text()='Elements']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Alerts, Frame & Windows']")));
        element.click();
        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
        WebElement c = driver.findElement(By.xpath("//div[text()='Widgets']"));
        js.executeScript("arguments[0].scrollIntoView();", c);
        driver.findElement(By.id("alertButton")).click();
        Alert z=driver.switchTo().alert();
        z.accept();
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(6000);
        z.accept();
        driver.findElement(By.id("confirmButton")).click();
        z.dismiss();
        driver.findElement(By.id("promtButton")).click();
        z.sendKeys("Krutiksha");
        String s=driver.switchTo().alert().getText();
        z.sendKeys("Krutiksha");
        z.accept();
        }*/
    @Test
    public void Frame() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//div[text()='Elements']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Widgets']")));
        element.click();
        driver.findElement(By.xpath("//span[text()='Auto Complete']")).click();
        WebElement c = driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
        js.executeScript("arguments[0].scrollIntoView();", c);

        WebElement D = driver.findElement( By.xpath("//div[@id='autoCompleteMultipleContainer']//div/input"));
        D.sendKeys("Gr");
//  List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='autoCompleteMultipleContainer']//div/input")));
//        for (WebElement e : list) {
//            if (e.getText().equalsIgnoreCase("Red")) {
//                    e.click();
//                    break;
//                }
//            }
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.xpath("//div[contains(@class,'auto-complete__option') and text()='Green']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[contains(@class,'auto-complete__option')][0]"))).click();
    }
}
