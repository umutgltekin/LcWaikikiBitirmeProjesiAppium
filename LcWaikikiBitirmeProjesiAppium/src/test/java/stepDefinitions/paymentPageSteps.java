package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.paymentPage;
import util.DriverFactory;

public class paymentPageSteps {
    paymentPage paymentpage=new paymentPage(DriverFactory.getDriver());

    @Then("check payment page")
    public void checkPaymentPage() {
        paymentpage.checkPaymentPage();
    }
}
