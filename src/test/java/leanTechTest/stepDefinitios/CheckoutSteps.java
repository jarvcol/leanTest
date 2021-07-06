package leanTechTest.stepDefinitios;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.CartPage;
import pageObjects.checkoutPages.CheckOutConfirmationPage;
import pageObjects.checkoutPages.CheckOutInfoPage;
import pageObjects.checkoutPages.CheckOutOverviewPage;
import util.FileReaderManager;
import util.TestContext;

public class CheckoutSteps {

    TestContext testContext;
    CartPage cartPage;
    CheckOutInfoPage checkOutInfoPage;
    CheckOutOverviewPage checkOutOverviewPage;
    CheckOutConfirmationPage checkOutConfirmationPage;

    public CheckoutSteps(TestContext testContext) {
        this.testContext = testContext;
        this.cartPage = testContext.getPageObjectManager().getCartPagePage();
        this.checkOutInfoPage = testContext.getPageObjectManager().getCheckOutInfoPage();
        this.checkOutOverviewPage = testContext.getPageObjectManager().getCheckOutOverviewPage();
        this.checkOutConfirmationPage = testContext.getPageObjectManager().getCheckOutConfirmationPage();
    }

    @Then("browser shows the order confirmation page")
    public void userIsInProductsPage() {
        Assert.assertTrue("User did not completed the checkout process", checkOutConfirmationPage.checkOutIsCompleted());
    }

    @When("user completes the checkout process")
    public void userCompletesCheckoutProcess() {
        cartPage.clickOnCheckOutButton();
        checkOutInfoPage.writeToFirstName(FileReaderManager.getInstance().getTestDataFileReader().getDefaultName());
        checkOutInfoPage.writeToLastName(FileReaderManager.getInstance().getTestDataFileReader().getDefaultLastName());
        checkOutInfoPage.writeToZipCodeInput(FileReaderManager.getInstance().getTestDataFileReader().getDefaultZipCode());
        checkOutInfoPage.clickOnContinueButton();
        checkOutOverviewPage.clickOnFinishButton();
    }

}
