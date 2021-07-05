package util;

import org.openqa.selenium.WebDriver;
import pageObjects.checkoutPages.CheckOutConfirmationPage;
import pageObjects.checkoutPages.CheckOutInfoPage;
import pageObjects.HomePage;
import pageObjects.ProductsPage;
import pageObjects.CartPage;
import pageObjects.checkoutPages.CheckOutOverviewPage;

public class PageObjectManager {
    private WebDriver driver;

    private HomePage homePage;
    private ProductsPage productsPage;
    private CheckOutInfoPage checkOutInfoPage;
    private CartPage cartPage;
    private CheckOutOverviewPage checkOutOverviewPage;
    private CheckOutConfirmationPage checkOutConfirmationPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public ProductsPage getProductsPage() {
        return (productsPage == null) ? productsPage = new ProductsPage(driver) : productsPage;
    }

    public CheckOutInfoPage getCheckOutInfoPage() {
        return (checkOutInfoPage == null) ? checkOutInfoPage = new CheckOutInfoPage(driver) : checkOutInfoPage;
    }

    public CheckOutOverviewPage getCheckOutOverviewPage() {
        return (checkOutOverviewPage == null) ? checkOutOverviewPage = new CheckOutOverviewPage(driver) : checkOutOverviewPage;
    }

    public CheckOutConfirmationPage getCheckOutConfirmationPage() {
        return (checkOutConfirmationPage == null) ? checkOutConfirmationPage = new CheckOutConfirmationPage(driver) : checkOutConfirmationPage;
    }

    public CartPage getCartPagePage() {
        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }
}
