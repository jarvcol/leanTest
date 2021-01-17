package bitpanda.stepDefinitios;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObjects.LoginPage;
import util.TestContext;

public class LoginPageSteps {

    TestContext testContext;
    LoginPage loginPage;

    public LoginPageSteps(TestContext testContext) {
        this.testContext = testContext;
        this.loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Then("User lands on the login page")
    public void userIsAtLoginPage() {
        Assert.assertTrue("User is not at login page", loginPage.isUserNameInputVisible());
    }
}
