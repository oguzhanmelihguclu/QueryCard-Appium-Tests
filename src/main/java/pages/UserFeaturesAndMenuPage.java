package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static drivers.Driver.getAppiumDriver;

public class UserFeaturesAndMenuPage {

    public UserFeaturesAndMenuPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public WebElement nameBox;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"*Use Email Instead\"]")
    public WebElement emailInsteadButton;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public WebElement emailBox;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    public WebElement passwordBox;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign Up\"])[2]")
    public WebElement signUpButtonLink;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
    public WebElement successfullyMessage;

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    public WebElement errorMessage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign In\"]")
    public WebElement profileSignInButton;

    @AndroidFindBy(xpath = "//*[@text='Don’t allow']")
    public WebElement maybeDontAllow;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement homepageFirstHeart;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(9)")
    public WebElement homepageSecondHeart;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement wishlistComeWarningMessage;

    @AndroidFindBy(xpath = "(//android.view.View)[19]")
    public WebElement relevantProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Favorite\")")
    public WebElement relevantFavorite;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Women\")")
    public WebElement homepageScrollWomenCategory;


}
