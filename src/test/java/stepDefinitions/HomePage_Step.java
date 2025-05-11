package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pagesApp.HomePage;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static drivers.Driver.getAppiumDriver;


public class HomePage_Step {

   HomePage homePage =new pagesApp.HomePage();

    @Given("User makes driver adjustments")
    public void user_makes_driver_adjustments() {
        getAppiumDriver();
        ReusableMethods.wait(2);

    }


    @Then("The user sees the Categories heading on the homepage.")
    public void the_user_sees_the_categories_heading_on_the_homepage() {
        homePage.CategoriesText.isDisplayed();
    }

    @Then("The user sees the Men Boots link under the Categories heading.")
    public void the_user_sees_the_men_boots_link_under_the_categories_heading() {
        ReusableMethods.ekranKaydirmaMethoduOguz(1200, 1475, 235, 1475, 250);
        homePage.CategoriesMenBootsLink.isDisplayed();

    }

    @Then("The user sees the Toys link under the Categories heading.")
    public void the_user_sees_the_toys_link_under_the_categories_heading() throws InvalidMidiDataException {

        ReusableMethods.ekranKaydirmaMethoduOguz(1200, 1475, 235, 1475, 100);
        ReusableMethods.wait(2);
        homePage.CategoriesToysLink.isDisplayed();

    }

    @Then("The user sees the Men link under the Categories heading.")
    public void the_user_sees_the_men_link_under_the_categories_heading() {
        homePage.CategoriesMenLink.isDisplayed();

    }

    @Then("The user gets logged out.")
    public void the_user_gets_logged_out() throws InterruptedException {
        ReusableMethods.Logout();


    }

    @Then("The user sees the Most Popular heading on the homepage.")
    public void the_user_sees_the_most_popular_heading_on_the_homepage() {
        homePage.MostPopularText.isDisplayed();

    }


    @Then("The user verifies that the price of the The North Face Arctic Parka product is visible.")
    public void the_user_verifies_that_the_price_of_the_the_north_face_arctic_parka_product_is_visible() {

        ReusableMethods.ekranKaydirmaMethoduOguz(626, 2500, 250, 643, 100);
        ReusableMethods.wait(2);
        homePage.TheNorthFaceArcticParka.isDisplayed();


    }

    @Then("The user verifies that the reviews section of the The North Face Arctic Parka product is visible.")
    public void the_user_verifies_that_the_reviews_section_of_the_the_north_face_arctic_parka_product_is_visible() {
        ReusableMethods.ekranKaydirmaMethoduOguz(626, 2500, 250, 643, 100);
        ReusableMethods.wait(2);
        homePage.TheNorthFaceArcticParka.isDisplayed();

    }

    @Then("The user verifies that the star rating section of the The North Face Arctic Parka product is visible.")
    public void the_user_verifies_that_the_star_rating_section_of_the_the_north_face_arctic_parka_product_is_visible() {
        ReusableMethods.ekranKaydirmaMethoduOguz(626, 2500, 250, 643, 100);
        ReusableMethods.wait(2);
        homePage.TheNorthFaceArcticParka.isDisplayed();

    }

    @Then("The user verifies that the like section above the The North Face Arctic Parka product is visible.")
    public void the_user_verifies_that_the_like_section_above_the_the_north_face_arctic_parka_product_is_visible() {

        homePage.LikeIcon.isDisplayed();

    }

    @Then("The user sees the Flower Print Fail T-shirt link under the Most Popular heading.")
    public void the_user_sees_the_flower_print_fail_t_shirt_link_under_the_most_popular_heading() {
        homePage.FlowerPrintFailTshirt.isDisplayed();

    }

    @Then("The user sees the Adidas Ultraboost {int} Sneakers link under the Most Popular heading.")
    public void the_user_sees_the_adidas_ultraboost_sneakers_link_under_the_most_popular_heading(Integer int1) {
        ReusableMethods.ekranKaydirmaMethoduOguz(626, 2500, 250, 643, 300);
        homePage.AdidasUltraboost21Sneakers.isDisplayed();

    }

    @Given("The user clicks on the The North Face Arctic Parka product on the homepage.")
    public void the_user_clicks_on_the_the_north_face_arctic_parka_product_on_the_homepage() {
        ReusableMethods.ekranKaydirmaMethoduOguz(626, 2500, 250, 643, 100);
        ReusableMethods.wait(2);
        homePage.TheNorthFaceArcticParka.click();


    }

    @Then("The user verifies that the relevant page has been navigated to.")
    public void the_user_verifies_that_the_relevant_page_has_been_navigated_to() {
        Assert.assertTrue(homePage.QuantityText.isDisplayed());
    }

    @Then("The user verifies that the Videos heading is visible and clickable on the relevant page.")
    public void the_user_verifies_that_the_videos_heading_is_visible_and_clickable_on_the_relevant_page() {
        ReusableMethods.ekranKaydirmaMethoduOguz(626, 2500, 250, 643, 450);
        Assert.assertTrue(homePage.VideosButton.isEnabled());
        Assert.assertTrue(homePage.ProductVideosText.isEnabled());


    }

    @Given("The user clicks on the Details heading.")
    public void the_user_clicks_on_the_details_heading() {
        ReusableMethods.ekranKaydirmaMethoduOguz(626, 2500, 250, 643, 450);
    }

    @Then("The user sees the Product Details heading and the product information.")
    public void the_user_sees_the_product_details_heading_and_the_product_information() {

        Assert.assertTrue(homePage.DetailsButton.isDisplayed());
        Assert.assertTrue(homePage.ProductDetailsText.isDisplayed());

    }

    @Given("The user clicks on the Review heading.")
    public void the_user_clicks_on_the_review_heading() {
        ReusableMethods.ekranKaydirmaMethoduOguz(626, 2500, 250, 643, 450);
        homePage.ReviewButton.click();
    }

    @Then("The user sees the Product Reviews heading and views the reviews underneath it.")
    public void the_user_sees_the_product_reviews_heading_and_views_the_reviews_underneath_it() {
        Assert.assertTrue(homePage.ReviewButton.isDisplayed());
        Assert.assertTrue(homePage.ProductReview.isEnabled());

    }

    @Given("The user clicks on the Shipping & Return heading.")
    public void the_user_clicks_on_the_shipping_return_heading() {
        ReusableMethods.ekranKaydirmaMethoduOguz(626, 2500, 250, 643, 450);
        homePage.ShippingReturnButton.click();

    }

    @Then("The user sees the Shipping & Return heading and the product's shipping and return policy description.")
    public void the_user_sees_the_shipping_return_heading_and_the_product_s_shipping_and_return_policy_description() {


        Assert.assertTrue(homePage.ProductShipppingReturnText.getText().contains("15Days"));

    }
    @Given("The user logs in by entering their credentials, including {string} and {string}.")
    public void the_user_logs_in_by_entering_their_credentials_including_and(String email, String passsword) {

        ReusableMethods.Login(email,passsword);
    }


}
