package leanTechTest.stepDefinitios;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import util.FileReaderManager;
import util.TestContext;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext testContext) {
        this.testContext = testContext;
        this.homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("a web browser is at the saucedemo homepage")
    public void userOpensHomePage() {
        homePage.goToHomePage();
    }

    @When("the user performs a successful login")
    public void userPerformsLogin() {
        homePage.performLogin(FileReaderManager.getInstance().getTestDataFileReader().getDefaultUser(),
                FileReaderManager.getInstance().getTestDataFileReader().getDefaultPassword());
    }

    @Given("user has login successfully on saucedemo")
    public void userHasLoginSuccessfully() {
        this.userOpensHomePage();
        this.userPerformsLogin();
    }
}
