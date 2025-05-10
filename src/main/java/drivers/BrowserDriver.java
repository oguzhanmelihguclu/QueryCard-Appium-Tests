package drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class BrowserDriver {

    private static AndroidDriver driver;

    // Tarayıcı sürücüsünü al
    public static AndroidDriver getBrowserDriver() {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false); // Cihaz sıfırlanmayacak

            // ChromeDriver yolu
            capabilities.setCapability("chromedriverExecutable", "C:\\Users\\Oguz\\Downloads\\apk.QueryCard-master\\QueryCard-MobileTest\\DriversBrowser\\chromedriver.exe");

            try {
                // Appium server URL'si
                URL appiumServerUrl = new URL("http://127.0.0.1:4723");
                driver = new AndroidDriver(appiumServerUrl, capabilities);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Implicit wait
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Appium server bağlantısı yapılamadı: http://127.0.0.1:4723");
            }
        }

        return driver;
    }

    // Tarayıcıyı kapat
    public static void quitDriver() {
        if (driver != null) {
            driver.quit(); // Tarayıcıyı kapat
            driver = null; // Sürücü nesnesi null yapılır
        }
    }
}
