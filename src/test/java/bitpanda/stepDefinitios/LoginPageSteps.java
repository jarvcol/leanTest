package bitpanda.stepDefinitios;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import pageObjects.LoginPage;
import util.TestContext;

import java.util.List;

public class LoginPageSteps {

    TestContext testContext;
    LoginPage loginPage;

    public LoginPageSteps(TestContext testContext) {
        this.testContext = testContext;
        this.loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Then("User lands on the login page")
    public void userIsAtLoginPage() {
        Assert.assertTrue("User is not at login page", loginPage.userIsAtLoginPage());
    }

    @When("User performs a SigIn with credentials")
    public void userPerformsLogin(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        loginPage.writeToEmailSignIn(data.get(1).get(0));
        loginPage.writeToPassSignIn(data.get(1).get(1));
        loginPage.clickOnSignInButton();
    }
}
