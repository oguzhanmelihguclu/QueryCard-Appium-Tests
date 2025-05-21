package stepDefinitions;

import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdressPage;
import utilities.LoggerHelper;
import utilities.ReusableMethods;

import static drivers.Driver.getAppiumDriver;
import static utilities.OptionsMethods.clickButtonByDescription;
import static utilities.OptionsMethods.hideKeyboard;

@Slf4j
public class UserAccountManagementSteps {

    AdressPage page = new AdressPage();
    Actions actions = new Actions(getAppiumDriver());
    LoggerHelper loggerHelper = new LoggerHelper();

    //US-19

    @Given("User clicks the button with description {string}")
    public void user_clicks_the_button_with_description(String description) {
        ReusableMethods.wait(3);
        clickButtonByDescription(description);
        loggerHelper.info("User clicks the button with description " + description);
    }
    @Given("User clicks the button {string} and sendKeys {string}")
    public void user_clicks_the_button_and_send_keys(String elementName, String text) {
        page.phoneTextBoxClickAndSendKeys(text);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Yelda12.").perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        actions.sendKeys(Keys.ENTER).perform();
        loggerHelper.info("User clicks the button with description " + elementName);

    }
    @Given("User clicks the button {string}")
    public void user_clicks_the_button(String elementName) {
        page.signInLoginClick();
        ReusableMethods.wait(1);
        hideKeyboard();
        ReusableMethods.wait(2);
        loggerHelper.info("User clicks the button with description " + elementName);

    }
    @Given("User clickss the {string} button")
    public void user_clickss_the_button(String string) {
        page.menMenu.click();
        loggerHelper.info("User clicks the men button");

    }
    @Given("From the opened menu, user selects {string}")
    public void from_the_opened_menu_user_selects(String string) {
        page.adidas3Stripes.click();
        loggerHelper.info("User clicks the adidas  3 stripesbutton");

    }
    @Given("User selects the color {string}")
    public void user_selects_the_color(String string) {
        page.blackButton.click();
        loggerHelper.info("User clicks the black button");

    }
    @Given("User clicks the Add to Cart button")
    public void user_clicks_the_add_to_cart_button() {
        page.ekranKaydirmaMethodu();
        ReusableMethods.wait(2);
        page.addToCartButton.click();
        loggerHelper.info("User clicks the add to cart button");
    }

    @Given("User clicks the cart icon")
    public void user_clicks_the_cart_icon() {
        page.sepetButton.click();
        loggerHelper.info("User clicks the cart icon");

    }
    @Given("From the opened page, user clicks the {string} button")
    public void from_the_opened_page_user_clicks_the_button(String string) {
        page.proceedToCheckoutButton.click();
        loggerHelper.info("User clicks the proceed to checkout button");

    }
    @Given("User sees and clicks the {string} button")
    public void user_sees_and_clicks_the_button(String string) {
        Assert.assertTrue(page.deliveryButton.isDisplayed());
        page.deliveryButton.click();
        loggerHelper.info("User clicks the delivery button");

    }
    @Given("User sees and clicks the Pick Up button")
    public void user_sees_and_clicks_the_pick_up_button() {
        Assert.assertTrue(page.pickupButton.isDisplayed());
        page.pickupButton.click();
        loggerHelper.info("User clicks the pickup button");
    }

    @Given("User sees the {string} section")
    public void user_sees_the_section(String string) {
        Assert.assertTrue(page.shippingAdressText.isDisplayed());
        loggerHelper.info("User sees the shipping adress text");
    }

    @Given("User sees and clicks the Edit button")
    public void user_sees_and_clicks_the_edit_button() {
        Assert.assertTrue(page.editButton.isDisplayed());
        page.editButton.click();
        loggerHelper.info("User clicks the edit button");

    }
    @Given("In the opened form, user updates the city information")
    public void in_the_opened_form_user_updates_the_city_information() {
        page.editButtonSmall.click();
        page.cityButtonText.click();
        page.cityAnnot.click();
        page.updateAdressButton.click();
        loggerHelper.info("User updates the city information");

    }

    @Given("User sees the message Address updated successfully")
    public void user_sees_the_message_address_updated_successfully() {
        Assert.assertTrue(page.successMessage.isDisplayed());
        page.geriOkAddress.click();
        page.geriOkAddress.click();
        loggerHelper.info("User sees the success message");
    }
    @Given("User clicks the Pick Up button")
    public void user_clicks_the_pick_up_button() {
        page.pickupButton.click();
        loggerHelper.info("User clicks the pickup button");
    }

    @Given("User verifies the {string} title is visible")
    public void user_verifies_the_title_is_visible(String string) {
        Assert.assertTrue(page.orderSummary.isDisplayed());
        loggerHelper.info("User sees the order summary");

    }

    @Given("User verifies the order price is displayed in the {string} section")
    public void user_verifies_the_order_price_is_displayed_in_the_section(String string) {
        page.ekranKaydirmaMethodu();
        Assert.assertTrue(page.totalText.isDisplayed());
        loggerHelper.info("User sees the total text");

    }

    @Given("User sees and clicks the Save & Pay button")
    public void user_sees_and_clicks_the_save_pay_button() throws InterruptedException {
        page.koordinatTiklamaMethodu(600,1100);
        page.ekranKaydirmaMethodu();
        page.savePayButton.click();
        loggerHelper.info("User clicks the save & pay button");
    }

    @Given("User verifies they are redirected to the payment page")
    public void user_verifies_they_are_redirected_to_the_payment_page() {
        Assert.assertTrue(page.confirmOrderButton.isDisplayed());
        loggerHelper.info("User sees the confirm order button");

    }

    // US-22
    @Given("User sees and clicks the profile icon on the homepage")
    public void user_sees_and_clicks_the_profile_icon_on_the_homepage() {
        Assert.assertTrue(page.profilIkonu.isDisplayed());
        page.profilIkonu.click();
        loggerHelper.info("User clicks the profile icon");


    }
    @Given("From the opened menu, user sees and clicks the {string} option")
    public void from_the_opened_menu_user_sees_and_clicks_the_option(String string) {
        Assert.assertTrue(page.logoutButton.isDisplayed());
        page.koordinatTiklamaMethodu(300,2600);
        loggerHelper.info("User clicks the logout button");

    }
    @Given("User verifies successful logout")
    public void user_verifies_successful_logout() {
        Assert.assertTrue(page.logoutSuccessMessage.isDisplayed());
        loggerHelper.info("User sees the logout success message");

    }
    @Given("User verifies redirection to the login screen")
    public void user_verifies_redirection_to_the_login_screen() {
        page.profilIkonu.click();
        Assert.assertTrue(page.signInButton.isDisplayed());
        loggerHelper.info("User sees the sign in button");

    }
    // US-21
    @Given("From the opened menu, user sees and clicks {string}")
    public void from_the_opened_menu_user_sees_and_clicks(String string) {
        Assert.assertTrue(page.edithProfilMenu.isDisplayed());
        page.edithProfilMenu.click();
        loggerHelper.info("User clicks the edith profil menu");

    }
    @Given("User edits the {string} field")
    public void user_edits_the_field(String string) {
        page.emailEdith.click();
        page.clearInputWithDel(page.emailEdith,20);
        actions.sendKeys("useryelda@gmail.com").perform();
        ReusableMethods.wait(5);
        loggerHelper.info("User edits the email field");

    }
    @Given("User sees and clicks the Save Changes button")
    public void user_sees_and_clicks_the_save_changes_button() {
        Assert.assertTrue(page.saveChangesButton.isDisplayed());
        page.saveChangesButton.click();
        loggerHelper.info("User clicks the save changes button");

    }
    @Given("User sees the message {string}")
    public void user_sees_the_message(String string) {
        Assert.assertTrue(page.profilUpdateSuccessMessage.isDisplayed());
        loggerHelper.info("User sees the success message");

    }

    @Given("User leaves the {string} field empty")
    public void user_leaves_the_field_empty(String string) {
        page.clearInputWithDel(page.profilUpdatePhone,10);
        ReusableMethods.wait(3);
        loggerHelper.info("User leaves the phone field empty");
    }
    @Given("User sees the message The phone field is required.")
    public void user_sees_the_message_the_phone_field_is_required() {
        Assert.assertTrue(page.profilUpdatePhoneMessage.isDisplayed());
        loggerHelper.info("User sees the phone message");

    }



}
