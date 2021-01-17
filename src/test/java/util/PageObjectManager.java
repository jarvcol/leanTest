package util;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.ShoppingSummaryPage;
import pageObjects.searchpages.SearchMainPage;
import pageObjects.searchpages.SearchToolsPage;

public class PageObjectManager {
    private WebDriver driver;

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private SearchMainPage searchMainPage;
    private SearchToolsPage searchToolsPage;
    private ShoppingSummaryPage shoppingSummaryPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public MyAccountPage getMyAccountPage() {
        return (myAccountPage == null) ? myAccountPage = new MyAccountPage(driver) : myAccountPage;
    }

    public SearchMainPage getSearchMainPage() {
        return (searchMainPage == null) ? searchMainPage = new SearchMainPage(driver, this) : searchMainPage;
    }

    public SearchToolsPage getSearchToolsPage() {
        return (searchToolsPage == null) ? searchToolsPage = new SearchToolsPage(driver) : searchToolsPage;
    }

    public ShoppingSummaryPage getShoppingSummaryPage() {
        return (shoppingSummaryPage == null) ? shoppingSummaryPage = new ShoppingSummaryPage(driver) : shoppingSummaryPage;
    }
}
