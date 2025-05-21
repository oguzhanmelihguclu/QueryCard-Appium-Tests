package drivers;

import config.ConfigReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {

    private Driver() {
    }

    private static UiAutomator2Options options;
    private static AppiumDriver driver;

    public static AppiumDriver getAppiumDriver() {

        // Session geçersizse kapat ve temizle
        if (driver == null || driver.getSessionId() == null) {

            if (driver != null) {
                driver.quit();
                driver = null;
            }

            switch (ConfigReader.getProperty("platformName")) {
                case "Android":
                    options = new UiAutomator2Options();
                    options.setPlatformName("Android").setAutomationName("UiAutomator2");
                    options.setApp("C:\\Users\\Oguz\\Downloads\\apk.QueryCard-master\\QueryCard-MobileTest\\Apps\\querycart2006.apk");
                    options.setAppPackage("com.wise.querycart");
                    options.setAppActivity("com.wise.querycart.MainActivity");
                    options.setUdid("emulator-5554");
                    options.setNoReset(false);
                    options.autoGrantPermissions();
                    options.setNewCommandTimeout(Duration.ofMinutes(15));

                    try {
                        driver = new AndroidDriver(
                                new URL("http://0.0.0.0:4723"), options
                        );
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case "IOS":
                    // iOS için Appium ayarları buraya
                    break;

                default:
                    throw new RuntimeException("Desteklenmeyen Platform");
            }
        }

        return driver;
    }

    public static void quitAppiumDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;

            // Çok kısa bir bekleme iyi olabilir bazı emülatörlerde
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
