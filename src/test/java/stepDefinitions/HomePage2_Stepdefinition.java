package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import pagesApp.HomePage2;
import utilities.OptionsMethods;
import utilities.ReusableMethods;

import static drivers.Driver.getAppiumDriver;
import static drivers.Driver.quitAppiumDriver;


public class HomePage2_Stepdefinition extends OptionsMethods {

    Actions actions = new Actions(getAppiumDriver());
    HomePage2 us01_02_03Page = new HomePage2();


    @Given("Driver turns off")
    public void driver_turns_off() {
        quitAppiumDriver();
    }// Elif hocadan adlıgım her adım sonu drıver kapama

    @Given("User Verifies page title logo")
    public void verifies_page_title_logo() {
        ReusableMethods.wait(5);
        Assert.assertTrue(us01_02_03Page.logoElement.isDisplayed());
    }
    @Given("Verifies that bottom bar links are visible")
    public void verifies_that_bottom_bar_links_are_visible() {
        ReusableMethods.wait(5);
        Assert.assertTrue(us01_02_03Page.altBar.isDisplayed());
        ReusableMethods.wait(5);
    }

//US02-TC02-------------------------------------------------------------------

    @Given("User clicks on the Home tab and Verifies page title is Home")
    public void user_clicks_on_the_home_tab_and_verifies_page_title_is_home() {
        ReusableMethods.wait(3);
        us01_02_03Page.homeTextElement.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.homeTextElement.isDisplayed());
        ReusableMethods.wait(3);
    }

    @Given("User clicks on the Category tab and Verifies page title is Men")
    public void user_clicks_on_the_category_tab_and_verifies_page_title_is_men() {
        ReusableMethods.wait(3);
        us01_02_03Page.categoryTextElement.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.menButton.isDisplayed());
        ReusableMethods.wait(3);
    }
    @Given("User clicks on the Wishlist tab and Verifies page button is Sign In")
    public void user_clicks_on_the_wishlist_tab_and_verifies_page_button_is_sign_ın() {
        ReusableMethods.wait(3);
        us01_02_03Page.wishlistTextElement.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.signInTextElement.isDisplayed());
        ReusableMethods.wait(3);
        us01_02_03Page.backButton.click();
        ReusableMethods.wait(3);
    }
    @Given("User clicks on the Profile tab and Verifies page title is My Profile")
    public void user_clicks_on_the_profile_tab_and_verifies_page_title_is_my_profile() {
        ReusableMethods.wait(3);
        us01_02_03Page.profileTextElement.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.infoProfileTextElement.isDisplayed());
        ReusableMethods.wait(3);
    }
    @Given("User clicks on the Cart tab and Verifies page title is My Cart")
    public void user_clicks_on_the_cart_tab_and_verifies_page_title_is_my_cart() {
        ReusableMethods.wait(3);
        us01_02_03Page.addCartTextElement.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.shoppingcartTextElement.isDisplayed());
        ReusableMethods.wait(3);
    }

    //US02-TC03-------------------------------------------------------------------
    @Given("User clicks the search textbox and types {string}")
    public void user_clicks_the_search_textbox_and_types(String string) {
        // clickAndSendKeys(us01_02_03Page.homepageSearchBoxElement,string);
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.homepageSearchBoxElement.isDisplayed());
        ReusableMethods.wait(3);
        // Tıkla
        us01_02_03Page.homepageSearchBoxElement.click();
        ReusableMethods.wait(3);
        // Yazı gönder (standart yöntem)
        us01_02_03Page.searchBoxElement.sendKeys(string);
        ReusableMethods.wait(5);
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(5);
    }
    @Given("Verifies that search results are displayed")
    public void verifies_that_search_results_are_displayed() {
        ReusableMethods.wait(5);
        Assert.assertTrue(us01_02_03Page.aramaSonucuCikanElement.isDisplayed());
    }

    @Given("Verifies that {string} message is displayed")
    public void verifies_that_message_is_displayed(String string) {
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.sifirSonucuCikanElement.isDisplayed());
    }
    // US_03---------------------------------------------------------------------1
    @Given("Verifies that products are visible on the homepage")
    public void verifies_that_products_are_visible_on_the_homepage() {
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.urunlerinTumunuGosterElement.isDisplayed());
        ReusableMethods.wait(3);
    }

    @Given("Verifies that product features such as size, color, and quantity are visible for selection")
    public void verifies_that_product_features_such_as_size_color_and_quantity_are_visible_for_selection() {
        ReusableMethods.wait(5);
        us01_02_03Page.firstProductElement.click();
        ReusableMethods.wait(5);
        Assert.assertTrue(us01_02_03Page.sizeFirstProduct.isDisplayed());
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.quantityFirstProduct.isDisplayed());
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.addToCartButton.isDisplayed());
        ReusableMethods.wait(3);
    }
    // US_03---------------------------------------------------------------------2
    @Given("User clicks on the product with description {string}")
    public void user_clicks_on_the_product_with_description(String string) {
        ReusableMethods.wait(3);
        us01_02_03Page.firstProductElement.click();
    }

    @Given("Verifies that size options are visible and selectable")
    public void verifies_that_size_options_are_visible_and_selectable() {
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.sizeFirstProduct.isDisplayed());
    }

    @Given("User selects size {string}")
    public void user_selects_size(String string) {
        ReusableMethods.wait(3);
        us01_02_03Page.mSizeFirstProduct.click();
    }

    @Given("Verifies that quantity options are visible and selectable")
    public void verifies_that_quantity_options_are_visible_and_selectable() {
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.quantityFirstProduct.isDisplayed());
    }

    @Given("User selects quantity {string}")
    public void user_selects_quantity(String string) {
        ReusableMethods.wait(3);
        us01_02_03Page.plusFirstProduct.click();
    }

    @Given("Verifies that the {string} button is visible and active")
    public void verifies_that_the_button_is_visible_and_active(String string) {
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.addToCartButton.isDisplayed());
    }

    @Given("User clicks on the {string} button")
    public void user_clicks_on_the_button(String string) {
        ReusableMethods.wait(3);
        us01_02_03Page.addToCartButton.click();
    }

    @Given("Verifies that the item is added to the cart")  // KONTROLL
    public void verifies_that_the_item_is_added_to_the_cart() {
        ReusableMethods.wait(3);
        Assert.assertTrue(us01_02_03Page.shoppingcartTextElement.isDisplayed());
    }

    //US_03---------------------------------------------------------------------3
    @Given("Verifies that product features such as size, color, and quantity are NOT visible")
    public void verifies_that_product_features_such_as_size_color_and_quantity_are_not_visible() {
        //Assert.assertTrue(us01_02_03Page.sizeFirstProduct.isEnabled());
        // Assert.assertTrue(us01_02_03Page.quantityFirstProduct.isEnabled());
        Assert.assertTrue("Size görünmemeli", us01_02_03Page.sizeList.isEmpty());
        Assert.assertTrue("Color görünmemeli", us01_02_03Page.colorList.isEmpty());
        Assert.assertTrue("Quantity görünmemeli", us01_02_03Page.quantityList.isEmpty());

    }

}
