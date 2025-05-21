package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static drivers.Driver.getAppiumDriver;

public class FavouritesPage {


    public FavouritesPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);



    }


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\").instance(1)")
    public WebElement signInLoginButton;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement phoneTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement passwordTextBox;


}
