package utils;


import org.testng.annotations.AfterSuite;

public final class Terminal {
    private Terminal() {}
    public static void runCommand(String command) {
        try {
            Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            Log.fail("sadf");
        }
    }
    @AfterSuite(alwaysRun = true)
    public void openAllureReport() {Terminal.runCommand("cmd /c start allure serve target/allure-report");}
}