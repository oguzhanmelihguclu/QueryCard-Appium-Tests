package pagesApp;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static drivers.Driver.getAppiumDriver;


public class US01_02_03Page {

    public US01_02_03Page() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement logoElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(24)")
    public WebElement altBar;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Home\")")
    public WebElement homeTextElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Category\")")
    public WebElement categoryTextElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men\")")
    public WebElement menButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement addCartTextElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Shopping Cart\")   ")
    public WebElement shoppingcartTextElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Wishlist\")")
    public WebElement wishlistTextElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\").instance(0)")
    public WebElement signInTextElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement backButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Profile\")")
    public WebElement profileTextElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sing In To See Your Info\")")
    public WebElement infoProfileTextElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    public WebElement homepageSearchBoxElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public WebElement searchBoxElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"(10 Products Found)\")")
    public WebElement aramaSonucuCikanElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"(0 Products Found)\")")
    public WebElement sifirSonucuCikanElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"See All\")")
    public WebElement urunlerinTumunuGosterElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Flower Print Foil T-shirt\n" +
            "0 (0  Reviews)\n" +
            "$65.00\")")
    public WebElement firstProductElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Size:\")")
    public WebElement sizeFirstProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"M\")")
    public WebElement mSizeFirstProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Quantity:\")")
    public WebElement quantityFirstProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(9)")
    public WebElement plusFirstProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(10)")
    public WebElement addToCartButton;

    // negatif senaryo icin;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Size:\")")
    public List<WebElement> sizeList;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Color:\")")
    public List<WebElement> colorList;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Quantity:\")")
    public List<WebElement> quantityList;


}
