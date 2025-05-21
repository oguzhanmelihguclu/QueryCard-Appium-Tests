package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static drivers.Driver.getAppiumDriver;

public class MostPopularPage {

    public MostPopularPage() {

        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Most Popular\")")
    public WebElement mostPopularText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"See All\")")
    public WebElement seeAllIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement backButton;

   @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[14]")
    public WebElement productList;

   @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Categories\")")
    public WebElement categoriesText;



}
