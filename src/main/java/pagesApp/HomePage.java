package pagesApp;

import drivers.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



public class HomePage {

    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Categories\"]")
    public WebElement CategoriesText;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Men\"]")
    public WebElement CategoriesMenLink;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Toys\"]")
    public WebElement CategoriesToysLink;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Men Boots\"]")
    public WebElement CategoriesMenBootsLink;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Most Popular\"]")
    public WebElement MostPopularText;

    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[15]")
    public WebElement FlowerPrintFailTshirt;

    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[13]")
    public WebElement AdidasUltraboost21Sneakers;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]")
    public WebElement LikeIcon;

    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[8]")
    public WebElement TheNorthFaceArcticParka;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Quantity:\"]")
    public WebElement QuantityText;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Videos\"]")
    public WebElement VideosButton;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Product Videos\"]")
    public WebElement ProductVideosText;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Review\"]")
    public WebElement ReviewButton;

    @AndroidFindBy (xpath = "(//android.view.View[@content-desc=\"(0  Reviews)\"])[2]")
    public WebElement ProductReview;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Shipping & Return\"]")
    public WebElement ShippingReturnButton;

    @AndroidFindBy (xpath = "(//android.view.View[@content-desc=\"Shipping & Return\"])[2]")
    public  WebElement ProductShipppingReturnText;

    @AndroidFindBy (xpath = "(//*[@class='android.view.View'])[20]")
    public  WebElement ProductDetailsText;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Details\"]")
    public WebElement DetailsButton;




}
