package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;

@Listeners({TestAllureListener.class})
public class ServiceController {

    public <T> T startTest(T page) {
        ThreadLocal<T> tl = new ThreadLocal<>();
        tl.set(page);
        return tl.get();
    }
    @AfterSuite(alwaysRun = true)
    public static void openAllureReport() {
        System.out.println("commanda geldi");
        Terminal.runCommand("cmd /c start allure serve allure-results");
    }
}
