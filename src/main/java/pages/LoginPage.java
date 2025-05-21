package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static drivers.Driver.getAppiumDriver;

public class LoginPage {


    public LoginPage() {

        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Profile\"]")
    public WebElement ProfileButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign In\"]")
    public WebElement SignInButton;

    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[10]")
    public WebElement EmailInsteadButton ;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement EmailButton ;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement PasswordButton ;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])[2]")
    public WebElement SignInButton2 ;

    @AndroidFindBy (xpath = "//*[@content-desc='Logout']")
    public WebElement LogoutButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign Up\"]")
    public WebElement SignUpButton;


}
