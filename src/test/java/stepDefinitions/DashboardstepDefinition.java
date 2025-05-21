package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ReusableMethods;

import static drivers.Driver.getAppiumDriver;


public class DashboardstepDefinition {


    Actions actions = new Actions(getAppiumDriver());
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @Then("User clicks on the profile icon")
    public void user_clicks_on_the_profile_icon() {

        ReusableMethods.wait(3);
       loginPage.ProfileButton.click();

    }

    @And("Confirm that the “Change Password” link is visible")
    public void confirmThatTheChangePasswordLinkIsVisible() {

        ReusableMethods.wait(1);
        dashboardPage.ChangePasswordLink.isDisplayed();

    }

    @Then("Clicks on the “Change Password” link")
    public void clicksOnTheChangePasswordLink() {

        dashboardPage.ChangePasswordLink.click();
    }

    @And("Confirms that you are redirected to the Change Password page")
    public void confirmsThatYouAreRedirectedToTheChangePasswordPage() {

        dashboardPage.ChangePasswordText.isDisplayed();
    }

    @Then("Clicks the back button to exit")
    public void clicksTheBackButtonToExit() {

        ReusableMethods.wait(2);
        dashboardPage.ChangeBackButton.click();
    }


    @And("Goes to the homepage for the exit process")
    public void goesToTheHomepageForTheExitProcess() throws InterruptedException {

        dashboardPage.HomePageIcon.click();
        ReusableMethods.wait(2);
        ReusableMethods.Logout();
        ReusableMethods.wait(3);
    }

    @And("Confirms that the old password box is visible")
    public void confirmsThatTheOldPasswordBoxIsVisible() {

        dashboardPage.oldPasswordBox.isDisplayed();
    }

    @And("Confirms that the New password box is visible")
    public void confirmsThatTheNewPasswordBoxIsVisible() {

        dashboardPage.newPasswordBox.isDisplayed();
    }

    @And("Confirm confirms that the Confirm password box is visible")
    public void confirmConfirmsThatTheConfirmPasswordBoxIsVisible() {

        dashboardPage.confirmPasswordBox.isDisplayed();
    }

    @And("Confirm the visibility of the Save Changes button")
    public void confirmTheVisibilityOfTheSaveChangesButton() {

        dashboardPage.SaveChangesButton.isDisplayed();
    }


    @And("Clicks the Save Changes button")
    public void clicksTheSaveChangesButton() {

        dashboardPage.SaveChangesButton.click();
    }

    @And("Confirms that the Save Changes button is functional")
    public void confirmsThatTheSaveChangesButtonIsFunctional() {

        Assert.assertTrue( dashboardPage.SaveChangesControl.isDisplayed());
    }

    @And("Fill in the textboxes for password change  and {string} as {string}")
    public void fillInTheTextboxesForPasswordChangeAndAs( String newPassword, String confirmPassword) {

        dashboardPage.oldPasswordEmptyClick(newPassword,confirmPassword);


    }


    @And("confirms that no password change was made when the old password box is empty")
    public void confirmsThatNoPasswordChangeWasMadeWhenTheOldPasswordBoxIsEmpty() {
        ReusableMethods.wait(2);
        dashboardPage.SaveChangesButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(dashboardPage.SaveChangesControl.isDisplayed());
    }


    @And("Fill in the textboxes for password change {string} as {string}")
    public void fillInTheTextboxesForPasswordChangeAs(String oldPassword, String confirmPassword) {

        dashboardPage.newPasswordEmptyClick(oldPassword, confirmPassword);
        ReusableMethods.wait(3);


    }

    @And("When the new password box is empty, it confirms that no password change has been made")
    public void whenTheNewPasswordBoxIsEmptyItConfirmsThatNoPasswordChangeHasBeenMade() {

        Assert.assertTrue(dashboardPage.confirmPassworRed.isDisplayed());

    }

    @And("Fill in the textboxes confirm password change {string} as {string}")
    public void fillInTheTextboxesConfirmPasswordChangeAs(String oldPassword, String newPassword) {

        dashboardPage.confirmPasswordEmptyClick(oldPassword, newPassword);


    }

    @And("ConfirmPassword confirms that the password has not been changed when the box is empty")
    public void confirmpasswordConfirmsThatThePasswordHasNotBeenChangedWhenTheBoxIsEmpty() {

       Assert.assertTrue( dashboardPage.confirmPasswordControl.isDisplayed());

    }

    @And("Fill in the textboxes confirm password change {string} as {string} and {string}")
    public void fillInTheTextboxesConfirmPasswordChangeAsAnd(String oldPassword, String newPassword, String confirmPassword ) {

        dashboardPage.passwordChange(oldPassword, newPassword, confirmPassword);

    }

    @And("Save Changes button click")
    public void saveChangesButtonClick() {

        ReusableMethods.wait(3);
        dashboardPage.SaveChangesButton.click();
    }


    @And("Confirms that the “Save Changes” button is redirected to the profile page")
    public void confirmsThatTheSaveChangesButtonIsRedirectedToTheProfilePage() {

        ReusableMethods.wait(3);
       Assert.assertTrue( dashboardPage.HomePageIcon.isDisplayed());
    }

    @Then("Confirms logging into the system with a new password")
    public void confirmsLoggingIntoTheSystemWithANewPassword() {

       Assert.assertTrue( dashboardPage.HomePageIcon.isDisplayed());

    }
}

