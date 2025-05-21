package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Collections;

import static drivers.Driver.getAppiumDriver;

public class AdressPage {

    public AdressPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men\")")
    public WebElement menMenu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Adidas 3-Stripes Cushioned Crew Socks\n" + "0 (0  Reviews)\n" + "$15.00\")")
    public WebElement adidas3Stripes;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Black\")")
    public WebElement blackButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add To Cart\")")
    public WebElement addToCartButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    public WebElement sepetButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Proceed to Checkout\")")
    public WebElement proceedToCheckoutButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Delivery\")")
    public WebElement deliveryButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pick Up\")")
    public WebElement pickupButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    public WebElement editButtonSmall;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Aix-en-Provence\")")
    public WebElement cityButtonText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Annot\")")
    public WebElement cityAnnot;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Update Address\").instance(1)")
    public WebElement updateAdressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Order Summary\")")
    public WebElement orderSummary;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Save & Pay\")")
    public WebElement savePayButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Edit\")")
    public WebElement editButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Shipping Address\")")
    public WebElement shippingAdressText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Edit Profile\")")
    public WebElement edithProfilMenu;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement fullName;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement email;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Country\")")
    private WebElement country;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"State\")")
    private WebElement state;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"City\")")
    private WebElement city;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    private WebElement zipCode;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(4)")
    private WebElement streetAdress;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add Address\")")
    private WebElement addAdressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" + "Address Updated Successfully!\")")
    public WebElement successMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement geriOkAddress;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Total\")")
    public WebElement totalText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Confirm Order\")")
    public WebElement confirmOrderButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Profile\")")
    public WebElement profilIkonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Logout\")")
    public WebElement logoutButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" + "Logged Out Successfully.\")")
    public WebElement logoutSuccessMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\")")
    public WebElement signInButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement emailEdith;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Save Changes\")")
    public WebElement saveChangesButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"PROFILE_UPDATE\n" + "Profile Updated Successfully\")")
    public WebElement profilUpdateSuccessMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public WebElement profilUpdatePhone;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Please type phone number\")")
    public WebElement profilUpdatePhoneMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement phoneTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\").instance(1)")
    public WebElement signInLoginButton;


    public void ekranKaydirmaMethodu() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence scroll = new Sequence(finger, 1);

        scroll.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 500, 1500));
        scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), 500, 1000));
        scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(scroll));
    }
    public void koordinatTiklamaMethodu(int x, int y) {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);

        tap.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(tap));
    }

    public void clearInputWithDel(WebElement element, int repeatCount) {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        element.click(); // alanı aktif hale getir
        for (int i = 0; i < repeatCount; i++) {
            driver.pressKey(new KeyEvent(AndroidKey.DEL));
        }
    }

    public void phoneTextBoxClickAndSendKeys(String phoneNumberLogin) {
        phoneTextBox.click();
        phoneTextBox.sendKeys(phoneNumberLogin);
    }
    public void signInLoginClick() {
        signInLoginButton.click();
    }

}
