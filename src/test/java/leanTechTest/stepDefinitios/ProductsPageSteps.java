package leanTechTest.stepDefinitios;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.ProductsPage;
import util.TestContext;

public class ProductsPageSteps {

    TestContext testContext;
    ProductsPage productsPage;

    public ProductsPageSteps(TestContext testContext) {
        this.testContext = testContext;
        this.productsPage = testContext.getPageObjectManager().getProductsPage();
    }

    @Then("the products listing page is shown")
    public void userIsInProductsPage() {
        Assert.assertTrue("User did not landed in products page", productsPage.userIsAtInventoryPage());
    }

    @When("user selects (.*) sorting option")
    public void userSelectsSortingOption(String sortType) {
        productsPage.selectSortingOption(sortType);
    }

    @When("user selects the first article")
    public void userSelectTheFirstArticle() {
        productsPage.addFirstProductToCart();
    }

    @When("user goes to the cart")
    public void userGoesToTheCart() {
        productsPage.clickOnShoppingCartLink();
    }
}
