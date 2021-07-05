package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    private String addToCartPartialLocator = ".//button[contains(@id,'add-to-cart-sauce-labs')]";

    private String sortButtonSelectLocator = ".//select[@data-test='product_sort_container']";

    @FindBy(css="a.shopping_cart_link")
    private WebElement shoppingCartLink;

    public void selectSortingOption(String sortOption){
        getWait().until(ExpectedConditions.visibilityOfAllElements(getDriver().findElements(By.xpath(addToCartPartialLocator))));
        Select sortButtonSelect = new Select(getDriver().findElement(By.xpath(sortButtonSelectLocator)));
        sortButtonSelect.selectByIndex(getOptionIndex(sortOption));
    }

    public void clickOnShoppingCartLink(){
        getWait().until(ExpectedConditions.visibilityOf(shoppingCartLink));
        shoppingCartLink.click();
    }

    public void addFirstProductToCart(){
        List<WebElement> addToCartButtons = getDriver().findElements(By.xpath(addToCartPartialLocator));
        getWait().until(ExpectedConditions.visibilityOfAllElements(addToCartButtons));
        addToCartButtons.get(0).click();
    }

    public boolean userIsAtInventoryPage(){
        return getDriver().getCurrentUrl().contains("inventory");
    }

    private int getOptionIndex(String sortOption){
        switch(sortOption){
            case "Name (A to Z)":
                return 0;
            case "Name (Z to A)":
                return 1;
            case "Price (low to high)":
                return 2;
            case "Price (high to low)":
                return 3;
            default:
                return 0;
        }
    }
}
