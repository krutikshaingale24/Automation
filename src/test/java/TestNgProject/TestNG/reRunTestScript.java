package TestNgProject.TestNG;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class reRunTestScript implements IRetryAnalyzer {
    private int retryCount = 0;
    private int maxRetryCount = 4;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }


}
