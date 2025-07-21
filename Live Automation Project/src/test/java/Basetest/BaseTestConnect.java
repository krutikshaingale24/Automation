package Basetest;

import Pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import testBase.WebTestBase;

public class BaseTestConnect extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;
    public LiquidCoffeePage liquidCoffeePage;
public CreateAccountPage createAccountPage;
public ShopPage shopPage;
public MyProfilePage myProfilePage;
public ForgotPasswordPage forgotPasswordPage;
public Campos2025 campos2025;
public NewArrivalPage newArrivalPage;
public EcuadorElizaBourbonSidraPage ecuadorElizaBourbonSidraPage;
public RwandaTwumbaPage rwandaTwumbaPage;
public NewArrivalFiltersPage newArrivalFiltersPage;
public FavouritesPage favouritesPage;
public CartPage cartPage;
public  CapsulesPage capsulesPage;
    @BeforeMethod
    public void preRequisite() {
        initialization();
        liquidCoffeePage=new LiquidCoffeePage(driver);
            capsulesPage =new CapsulesPage(driver);
        cartPage =new CartPage(driver);
        favouritesPage=new FavouritesPage(driver);
        newArrivalFiltersPage = new NewArrivalFiltersPage(driver);
        rwandaTwumbaPage=new RwandaTwumbaPage(driver);
        homePage = new HomePage(driver);
        newArrivalPage=new NewArrivalPage(driver);
        createAccountPage= new CreateAccountPage(driver);
        loginPage = new LoginPage(driver);
        myProfilePage = new MyProfilePage(driver);
        shopPage = new ShopPage(driver);
        forgotPasswordPage=new ForgotPasswordPage(driver);
        campos2025= new Campos2025(driver);
        ecuadorElizaBourbonSidraPage=new EcuadorElizaBourbonSidraPage(driver);
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}


