package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Terminal.removeAllureHistory();
        Terminal.openAllureReport();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Terminal.removeAllureHistory();
        Terminal.openAllureReport();
    }
    @AfterSuite(alwaysRun = true)
    public void openAllureReport() {
        Terminal.removeAllureHistory();
        Terminal.openAllureReport();
    }
}

