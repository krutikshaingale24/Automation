package TestNgProject.TestNG;

import org.testng.annotations.Test;

public class TestAnnotationAttribute {
    @Test(invocationCount = 3)
    public void CaseB()
    {
        System.out.println("Case B");
    }
    @Test(invocationCount = 2, invocationTimeOut = 5)
    public void CaseA()
    {
        System.out.println("Case A");
    }
    @Test (priority =-4)
    public void CaseC()
    {
        System.out.println("Case C");
    }
}

