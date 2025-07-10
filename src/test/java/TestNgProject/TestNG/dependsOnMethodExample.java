package TestNgProject.TestNG;

import org.testng.annotations.Test;

public class dependsOnMethodExample {
    @Test(priority = -1)
    public void LogIn()
    {
        System.out.println("Login Successfully");
    }
    @Test
    public void AddProduct()
    {
        System.out.println("Product Added to Cart ");
    }
    @Test(dependsOnMethods ="AddProduct")
    public void PlaceOrder()
    {
        System.out.println("Place Order Successfully");
    }

}
