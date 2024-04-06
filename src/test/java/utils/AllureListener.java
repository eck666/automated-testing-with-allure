package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test başarıyla tamamlandı, Allure raporu açılıyor...");
        Terminal.runCommand("cmd /c start allure serve target/allure-report");
    }

    // Diğer ITestListener metodları buraya eklenir
}