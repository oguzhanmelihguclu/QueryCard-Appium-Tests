package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static drivers.Driver.getAppiumDriver;

public class CategoryAddressPage {

    public CategoryAddressPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement filterIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(3)")
    public static WebElement addToCartToast;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public static WebElement fullnameTextbox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public static WebElement emailTextbox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public static WebElement phoneTextbox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Country\")")
    public static WebElement countryButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public static WebElement searchbox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"State\")")
    public static WebElement stateButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"City\")")
    public static WebElement cityButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)\n")
    public static WebElement zipCodeTextbox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public static WebElement deleteButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    public static WebElement editButton;

}
