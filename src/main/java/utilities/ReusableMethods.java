package utilities;

import config.ConfigReader;
import drivers.Driver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import pagesApp.LoginPage;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;

import static drivers.Driver.getAppiumDriver;
import static java.time.Duration.ofMillis;
import static java.util.Collections.singletonList;
import static org.openqa.selenium.By.xpath;



public class ReusableMethods {

   private static DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
   static LoginPage loginPage =new LoginPage();



    public static void apkYukle(){

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,ConfigReader.getProperty("version"));
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,ConfigReader.getProperty("appPackage"));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,ConfigReader.getProperty("appActivity"));
    }


    public static void elementClick(WebElement elementName){

        var el1 = getAppiumDriver().findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\""+elementName+"\").instance(0)"));

        el1.click();

    }

    public static void koordinatTiklama(int xKoordinat, int yKoordinat, int bekleme, WebElement slider) throws InterruptedException {

        Point source = slider.getLocation();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1);
        sequence.addAction(finger.createPointerMove(ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        sequence.addAction(new Pause(finger, ofMillis(600)));
        sequence.addAction(finger.createPointerMove(ofMillis(600),
                PointerInput.Origin.viewport(), source.x + 400, source.y));
        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));

        getAppiumDriver().perform(singletonList(sequence));
           }



  //  static AndroidDriver<AndroidElement> driver=Driver.getAppiumDriver();
    public static void koordinatTiklamaMethodu(int x,int y) throws InterruptedException {

        TouchAction action=new TouchAction((PerformsTouchActions) getAppiumDriver());
        action.press(PointOption.point(x,y)).release().perform();
        Thread.sleep(1000);
    }

    public static void scrollWithUiScrollableAndClick(String elementText) {
        AndroidDriver driver = (AndroidDriver)  Driver.getAppiumDriver();
      //  driver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElement(By.xpath("//*[@text='" + elementText + "']")).click();

    }
    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver)  getAppiumDriver();
     //   driver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))"));

    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot)Driver.getAppiumDriver();

        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }



    public static void ekranKaydirmaMethodu(int xPress,int yPress,int wait,int xMove,int yMove){
        TouchAction action=new TouchAction<>((PerformsTouchActions) getAppiumDriver());
        action.press(PointOption.point(xPress,yPress))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait)))
                .moveTo(PointOption.point(xMove,yMove))
                .release()
                .perform();
    }


    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void screenShotElement(String text) throws IOException {
        WebElement element = Driver.getAppiumDriver().findElement(xpath("//*[@text='"+text+"']"));
        org.openqa.selenium.Point location = element.getLocation();
        org.openqa.selenium.Dimension size = element.getSize();

        // Ekran görüntüsünü alın ve belirli bölgeyi kırpın
        File screenshot = Driver.getAppiumDriver().getScreenshotAs(OutputType.FILE);
        BufferedImage fullImage = ImageIO.read(screenshot);
        BufferedImage croppedImage = fullImage.getSubimage(location.getX(), location.getY(), size.getWidth(), size.getHeight());

        // Kırpılmış görüntüyü kaydedin
        File output = new File("kırpılmış_screenshot.png");
        ImageIO.write(croppedImage, "png", output);

        // Bağlantıyı kapat
        Driver.quitAppiumDriver();
    }





    // Oguzhan'ın Eklediği Methodlar

    public static void Login(String email, String password) {

        ReusableMethods.wait(1);
        loginPage.ProfileButton.click();
        ReusableMethods.wait(1);
        loginPage.SignInButton.click();
        ReusableMethods.wait(1);
        loginPage.EmailInsteadButton.click();
        ReusableMethods.wait(1);
        loginPage.EmailButton.click();
        ReusableMethods.wait(1);
        loginPage.EmailButton.sendKeys(ConfigReader.getProperty(email));
        ReusableMethods.wait(1);
        loginPage.PasswordButton.click();
        ReusableMethods.wait(1);
        loginPage.PasswordButton.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.wait(1);
        loginPage.SignInButton2.click();


    }

    public static void Logout() throws InterruptedException {

        ReusableMethods.wait(1);
        loginPage.ProfileButton.click();
        ReusableMethods.wait(1);
        koordinatTiklamaMethoduOguz(270, 2600);


    }

    public static void koordinatTiklamaMethoduOguz(int x, int y) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getAppiumDriver().perform(Collections.singletonList(tap));
    }

    public static void ekranKaydirmaMethoduOguz(int xPress, int yPress, int xMove, int yMove, int sureMillis) {
        AppiumDriver driver = Driver.getAppiumDriver();

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        // Parmağın başlangıç noktasına git
        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), xPress, yPress));

        // Parmağı bastır
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

        // Parmağı hedef noktaya taşı (sureMillis süresince)
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(sureMillis), PointerInput.Origin.viewport(), xMove, yMove));

        // Parmağı kaldır
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Aksiyonu gerçekleştir
        driver.perform(Collections.singletonList(swipe));
    }


}
