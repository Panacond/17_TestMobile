package driver;

import capabilitiesFactory.CapabilitiesFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import static java.util.concurrent.TimeUnit.SECONDS;


public class AndroidDriverSingleton {
    private static AndroidDriver<MobileElement> driver;

    private AndroidDriverSingleton() {
    }

    public static AndroidDriver getDriver() {
        if (driver == null) {
            driver = new AndroidDriver<>(CapabilitiesFactory.getAppiumServerURL(), CapabilitiesFactory.getCapabilities());
            driver.manage().timeouts().implicitlyWait(30, SECONDS);
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }
}
