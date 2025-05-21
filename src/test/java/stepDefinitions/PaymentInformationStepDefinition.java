package stepDefinitions;

import drivers.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.PaymentInformationPage;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static drivers.Driver.getAppiumDriver;

public class PaymentInformationStepDefinition {


    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    Actions actions = new Actions(getAppiumDriver());


    @Then("Click on the product to go to the page")
    public void click_on_the_product_to_go_to_the_page() {

        paymentInformationPage.firstProduct.click();
    }

    @Then("He chooses the size of the product he wants")
    public void heChoosesTheSizeOfTheProductHeWants() throws InvalidMidiDataException {

        ReusableMethods.wait(3);
        paymentInformationPage.size.click();
        ReusableMethods.wait(2);
        ReusableMethods.dikeyKaydirma(Driver.getAppiumDriver(),0.70,0.30,0.50,100);
    }

    @And("Product setepe adds")
    public void productSetepeAdds() {

        paymentInformationPage.AddToCartButton.click();
    }

    @And("Goes to the cart by clicking on the cart icon")
    public void goesToTheCartByClickingOnTheCartIcon() {

        paymentInformationPage.shoppingCartIcon.click();
    }

    @And("Confirms that you are directed to the basket")
    public void confirmsThatYouAreDirectedToTheBasket() {

        Assert.assertTrue( paymentInformationPage.proceedToCheckoutButton.isDisplayed());

    }

    @And("Confirms that you are click to the basket")
    public void confirmsThatYouAreClickToTheBasket() {

        paymentInformationPage.proceedToCheckoutButton.click();
    }


    @And("Confirms that there is a shipping Information page")
    public void confirmsThatThereIsAShippingInformationPage() {

        Assert.assertTrue(paymentInformationPage.Address.isDisplayed());
    }

    @And("User selects the address")
    public void userSelectsTheAddress() throws InvalidMidiDataException {

        paymentInformationPage.Address.click();
        ReusableMethods.wait(2);
        ReusableMethods.dikeyKaydirma(Driver.getAppiumDriver(),0.70,0.30,0.50,100);

    }

    @And("confirms that there is a save pay button")
    public void confirmsThatThereIsASavePayButton() {

        Assert.assertTrue(paymentInformationPage.savePayButton.isDisplayed());

    }

    @And("Confirms that is click save pay button")
    public void confirmsThatIsClickSavePayButton() {

        paymentInformationPage.savePayButton.click();

    }


    @And("Verifies the existence of the Payment Information page")
    public void verifiesTheExistenceOfThePaymentInformationPage() {

        Assert.assertTrue(paymentInformationPage.stripeIcon.isDisplayed());
    }

    @And("Confirm Order button is confirmed")
    public void confirmOrderButtonIsConfirmed() {

        Assert.assertTrue(paymentInformationPage.confirmOrderButton.isDisplayed());
    }

    @And("Confirm Order button click")
    public void confirmOrderButtonClick() {

        paymentInformationPage.confirmOrderButton.click();
        ReusableMethods.wait(8);
    }

    @And("Confirm that the Confirm button is displayed")
    public void confirmThatTheConfirmButtonIsDisplayed() {

       Assert.assertTrue( paymentInformationPage.confirmButton.isDisplayed());
    }

    @Then("Clicks on the S")
    public void clicksOnTheS() {

        paymentInformationPage.stripeIcon.click();
    }


    @Then("Enter valid {string} {string} {string} and {string} in card textbox")
    public void enterValidAndInCardTextbox(String cartNumber, String cardDate, String cvcCode, String zipCodde) {

        paymentInformationPage.StripeCardIntroduction(cartNumber,cardDate,cvcCode,zipCodde);


    }

    @And("Confirm by clicking on the button")
    public void confirmByClickingOnTheButton() {
        ReusableMethods.wait(2);
        paymentInformationPage.confirmButton.click();

        ReusableMethods.wait(9);
        Assert.assertTrue(paymentInformationPage.orderMessage.isDisplayed());
    }

    @And("Clicks on the order details button")
    public void clicksOnTheOrderDetailsButton() {

        paymentInformationPage.orderDetailsButton.click();
    }

    @And("Clicks on the goToShoppingButton button")
    public void clicksOnTheGoToShoppingButtonButton() {

        ReusableMethods.wait(2);
        paymentInformationPage.goToShoppingButton.click();

    }
}
