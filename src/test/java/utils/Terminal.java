package utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;


public final class Terminal {
    private Terminal() {}

    public static void runCommand(String command) {
        try {
            Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            Log.fail("Command execution failed: " + e.getMessage());
        }
    }
}