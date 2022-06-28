package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.productPage;
import util.DriverFactory;

public class productPageSteps {
    productPage productpage = new productPage(DriverFactory.getDriver());
    @Then("should see products page")
    public void shouldSeeProductsPage() {
        productpage.shouldSeeProductsPage();
    }

    @When("click colour {string}")
    public void clickColour(String colour) {
        productpage.clickColour(colour);
    }

    @Then("should see product detail page")
    public void shouldSeeProductDetailPage() {
        productpage.shouldSeeProductDetailPage();
    }

    @When("click name LCW GRACE Bağlamalı Yaka Kadın Bluz")
    public void clickName() {
        productpage.clickName();
    }

    @When("click product size L")
    public void clickProductSize() {
        productpage.clickProductSize();
    }

    @When("click add cart")
    public void clickAddCart() {
        productpage.clickAddCart();
    }

    @When("click cart button")
    public void clickCartButton() {
        productpage.clickCartButton();
    }

    @When("click filter button")
    public void clickFilterButton() {
        productpage.clickFilterButton();
    }
}
