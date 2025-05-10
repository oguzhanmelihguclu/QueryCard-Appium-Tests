package drivers;

import config.ConfigReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {

    private Driver() {}

    private static UiAutomator2Options options;
    private static AndroidDriver driver;

    // Mobil uygulama için AppiumDriver al
    public static AndroidDriver getAppiumDriver() {
        if (driver == null) {
            options = new UiAutomator2Options();
            options.setPlatformName("Android").setAutomationName("UiAutomator2");
            options.setApp("C:\\Users\\Oguz\\Downloads\\apk.QueryCard-master\\QueryCard-MobileTest\\Apps\\querycart2006.apk");
            options.setAppPackage("com.wise.querycart");
            options.setAppActivity("com.wise.querycart.MainActivity");
            options.setUdid("emulator-5554");
            options.setNoReset(false); // Uygulama sıfırlanmayacak
            options.autoGrantPermissions(); // Uygulama izinlerini otomatik olarak verecek
            options.setNewCommandTimeout(Duration.ofMinutes(15));

            try {
                // Appium server URL'si
                driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), options);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return driver;
    }

    // Uygulama sürücüsünü kapat
    public static void quitAppiumDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
