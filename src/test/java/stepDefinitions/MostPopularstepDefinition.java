package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MostPopularPage;
import utilities.ReusableMethods;

import static drivers.Driver.getAppiumDriver;

public class MostPopularstepDefinition {


    MostPopularPage mostPopularPage = new MostPopularPage();

    @Given("User open the application")
    public void user_open_the_application() {

        getAppiumDriver();

    }


    @And("User logs into the application with {string} and {string} password")
    public void userLogsIntoTheApplicationWithAndPassword(String email, String password) {

        ReusableMethods.wait(4);
        ReusableMethods.Login(email, password);
    }

    @Then("Verify that the “Most Popular” menu heading appears in the home page navigation bar")
    public void verifyThatTheMostPopularMenuHeadingAppearsInTheHomePageNavigationBar() {

        Assert.assertTrue(mostPopularPage.mostPopularText.isDisplayed());

    }


    @And("User shuts down the system")
    public void userShutsDownTheSystem() throws InterruptedException {

        ReusableMethods.wait(2);
        ReusableMethods.Logout();
        ReusableMethods.wait(2);
    }

    @Then("Confirms that the “See All” icon is visible")
    public void confirmsThatTheSeeAllIconIsVisible() {

        ReusableMethods.wait(2);
        mostPopularPage.seeAllIcon.isDisplayed();
    }

    @And("Confirms that the “See All” icon is clickable")
    public void confirmsThatTheSeeAllIconIsClickable() {
        ReusableMethods.wait(2);
        mostPopularPage.seeAllIcon.click();
    }

    @Then("Confirms that the routing is done")
    public void confirmsThatTheRoutingIsDone() {

        ReusableMethods.wait(2);
       mostPopularPage.backButton.isDisplayed();
    }

    @Then("Confirms that products are listed")
    public void confirmsThatProductsAreListed() {

        mostPopularPage.productList.isDisplayed();
    }

    @And("Clicks the back button")
    public void clicksTheBackButton() {

        ReusableMethods.wait(2);
        mostPopularPage.backButton.click();
    }


    @And("Confirms redirection to homepage")
    public void confirmsRedirectionToHomepage() {

        mostPopularPage.categoriesText.isDisplayed();
    }

}
