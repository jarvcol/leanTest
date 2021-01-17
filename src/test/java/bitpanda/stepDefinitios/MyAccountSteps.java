package bitpanda.stepDefinitios;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import util.TestContext;

public class MyAccountSteps {

    TestContext testContext;
    MyAccountPage myAccountPage;

    public MyAccountSteps(TestContext testContext) {
        this.testContext = testContext;
        this.myAccountPage = testContext.getPageObjectManager().getMyAccountPage();
    }

    @Then("User lands on MyAccount page")
    public void userLandsOnMyAccountPage() {
        Assert.assertTrue("User is not at My Account Page", myAccountPage.userIsAtMyAccountPage());
    }

}
