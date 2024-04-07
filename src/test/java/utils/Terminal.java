package utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public final class Terminal {
    private Terminal() {}

    public static void runCommand(String command) {
        try {
            Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            Log.fail("Command execution failed: " + e.getMessage());
        }
    }

    @BeforeSuite
    public static void removeAllureHistory() {
        boolean isDeleteHistoryEnabled = AllurePropertiesUtils.isDeleteHistoryEnabled();
        System.out.println("deleteHistory is enabled: " + isDeleteHistoryEnabled);

        if (isDeleteHistoryEnabled) {
            System.out.println("Removing Allure history...");
            Terminal.runCommand("cmd /c start allure generate --clean --output allure-results");
        }
    }

    @AfterClass(alwaysRun = true)
    public static void openAllureReport() {
        Terminal.runCommand("cmd /c start allure serve allure-results");
    }
}