package cucumber.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductCatalogStepDefinition {

    @Given("Sally is  on the home page")
    public void sallyIsOnTheHomePage() {

    }
    @When("she searches for {string}")
    public void sheSearchesFor(String searchTerm) {

    }
    @Then("the {string} product should be displayed")
    public void theProductShouldBeDisplayed(String productName) {

    }
}
