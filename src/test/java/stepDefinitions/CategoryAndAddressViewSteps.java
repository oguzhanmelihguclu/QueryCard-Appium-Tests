package stepDefinitions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CategoryAddressPage;
import utilities.LoggerHelper;
import utilities.OptionsMethods;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;
import java.util.ArrayList;
import java.util.List;

import static drivers.Driver.getAppiumDriver;
import static org.junit.Assert.assertTrue;
import static pages.CategoryAddressPage.*;

public class CategoryAndAddressViewSteps extends OptionsMethods {

    CategoryAddressPage categoryAddressPage = new CategoryAddressPage();
    Actions actions = new Actions(getAppiumDriver());
    LoggerHelper loggerHelper = new LoggerHelper();

    @Given("The {string} icon should be visible on the homepage")
    public void the_category_icon_should_be_visible_on_the_homepage(String category) {

        ReusableMethods.wait(3);
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        WebElement webElement = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"" + category + "\")"));
        assertTrue(webElement.isDisplayed());
        loggerHelper.info("The " + category + "icon is visible on the homepage");
    }

    @Given("The {string} category should be visible and clickable")
    public void the_category_should_be_visible_and_clickable(String heading) {

        ReusableMethods.wait(3);
        WebElement element = getAppiumDriver().findElement(By.xpath("//android.view.View[@content-desc=\"" + heading + "\"]"));
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
        element.click();
        loggerHelper.info("The " + heading + "category is visible and clickable");
    }

    @Given("The {string} under the {string} category should be clickable")
    public void the_under_the_category_should_be_clickable(String filterIcon, String heading) {

        ReusableMethods.wait(3);
        clickButtonByDescription(heading);
        ReusableMethods.wait(3);
        categoryAddressPage.filterIcon.click();
        ReusableMethods.wait(3);
        assertTrue(categoryAddressPage.filterIcon.isDisplayed());
        assertTrue(categoryAddressPage.filterIcon.isEnabled());
        categoryAddressPage.filterIcon.click();
        ReusableMethods.wait(3);
        loggerHelper.info("The " + filterIcon + "under the " + heading + " category is clickable");
    }

    @Given("The {string} category window should be visible")
    public void the_men_category_window_should_be_visible(String description) {

        ReusableMethods.wait(3);
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        WebElement webElement = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"" + description + "\")"));
        assertTrue(webElement.isDisplayed());
        loggerHelper.info("The " + description + "category window is visible");
    }

    @Given("The Men {string} should be visible and clickable")
    public void the_men_should_be_visible_and_clickable(String subcategory) {

        ReusableMethods.wait(3);
        WebElement element = getAppiumDriver().findElement(By.xpath("//android.view.View[@content-desc=\"" + subcategory + "\"]"));
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
        element.click();
        ReusableMethods.wait(2);
        loggerHelper.info("The Men " + subcategory + "category is visible and clickable");
    }

    @Given("User clicks the button with itemName {string} and {string} and {string} and {string}")
    public void user_clicks_the_button_with_item_name_and_and_and(String itemName, String reviews, String price, String color) {

        ReusableMethods.wait(3);
        String xpathExpression = String.format("//android.view.View[contains(@content-desc, '%s') and contains(@content-desc, '%s') and contains(@content-desc, '%s')]", itemName, reviews, price);
        WebElement element = getAppiumDriver().findElement(MobileBy.xpath(xpathExpression));
        element.click();
        ReusableMethods.wait(3);
        clickButtonByDescription(color);
        loggerHelper.info("User clicks the button with itemName " + itemName);
    }

    @Given("{string} message should be visible")
    public void message_should_be_visible(String message) {

        ReusableMethods.wait(3);
        System.out.println(addToCartToast.getText());
        assertTrue(addToCartToast.isEnabled());
        loggerHelper.info("The " + message + " is visible");
    }

    @Given("The {string} should be visible")
    public void the_product_details_should_be_visible(String description) {

        ReusableMethods.wait(3);
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        WebElement webElement = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"" + description + "\")"));
        assertTrue(webElement.isDisplayed());
        loggerHelper.info("The " + description + " is visible");
    }

    @Given("The {string} under the Men category should be clickable")
    public void the_under_the_men_category_should_be_clickable(String filterIcon) {

        ReusableMethods.wait(3);
        categoryAddressPage.filterIcon.click();
        ReusableMethods.wait(3);
        WebElement element = getAppiumDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"" + filterIcon + "\"]"));
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
        element.click();
        ReusableMethods.wait(3);
        loggerHelper.info("The " + filterIcon + " under the Men category is clickable");
    }

    @Given("The {string} menu should be visible and clickable in the sidebar")
    public void the_address_menu_should_be_visible_and_clickable_in_the_sidebar(String description) {

        WebElement element = getAppiumDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"" + description + "\"]"));
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
        element.click();
        loggerHelper.info("The " + description + " is visible and clickable in the sidebar");
    }

    @Given("The {string} button should be visible and clickable")
    public void the_button_should_be_visible_and_clickable(String description) {

        WebElement element = getAppiumDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"" + description + "\"]"));
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
        element.click();
        loggerHelper.info("The " + description + " is visible and clickable");
    }

    @Given("User fills in all required address fields")
    public void user_fills_in_all_required_address_fields() {

        clickAndSendKeys(fullnameTextbox, "User Zeynep");
        clickAndSendKeys(emailTextbox, "zeynephasret.user@querycart.com");
        clickAndSendKeys(phoneTextbox, "9900881177");
        countryButton.click();
        clickAndSendKeys(searchbox, "Turkey");
        clickButtonByDescription("Turkey");
        stateButton.click();
        clickAndSendKeys(searchbox, "Adana Province");
        clickButtonByDescription("Adana Province");
        cityButton.click();
        clickAndSendKeys(searchbox, "Adana");
        clickButtonByDescription("Adana");
        clickAndSendKeys(zipCodeTextbox, "123456");
        actions.sendKeys(Keys.TAB + "Adana").perform();
        ReusableMethods.ekranKaydirmaMethoduOguz(670, 1610, 670, 820, 800);
        loggerHelper.info("User fills in all required address fields");
    }

    @Given("The new address should be displayed in the address list")
    public void the_new_address_should_be_displayed_in_the_address_list() {

        assertTrue(deleteButton.isDisplayed());
        loggerHelper.info("The new address is displayed in the address list");
    }

    @Given("Registered addresses should be displayed on the page")
    public void registered_addresses_should_be_displayed_on_the_page() {

        List<WebElement> allViews = getAppiumDriver().findElements(AppiumBy.className("android.view.View"));
        List<WebElement> addressElements = new ArrayList<>();
        for (WebElement el : allViews) {
            String content = el.getAttribute("content-desc");
            if (content != null && content.contains("@")) {
                addressElements.add(el);
            }
        }
        System.out.println("Total number of registered addresses: " + addressElements.size());
        loggerHelper.info("Registered addresses is displayed on the page");
    }

    @Given("User selects a registered address to edit")
    public void user_selects_a_registered_address_to_edit() {

        editButton.click();
        loggerHelper.info("User selects a registered address to edit");
    }

    @Given("User selects a registered address to delete")
    public void user_selects_a_registered_address_to_delete() {

        deleteButton.click();
        loggerHelper.info("User selects a registered address to delete");
    }

    @Given("User swipes to screen coordinates {int}, {int}, {int}, {int}")
    public void user_swipes_to_screen_coordinates(int x, int y, int endX, int endY) throws InvalidMidiDataException {

        OptionsMethods.swipe(x, y, endX, endY);
        ReusableMethods.wait(2);
        loggerHelper.info("User swipes to screen coordinates " + x + ", " + y + ", " + endX + ", " + endY);
    }

}
