package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.LoggerHelper;
import utilities.ReusableMethods;

import static drivers.Driver.getAppiumDriver;


public class PaymentInformationPage {

    public PaymentInformationPage() {

        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }


    LoggerHelper logger = new LoggerHelper();


    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[19]")
    public WebElement firstProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"L\")")
    public WebElement size;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add To Cart\")")
    public WebElement AddToCartButton;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[13]")
    public WebElement shoppingCartIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Proceed to Checkout\")")
    public WebElement proceedToCheckoutButton;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[4]")
    public WebElement Address;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Save & Pay\")")
    public WebElement savePayButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Stripe\")")
    public WebElement stripeIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Confirm Order\")")
    public WebElement confirmOrderButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement cardNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement cartDate;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private WebElement cvCode;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    private WebElement zipCode;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"confirmBtn\")")
    public WebElement confirmButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Thank you for your order!\n" +
            "Your order is confirmed.\")")
    public WebElement orderMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Go to order details\")")
    public WebElement orderDetailsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Go to shopping\")")
    public WebElement goToShoppingButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Order History\")")
    public WebElement orderHistoryText;

    @AndroidFindBy(xpath = "//*[@class='android.widget.ImageView']")
    public WebElement getFirstProductDetails;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Download Receipt\")")
    public WebElement receiptDetails;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Print Invoice\")")
    public WebElement printInvoiceButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public  WebElement backButton;





    public void StripeCardIntroduction(String cartNumber, String cardDate, String cvcCode, String zipCodde){

        cardNumber.click();
        ReusableMethods.wait(5);

        try {
            cardNumber.sendKeys(cartNumber);
            cartDate.sendKeys(cardDate);
            cvCode.sendKeys(cvcCode);
            zipCode.sendKeys(zipCodde);

            logger.info("Kullanıcı Card Number olarak " + cartNumber +
                    " MM/YY olarak " + cardDate +
                    " CVC olarak " + cvcCode +
                    " Zip Code olarak " + zipCodde + " girer.");

        } catch (Exception e) {

            logger.error("Kart bilgileri girişi yapılamadı!");
        }

    }












}
