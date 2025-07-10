package TestNgProject.Parameterizations;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class ExampleOfDataProviderUsingExcelFile {

    @DataProvider(name = "excel-Data")
    public Object[][] dataFun() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\acer\\Documents\\TestNGExample.xlsx", "Sheet1");
        return arrObj;
    }
//    public Object[][] getExcelData(String FilePath, String SheetName) throws IOException {
//        FileInputStream file = new FileInputStream(FilePath);
//        XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(file);
//        XSSFSheet sheet = workbook.getSheet(SheetName);
//        int rowCount = sheet.getPhysicalNumberOfRows();
//        int columnCount = sheet.getRow(0).getLastCellNum();
//        Object[][] data = new Object[rowCount][columnCount];
//        for (int i = 1; i <= rowCount; i++) {
//            XSSFRow row = sheet.getRow(i);
//            for (int j = 0; j < columnCount; j++) {
//                XSSFCell cell = row.getCell(j);
//                data[i - 1][j] = cell.toString();
//            }
//        }
//        return data;
//    }
public Object[][] getExcelData(String filePath, String sheetName) throws IOException {
    FileInputStream fp = new FileInputStream(filePath);    //to access file
    Workbook wb = WorkbookFactory.create(fp);          //which type of file access ie Excel file
    Sheet sh = wb.getSheet(sheetName);              //to access sheetName
    // if (sh == null) {
    //     throw new IllegalArgumentException("Sheet " + sheetName + " not found in " + filePath);
    //  }

    // to get rows and columns
    int rows = sh.getPhysicalNumberOfRows();
    int columns = sh.getRow(0).getLastCellNum();

    Object[][] data = new Object[rows - 1][columns];

    for(int i=1; i<rows; i++){                   //nested for loop
        Row r = sh.getRow(i);
        for(int j=0; j<columns; j++){
            Cell cell =r.getCell(j);
            data[i-1][j]=cell.toString();
        }
    }
    return data;

}


    @Test(dataProvider = "excel-Data")
    public void LogIn(String username, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        driver.close();
    }
}
