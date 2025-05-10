package pagesBrowser;

import config.ConfigReader;
import drivers.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReusableMethods;

import java.time.Duration;

public class BrowserPage {

    public BrowserPage() {
        PageFactory.initElements(BrowserDriver.getBrowserDriver(), this);
    }

    // Sayfada yer alan WebElement'ler
    @FindBy(xpath = "//*[text()='Browse by Categories']")
    public WebElement browserCategoriesText;

    @FindBy(xpath = "(//a[@class='flex flex-col items-center gap-1 text-text transition-all duration-300 hover:text-primary'])[2]")
    public WebElement browserLoginButton;
    //*[text()='Log in']
    @FindBy(xpath = "//*[@id='formEmail']")
    public WebElement browserEmail;

    @FindBy(xpath = "//*[@id='formPassword']")
    public WebElement browserPassword;

    @FindBy(xpath = "(//*[text()='Sign In'])[2]")
    public WebElement browserSignInButton;

    @FindBy(xpath = "(//*[text()='Logout'])[2]")
    public WebElement browserLogoutButton;

    @FindBy(xpath = "(//button[@class='flex flex-col items-center gap-1 text-text transition-all duration-300 hover:text-primary'])[2]")
    public WebElement browserLoginButton2;

    // Kullanıcıyı giriş yaptıran metot
    public void browserLogin(String mail, String password) {
        // Login butonuna tıklama
        waitForElementToBeClickable(browserLoginButton).click();

        // Mail ve şifre alanlarını doldurup giriş yapma
        waitForElementToBeVisible(browserEmail).sendKeys(ConfigReader.getProperty(mail));
        waitForElementToBeVisible(browserPassword).sendKeys(ConfigReader.getProperty(password));
        waitForElementToBeClickable(browserSignInButton).click();
    }

    // Kullanıcıyı çıkış yaptıran metot
    public void browserLogout() throws InterruptedException {
        Thread.sleep(2);
        waitForElementToBeClickable(browserLoginButton2).click();
        Thread.sleep(2);
        waitForElementToBeClickable(browserLogoutButton).click();
    }

    // Elementin görünür olmasını bekleyen metod
    private WebElement waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BrowserDriver.getBrowserDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Elementin tıklanabilir olmasını bekleyen metod
    private WebElement waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BrowserDriver.getBrowserDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
