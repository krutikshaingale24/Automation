package TestNgProject.TestNG;

import org.testng.annotations.Test;

public class DependsOnGroupsExample
{
    @Test(dependsOnGroups ="Smoke")
    public void LogIn()
    {
        System.out.println("Login Successfully");
    }
    @Test(groups = {"Smoke"})
    public void AddProduct()
    {
        System.out.println("Product Added to Cart ");
    }
    @Test(dependsOnGroups ="Smoke")
    public void PlaceOrder()
    {
        System.out.println("Place Order Successfully");
    }

}

