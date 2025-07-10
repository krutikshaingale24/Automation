package TestNgProject.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCaseExample {
    @Test
    public void Test1()
    {
        System.out.println("Test 1");
    }
    @Test
    public void Test2()
    {
        Assert.assertTrue(false);
        System.out.println("Test 2");
    }
    @Test
    public void Test3()
    {
        System.out.println("Test 3");
    }
}
