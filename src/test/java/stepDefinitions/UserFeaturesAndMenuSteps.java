package stepDefinitions;

import config.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;

import pages.UserFeaturesAndMenuPage;
import utilities.ReusableMethods;

import static drivers.Driver.getAppiumDriver;

public class UserFeaturesAndMenuSteps {

    Actions actions = new Actions(getAppiumDriver());
    LoginPage loginPage = new LoginPage();
    UserFeaturesAndMenuPage myStepsPage = new UserFeaturesAndMenuPage();

    @Then("Verifies that the profile button is visible and active.")
    public void verifies_that_the_profile_button_is_visible_and_active() {
        Assert.assertTrue(loginPage.ProfileButton.isDisplayed());
        Assert.assertTrue(loginPage.ProfileButton.isEnabled());
        ReusableMethods.wait(2);
    }

    @And("Click on your profile icon.")
    public void click_on_your_profile_icon() {
        loginPage.ProfileButton.click();
        ReusableMethods.wait(2);
    }

    @Then("Verifies that the sign up button is visible and active.")
    public void verifies_that_the_sign_up_button_is_visible_and_active() {
        Assert.assertTrue(loginPage.SignUpButton.isDisplayed());
        Assert.assertTrue(loginPage.SignUpButton.isEnabled());
        ReusableMethods.wait(2);
    }

    @Given("Click on your sign up icon.")
    public void click_on_your_sign_up_icon() {
        loginPage.SignUpButton.click();
        ReusableMethods.wait(2);
    }

    @Given("Click the name box and enter any name.")
    public void click_the_name_box_and_enter_any_name() {
        myStepsPage.nameBox.click();
        myStepsPage.nameBox.sendKeys(ConfigReader.getProperty("UserName"));
        ReusableMethods.wait(2);
    }

    @When("Click on the use email instead link.")
    public void click_on_the_use_email_instead_link() {
        myStepsPage.emailInsteadButton.click();
        ReusableMethods.wait(2);
    }

    @When("Enter a valid email in the email box.")
    public void enter_a_valid_email_in_the_email_box() {
        myStepsPage.emailBox.click();
        myStepsPage.emailBox.sendKeys(ConfigReader.getProperty("EmailBox"));
        ReusableMethods.wait(2);
    }

    @When("Enter a valid password in the password box.")
    public void enter_a_valid_password_in_the_password_box() {
        myStepsPage.passwordBox.click();
        myStepsPage.passwordBox.sendKeys(ConfigReader.getProperty("Password2"));
        ReusableMethods.wait(2);
    }

    @When("Click the sign up button.")
    public void click_the_sign_up_button() {
        myStepsPage.signUpButtonLink.click();
        ReusableMethods.wait(2);
    }

    @Then("Verify that the message user created successfully is displayed.")
    public void verify_that_the_message_user_created_successfully_is_displayed() {
        Assert.assertTrue(myStepsPage.successfullyMessage.isDisplayed());
        ReusableMethods.wait(2);
    }

    @When("Enter an invalid email in the Email box.")
    public void enter_an_invalid_email_in_the_email_box() {
        myStepsPage.emailBox.click();
        myStepsPage.emailBox.sendKeys(ConfigReader.getProperty("InvalidEmailBox"));
        ReusableMethods.wait(2);
    }

    @Then("Verify that the sign up button is not active.")
    public void verify_that_the_sign_up_button_is_not_active() {
        Assert.assertFalse(myStepsPage.signUpButtonLink.isSelected());
        ReusableMethods.wait(2);
    }

    @When("Enter a invalid password in the password box.")
    public void enter_a_invalid_password_in_the_password_box() {
        myStepsPage.passwordBox.click();
        myStepsPage.passwordBox.sendKeys(ConfigReader.getProperty("InvalidPassword"));
        ReusableMethods.wait(2);
    }

    @Then("Verify the error message above due to invalid password entry.")
    public void verify_the_error_message_above_due_to_invalid_password_entry() {
        Assert.assertTrue(myStepsPage.errorMessage.isDisplayed());
        ReusableMethods.wait(2);
    }

    @Given("Click on your sign in icon.")
    public void click_on_your_sign_in_icon() {
        myStepsPage.profileSignInButton.click();
        ReusableMethods.wait(2);
    }

    @When("Click the sign in button.")
    public void click_the_sign_in_button() {
        loginPage.SignInButton2.click();
        ReusableMethods.wait(2);
    }

    @When("Click to add two products on the homepage to your wishlist.")
    public void click_to_add_two_products_on_the_homepage_to_your_wishlist() {
        myStepsPage.homepageFirstHeart.click();
        ReusableMethods.wait(2);
        myStepsPage.homepageSecondHeart.click();
        ReusableMethods.wait(2);
    }

    @Then("Added to wishlist verify warning text.")
    public void added_to_wishlist_verify_warning_text() {
        Assert.assertTrue(myStepsPage.wishlistComeWarningMessage.isDisplayed());
        ReusableMethods.wait(2);
    }

    @And("Enter a valid user email in the email box.")
    public void enterAValidUserEmailInTheEmailBox() {
        myStepsPage.nameBox.click();
        myStepsPage.nameBox.sendKeys(ConfigReader.getProperty("CustomerEmail"));
        ReusableMethods.wait(2);
    }

    @When("Enter a valid user password in the password box.")
    public void enterAValidUserPasswordInThePasswordBox() {
        myStepsPage.emailBox.click();
        myStepsPage.emailBox.sendKeys(ConfigReader.getProperty("CustomerPassword"));
        ReusableMethods.wait(2);
    }

    @When("Click on the relevant product.")
    public void click_on_the_relevant_product() {
        myStepsPage.relevantProduct.click();
        ReusableMethods.wait(2);
    }

    @When("While on the product page, remove the product from your favorites by scrolling down.")
    public void while_on_the_product_page_remove_the_product_from_your_favorites_by_scrolling_down() {
        ReusableMethods.ekranKaydirmaMethoduOguz(485, 1736, 485, 669, 1000);
        ReusableMethods.wait(2);
        myStepsPage.relevantFavorite.click();
        ReusableMethods.wait(2);
    }

    @Then("verify the warning message that the product has been removed from the wishlist.")
    public void verify_the_warning_message_that_the_product_has_been_removed_from_the_wishlist() {
        Assert.assertTrue(myStepsPage.wishlistComeWarningMessage.isDisplayed());
        ReusableMethods.wait(2);
    }

    @Then("add the product back to wishlist.")
    public void add_the_product_back_to_wishlist() {
        myStepsPage.relevantFavorite.click();
        ReusableMethods.wait(2);
    }

    @Then("Verify that the women category and subheadings are displayed in the categories section on the homepage.")
    public void verify_that_the_women_category_and_subheadings_are_displayed_in_the_categories_section_on_the_homepage() {
        ReusableMethods.ekranKaydirmaMethoduOguz(900, 1035, 215, 1035, 1000);
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethoduOguz(900, 1035, 215, 1035, 1000);
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethoduOguz(900, 1035, 215, 1035, 1000);
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethoduOguz(900, 1035, 215, 1035, 1000);
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethoduOguz(900, 1035, 350, 1035, 1000);
        ReusableMethods.wait(2);
        Assert.assertTrue(myStepsPage.homepageScrollWomenCategory.isDisplayed());
        ReusableMethods.wait(2);
    }

}
