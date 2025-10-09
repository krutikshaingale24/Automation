package Shopping;

import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.reactor.Command;
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

public class Neww {
    WebDriver driver;


    @BeforeTest
    public void login() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
    }

    @Test(priority = 1)
    public void userPass() {
        driver.findElement(By.id("name")).sendKeys("Krutiksha");
        driver.findElement(By.id("email")).sendKeys("krutikshingale24@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Enter Phone']")).sendKeys("124678");
        driver.findElement(By.id("textarea")).sendKeys("XYZ");
    }

    @Test(priority = 2)
    public void scrollAndSelect() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//label[text()='Gender:']")));
        driver.findElement(By.id("female")).click();
        driver.findElement(By.xpath("//input[@id='monday']")).click();
        driver.findElement(By.xpath("//input[@id='tuesday']")).click();
        driver.findElement(By.xpath("//input[@id='friday']")).click();
        driver.findElement(By.xpath("//input[@id='saturday']")).click();
        driver.findElement(By.xpath("//input[@id='sunday']")).click();
        driver.findElement(By.xpath("//input[@id='sunday']")).click();
    }

    @Test(priority = 3)
    public void selectClass() {
        WebElement Country = driver.findElement(By.id("country"));
        Select s = new Select(Country);
        s.selectByValue("india");
        WebElement Colors = driver.findElement(By.id("colors"));
        Select ss = new Select(Colors);
        ss.selectByIndex(6);
        WebElement animals = driver.findElement(By.id("animals"));
        Select ssa = new Select(animals);
        ssa.selectByVisibleText("\n" +
                "        Cheetah\n" +
                "      ");
    }

    @Test(priority = 4)
    public void selectCale() {
        driver.findElement(By.xpath("(//input[@class='hasDatepicker'])[1]")).click();
        List<WebElement> cal = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
        for (WebElement e : cal) {
            if (e.getText().trim().equalsIgnoreCase("15")) {
                e.click();
                break;
            }
        }
        driver.findElement(By.xpath("(//input[@class='hasDatepicker'])[2]")).click();
        List<WebElement> cal2 = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
        for (WebElement e : cal2) {
            if (e.getText().trim().equalsIgnoreCase("13")) {
                e.click();
                break;
            }
        }
    }
//        WebDriverWait wait= new WebDriverWait(driver,java.time.Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='hasDatepicker'])[1]")));
//        driver.findElement(By.xpath("(//input[@class='hasDatepicker'])[1]")).click();
//       WebElement a1 = driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']"));
//       a1.click();

    @Test(priority = 5)
    public void selectCale3() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//label[text()='Date Picker 3: (Select a Date Range)']")));
//        driver.findElement(By.id("start-date")).sendKeys("23121999");
////       WebElement a1 = driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']"));
//        driver.findElement(By.id("end-date")).sendKeys("01022000");
//        driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
        driver.get("https://jqueryui.com/datepicker/");
//        driver.switchTo().frame("81053454c56b8242bc4e88ebacd36d4e");
     driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement d=driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
        wait.until(ExpectedConditions.visibilityOf(d));
        d.click();
        WebElement c= driver.findElement(By.xpath("//td[contains(@class, 'ui-datepicker-days-cell-over') and contains(@class, 'ui-datepicker-today')]"));
        List<WebElement> a=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//table//tr//td"));

        for (WebElement e: a)
        {
            if (e.getText().equals(c.getText()))
            {
                e.click();
                break;
            }
        }
    }

    @Test(priority = 6)
    public void VerifyText() {
        WebElement a = driver.findElement(By.xpath("//div[text()='You selected a range of 40 days.']"));
        if (a.isDisplayed()) {
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case failed");
        }

    }



    @Test(priority = 7)
    public void selectFile() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h2[text()='Upload Files']")));
        driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("C:\\Users\\acer\\Documents\\Abstract.docx");
        driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
        String s= driver.findElement(By.xpath("//p[text()='Single file selected: Abstract.docx, Size: 480010 bytes, Type: application/vnd.openxmlformats-officedocument.wordprocessingml.document']")).getText();
        String s1= "Single file selected: Abstract.docx, Size: 480010 bytes, Type: application/vnd.openxmlformats-officedocument.wordprocessingml.document";
        if (s.equals(s1)) {
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case failed");
        }

    }
    @Test(priority = 8)
    public void dragNDrop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h2[text()='Upload Files']")));
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));
        Actions a= new Actions(driver);
        a.dragAndDrop(drag,drop).perform();
        driver.findElement(By.linkText("Posts (Atom)")).click();
    }


    @Test(priority = 8)
    public void ScrollingDropDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h2[text()='Scrolling DropDown']")));
       driver.findElement(By.id("comboBox")).click();
       List<WebElement>  Dropdown=driver.findElements(By.xpath("//div[@class='option']"));
       for (WebElement e:Dropdown){
           if (e.getText().trim().equalsIgnoreCase("Item 77")){
               e.click();
               break;
           }
       }
    }

    @Test(priority = 9)
    public void movesHover() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h2[text()='Mouse Hover']")));
     WebElement move=driver.findElement(By.xpath("//button[text()='Point Me']"));
        Actions a= new Actions(driver);
        WebElement value=driver.findElement(By.xpath("//a[text()='Laptops']"));
        a.moveToElement(move).click(value).perform();


    }
    @Test(priority = 10)
    public void doubleClick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h2[text()='Mouse Hover']")));
        Actions a= new Actions(driver);
        WebElement copy=driver.findElement(By.xpath("//button[text()='Copy Text']"));
        a.doubleClick(copy).perform();

    }
    @Test(priority = 11)
    public void alert() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h2[text()='Alerts & Popups']")));
        driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();
        driver.switchTo().alert().dismiss();
        driver.findElement(By.id("confirmBtn")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.id("promptBtn")).sendKeys("krutiksha");
        driver.switchTo().alert().accept();

    }
}




