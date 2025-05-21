package pages;

import config.ConfigReader;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.ReusableMethods;

import static drivers.Driver.getAppiumDriver;

public class DashboardPage {

    public DashboardPage() {

        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }


    Actions actions = new Actions(getAppiumDriver());


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Change Password\")")
    public WebElement ChangePasswordLink;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Save Changes\")")
    public WebElement SaveChangesButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Please type old password\")")
    public WebElement SaveChangesControl;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Change Password\")")
    public WebElement ChangePasswordText;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\")")
    public WebElement ChangeBackButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Home\")")
    public WebElement HomePageIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement oldPasswordBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement newPasswordBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public WebElement confirmPasswordBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Password not matched\")")
    public WebElement confirmPassworRed;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Please type confirm password\")")
    public WebElement confirmPasswordControl;





    public void oldPasswordEmptyClick( String newPassword, String confirmPassword) {
        oldPasswordBox.click();
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.wait(2);
        actions.sendKeys(newPassword);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(confirmPassword);

    }

    public void newPasswordEmptyClick( String oldPassword, String confirmPassword) {
        oldPasswordBox.click();
        actions.sendKeys(oldPassword);
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB).perform();
        confirmPasswordBox.sendKeys(ConfigReader.getProperty(confirmPassword));


    }

    public void confirmPasswordEmptyClick( String oldPassword, String newPassword) {
        oldPasswordBox.click();
        actions.sendKeys(oldPassword);
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB).perform();
        newPasswordBox.sendKeys(ConfigReader.getProperty(newPassword));
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.wait(2);
        SaveChangesButton.click();

    }


    public void passwordChange( String oldPassword, String newPassword, String confirmPassword ) {
        oldPasswordBox.click();
        oldPasswordBox.sendKeys(ConfigReader.getProperty(oldPassword));
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB).perform();
        newPasswordBox.sendKeys(ConfigReader.getProperty(newPassword));
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB).perform();
        confirmPasswordBox.sendKeys(ConfigReader.getProperty(confirmPassword));
        ReusableMethods.wait(2);

    }




}
