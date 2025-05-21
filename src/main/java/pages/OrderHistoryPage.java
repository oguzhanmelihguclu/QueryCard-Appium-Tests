package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static drivers.Driver.getAppiumDriver;

public class OrderHistoryPage {

    public OrderHistoryPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);


    }

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Order History\")")
    public WebElement orderHistoryLink;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Order History\")")
    public WebElement orderHistoryTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Order Details\")")
    public WebElement orderDetailsTitle;


    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Product') and contains(@content-desc, 'Delivery Status') and contains(@content-desc, 'Payment Status')]")
    public WebElement orderHistoryImageView;

    @AndroidFindBy(accessibility = "Download Receipt")
    public WebElement downloadReceiptButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Print Invoice\")")
    public WebElement printInvoiceButton;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement backLink;







}
