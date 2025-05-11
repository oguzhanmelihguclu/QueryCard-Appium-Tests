package stepDefinitions;

import config.ConfigReader;
import drivers.BrowserDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pagesBrowser.BrowserPage;


public class Browser_Step {

    BrowserPage browserPage = new BrowserPage();

    @Given("[browser] The user goes to the {string} page.")
    public void browser_the_user_goes_to_the_page(String url) throws InterruptedException {
        BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty(url));
        Thread.sleep(2);
    }

    @Given("[browser] The user logs in by entering their credentials, including {string} and {string}.")
    public void browser_the_user_logs_in_by_entering_their_credentials_including_and(String mail, String password) throws InterruptedException {

        browserPage.browserLogin(mail, password);
        Thread.sleep(2);
    }

    @Then("[browser] The user sees the Categories heading on the homepage.")
    public void browser_the_user_sees_the_categories_heading_on_the_homepage() throws InterruptedException {
        Assert.assertTrue(browserPage.browserCategoriesText.isDisplayed());
        Thread.sleep(2);
    }

    @Then("[browser] The user gets logged out.")
    public void browser_the_user_gets_logged_out() throws InterruptedException {
        browserPage.browserLogout();

    }
}
