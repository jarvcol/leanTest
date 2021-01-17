package bitpanda.stepDefinitios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.searchpages.SearchMainPage;
import util.TestContext;

public class SearchSteps {

    TestContext testContext;
    SearchMainPage searchMainPage;

    public SearchSteps(TestContext testContext) {
        this.testContext = testContext;
        this.searchMainPage = testContext.getPageObjectManager().getSearchMainPage();
    }

    @Then("Site displays the search (.*) used")
    public void siteDisplaysTheSearchTermUsed(String searchTerm) {
        Assert.assertTrue("User search term is not displayed", searchMainPage.searchMainTitleContains(searchTerm));
    }

    @And("Results from search are shown in grid mode")
    public void resultsFromSearchAreShownInGridMode() {
        Assert.assertTrue("Grid results is not shown or empty", searchMainPage.searchResultsGridNotEmpty());
    }

    @And("Search tools are shown on the side")
    public void searchToolsAreShownOnTheSide() {
        Assert.assertTrue("Best selling list not empty", searchMainPage.getSearchToolsPage().bestSellerListNotEmpty());
    }

    @And("User adds directly one of the results to the cart")
    public void userAddsDirectlyOneOfTheResultsToTheCart() {
        searchMainPage.addFirstProductToCart();
    }

    @When("User click on view cart button")
    public void userClickOnViewCartButton() {
        searchMainPage.clickOnViewCartButton();
    }

    @Then("Cart shows that there is one product in the list")
    public void cartShowsThatThereIsOneProductInTheList() {
        Assert.assertTrue("View cart button not showing correct amount of products", searchMainPage.viewCartButtonProductsCount(1));
    }

    @And("User selects to continue shopping")
    public void userSelectsToContinueShopping() {
        searchMainPage.clickOnContinueShoppingButton();
    }
}
