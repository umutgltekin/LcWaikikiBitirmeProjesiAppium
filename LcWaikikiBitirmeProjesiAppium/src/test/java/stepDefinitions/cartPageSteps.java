package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.cartPage;
import util.DriverFactory;

public class cartPageSteps {
    cartPage cartpage=new cartPage(DriverFactory.getDriver());

    @Then("check cart page")
    public void checkCartPage() {
        cartpage.checkCartPage();
    }

    @Then("check product size {string}")
    public void checkProductSize(String size) {
        cartpage.checkProductSize(size);
    }

    @Then("check product name {string}")
    public void checkProductName(String name) {
        cartpage.checkProductName(name);
    }
    @When("click go payment page button")
    public void clickButton() {
        cartpage.clickPaymentPageButton();
    }

    @Then("check product number of {int}.")
    public void checkProductNumberOf(int nummberOf) {
        cartpage.checkProductNummberOf(nummberOf);
    }
}
