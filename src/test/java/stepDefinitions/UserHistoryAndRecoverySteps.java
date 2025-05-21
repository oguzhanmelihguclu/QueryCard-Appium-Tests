package stepDefinitions;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FavouritesPage;
import pages.ForgotPasswordPage;
import pages.OrderHistoryPage;
import utilities.LoggerHelper;
import utilities.ReusableMethods;

import java.time.Duration;

import static drivers.Driver.getAppiumDriver;
import static org.junit.Assert.assertTrue;

public class UserHistoryAndRecoverySteps {

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    FavouritesPage favouritesPage = new FavouritesPage();

    OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
    Actions actions = new Actions(getAppiumDriver());

    LoggerHelper loggerHelper = new LoggerHelper();


    @When("User clicks the new password field and sends {string}")
    public void user_clicks_the_new_password_field_and_sends(String password) {

        assertTrue(forgotPasswordPage.newPasswordTextBox.isDisplayed());
        forgotPasswordPage.newPasswordTextBox.click();
        forgotPasswordPage.newPasswordTextBox.sendKeys(password);

        loggerHelper.info("User clicks the new password field and sends password");


    }
    @When("User clicks the confirm password field and sends {string}")
    public void user_clicks_the_confirm_password_field_and_sends(String password) {

        assertTrue(forgotPasswordPage.confirmPasswordTextBox.isDisplayed());
        forgotPasswordPage.confirmPasswordTextBox.click();
        forgotPasswordPage.confirmPasswordTextBox.sendKeys(password);

        loggerHelper.info("User clicks the confirm password field and sends password");
    }
    @Then("User verifies the confirmation message for password reset {string}")
    public void user_verifies_the_confirmation_message_for_password_reset (String expectedMessage) {

        String confirmationMessage = forgotPasswordPage.passwordResetConfirmationMessage.getAttribute("content-desc");

        //System.out.println("Confirmation message: " + confirmationMessage);

        Assert.assertTrue(confirmationMessage.contains(expectedMessage));
        loggerHelper.info("User verifies the confirmation message for password reset");

    }


    @Then("User verifies the error message {string} for password reset with an invalid email format")
    public void user_verifies_the_error_message_for_password_reset_with_an_invalid_email_format(String expectedMessage) {
        String actualErrorMessage = forgotPasswordPage.invalidFormatEmailWarningMessage.getAttribute("content-desc");

        //System.out.println("Confirmation message: " + actualErrorMessage);

        Assert.assertTrue(actualErrorMessage.contains(expectedMessage));
        loggerHelper.info("User verifies the error message for password reset with an invalid email format");
    }


    @When("User clicks the phone field and sends {string}")
    public void user_clicks_the_phone_field_and_sends(String phoneNumber) {
        assertTrue(forgotPasswordPage.phoneTextBox.isDisplayed());
        forgotPasswordPage.phoneTextBox.click();
        forgotPasswordPage.phoneTextBox.sendKeys(phoneNumber);
        loggerHelper.info("User clicks the phone field and sends Phone Number");
    }


    @When("User clicks the email field and sends {string}")
    public void user_clicks_the_email_field_and_sends(String email) {

        Assert.assertTrue(forgotPasswordPage.emailTextBox.isDisplayed());
        forgotPasswordPage.emailTextBox.click();
        forgotPasswordPage.emailTextBox.sendKeys(email);

        loggerHelper.info("User clicks the email field and sends email");

    }

    @Then("User verifies the error message {string} for password reset with an unregistered email")
    public void user_verifies_the_error_message_for_password_reset_with_an_unregistered_email(String expectedMessage) {

        String actualErrorMessage = forgotPasswordPage.unregisteredEmailErrorMessage.getAttribute("content-desc");

        //System.out.println("Confirmation message: " + actualErrorMessage);

        Assert.assertTrue(actualErrorMessage.contains(expectedMessage));

        loggerHelper.info("User verifies the error message {string} for password reset with an unregistered email");

    }

    @Then("User verifies the error message {string} for password reset with an invalid format or non-existent phone number")
    public void user_verifies_the_error_message_for_password_reset_with_an_invalid_format_or_non_existent_phone_number(String expectedMessage) {
        String actualErrorMessage = forgotPasswordPage.invalidPhoneErrorMessage.getAttribute("content-desc");

        //System.out.println("Confirmation message: " + actualErrorMessage);

        Assert.assertTrue(actualErrorMessage.contains(expectedMessage));

        loggerHelper.info("User verifies the error message for password reset with an invalid format or non-existent phone number");
    }

    @Then("User verifies the error message {string} for password reset providing no email")
    public void user_verifies_the_error_message_for_password_reset_providing_no_email(String expectedMessage) {

        String actualErrorMessage = forgotPasswordPage.emptyMailErrorMessage.getAttribute("content-desc");

        //System.out.println("Confirmation message: " + actualErrorMessage);

        Assert.assertTrue(actualErrorMessage.contains(expectedMessage));

        loggerHelper.info("User verifies the error message for password reset providing no email");

    }

    @Then("User verifies the error message {string} for password reset providing no phone number")
    public void user_verifies_the_error_message_for_password_reset_providing_no_phone_number(String expectedMessage) {
        String actualErrorMessage = forgotPasswordPage.emptyPhoneErrorMessage.getAttribute("content-desc");

        //System.out.println("Confirmation message: " + actualErrorMessage);

        Assert.assertTrue(actualErrorMessage.contains(expectedMessage));

        loggerHelper.info("User verifies the error message for password reset providing no phone number");
    }

    // US_18 Step Definitions

    @When("User enters valid credentials to log in")
    public void user_enters_valid_credentials_to_log_in() {

        ReusableMethods.wait(3);
        assertTrue(favouritesPage.phoneTextBox.isDisplayed());
        favouritesPage.phoneTextBox.click();
        favouritesPage.phoneTextBox.sendKeys("1122334455");
        // Telefon numarası alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();

        actions.sendKeys("Abcde1234!").perform();
        ReusableMethods.wait(1);

        loggerHelper.info("User enters valid credentials to log in");
    }


    @Then("User verifies that order history link is visible")
    public void user_verifies_that_order_history_link_is_visible() {
        Assert.assertTrue(orderHistoryPage.orderHistoryLink.isDisplayed());
        ReusableMethods.wait(3);
        orderHistoryPage.orderHistoryLink.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(orderHistoryPage.orderHistoryTitle.isDisplayed());

        loggerHelper.info("User verifies that order history link is visible");
    }


    @Then("User verifies that shopping history viewing icon is visible and active on the Order History page.")
    public void user_verifies_that_shopping_history_viewing_icon_is_visible_and_active_on_the_order_history_page() {

        Assert.assertTrue(orderHistoryPage.orderHistoryImageView.isDisplayed());
        ReusableMethods.wait(3);

        orderHistoryPage.orderHistoryImageView.click();
        ReusableMethods.wait(3);

        Assert.assertTrue(orderHistoryPage.orderDetailsTitle.isDisplayed());

        loggerHelper.info("User verifies that shopping history viewing icon is visible and active on the Order History page.");

    }

    @Then("User clicks scrolls down to the button with description {string}")
    public void user_clicks_scrolls_down_to_the_button_with_description(String description) {

        getAppiumDriver().findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"" + description + "\"))"));

        loggerHelper.info("User clicks scrolls down to the button with description " + description);
    }


    @Then("User verifies the button with description {string} is visible")
    public void user_verifies_the_button_with_description_is_visible(String description) {

        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
                MobileBy.AndroidUIAutomator("new UiSelector().description(\"" + description + "\")")
        ));

        Assert.assertTrue(button.isDisplayed());
        ReusableMethods.wait(3);

        loggerHelper.info("User verifies the button with description " + description + " is visible");
    }

    @Then("User clicks scrolls up to the button with description {string}")
    public void user_clicks_scrolls_up_to_the_button_with_description(String description) {

        ReusableMethods.wait(3);
        getAppiumDriver().findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward().scrollIntoView(new UiSelector().description(\"" + description + "\"))"));

        loggerHelper.info("User clicks scrolls up to the button with description " + description);
    }

    // US_23 Step Definitions

    @Given("User clicks the button with itemName Flower Print Foil T-shirt wishlist icon")
    public void user_clicks_the_button_with_item_name_flower_print_foil_t_shirt_wishlist_icon() {

        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(10));
        String xpath = "//android.view.View[contains(@content-desc, '" + "Flower" + "')]/android.widget.ImageView";

        WebElement favoriteIcon = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath(xpath)));

        favoriteIcon.click();

        ReusableMethods.wait(3);

        loggerHelper.info("User clicks the button with itemName Flower Print Foil T-shirt wishlist icon");
    }

    @Given("User verifies that clicking the favourite icon navigates to Sign In page")
    public void user_verifies_that_clicking_the_favourite_icon_navigates_to_sign_in_page() {

        ReusableMethods.wait(3);

        Assert.assertTrue(favouritesPage.signInLoginButton.isDisplayed());

        loggerHelper.info("User verifies that clicking the favourite icon navigates to Sign In page");

    }


    @Given("User locates and verifies the favorite icon on a product containing name {string}.")
    public void user_locates_and_verifies_the_favorite_icon_on_a_product_containing_name(String productName) {
        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(10));
        String xpath = "//android.view.View[contains(@content-desc, '" + productName + "')]/android.widget.ImageView";

        WebElement favoriteIcon = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath(xpath)));

        Assert.assertTrue(favoriteIcon.isDisplayed());

        ReusableMethods.wait(3);

        loggerHelper.info("User locates and verifies the favorite icon on a product containing name " + productName);
    }

    @Given("User clicks the wishlist icon with itemName {string}")
    public void user_clicks_the_wishlist_icon_with_item_name(String productName) {

        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(10));
        String xpath = "//android.view.View[contains(@content-desc, '" + productName + "')]/android.widget.ImageView";

        WebElement favoriteIcon = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath(xpath)));

        favoriteIcon.click();

        ReusableMethods.wait(3);

        loggerHelper.info("User clicks the wishlist icon with itemName " + productName);

    }

    @Then("User hits the back link")
    public void user_hits_the_back_link() {

        ReusableMethods.wait(3);
        orderHistoryPage.backLink.click();

        loggerHelper.info("User hits the back link" );
    }


}
