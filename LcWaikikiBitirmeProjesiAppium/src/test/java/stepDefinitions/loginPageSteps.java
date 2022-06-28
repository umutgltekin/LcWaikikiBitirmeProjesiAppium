package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import util.DriverFactory;

public class loginPageSteps {
    loginPage loginpage=new loginPage(DriverFactory.getDriver());
    @Then("should see login page")
    public void shouldSeeLoginPage() {
        loginpage.shouldSeeLoginPage();
    }

    @When("enter Email {string}")
    public void enterEmail(String mail) {
        loginpage.enterEmail(mail);
    }

    @When("enter password {string}")
    public void enterPassword(String password) {
        loginpage.enterPassword(password);
    }

    @When("click Login page login button")
    public void clickButton() {
        loginpage.clickLoginpageButton();
    }
}
