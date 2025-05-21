package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static drivers.Driver.getAppiumDriver;

public class ForgotPasswordPage {


    public ForgotPasswordPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }

    @AndroidFindBy(uiAutomator = "  new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement newPasswordTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement confirmPasswordTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement phoneTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"*Use Email Instead\")")
    public WebElement useEmailInsteadLink;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Success\nYour password reset Successfully\")")
    public WebElement passwordResetConfirmationMessage;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement passwordTextBox;

    @AndroidFindBy(uiAutomator = " new UiSelector().className(\"android.widget.EditText\")")
    public WebElement emailTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Enter Valid Email Address\")")
    public WebElement invalidFormatEmailWarningMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"This email does not exist.\")")
    public WebElement unregisteredEmailErrorMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"This phone does not exist.\")")
    public WebElement invalidPhoneErrorMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Email is required\")")
    public WebElement emptyMailErrorMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"This field is required\")")
    public WebElement emptyPhoneErrorMessage;










}
