package TestNgProject.TestNG;

import org.testng.annotations.Test;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.c;

public class PriorityExample {
    @Test(priority =6)
    public void CaseB()
    {
        System.out.println("Case B");
    }
    @Test(priority ='T')
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
