package TestNgProject.TestNG;

import org.testng.annotations.Test;

public class EnabledExample {
    @Test(enabled = false)
    public void SignUp() {
        System.out.println("SignUp Successfully");
    }

    @Test
    public void LogIn() {
        System.out.println("Login Successfully");
    }
}
