package bitpanda.stepDefinitios;


import cucumber.api.java.en.And;
import org.junit.Assert;
import pageObjects.ShoppingSummaryPage;
import util.TestContext;

public class ShoppingSummarySteps {

    TestContext testContext;
    ShoppingSummaryPage shoppingSummaryPage;

    public ShoppingSummarySteps(TestContext testContext) {
        this.testContext = testContext;
        shoppingSummaryPage = testContext.getPageObjectManager().getShoppingSummaryPage();
    }

    @And("Cart page shows one product in the product summary")
    public void cartPageShowsOneProductInTheProductSummary() {
        Assert.assertTrue("There are no products shown in the cart summary page", shoppingSummaryPage.cartProductsListCount(1));
    }
}
