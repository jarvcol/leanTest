package pageObjects.searchpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BasePage;
import util.PageObjectManager;

import java.util.List;

public class SearchMainPage extends BasePage {

    private SearchToolsPage searchToolsPage;

    public SearchMainPage(WebDriver driver, PageObjectManager pageObjectManager){
        super(driver);
        searchToolsPage = pageObjectManager.getSearchToolsPage();
        PageFactory.initElements(driver, this);
    }

    //Page Elements
    @FindBy(css="h1.page-heading.product-listing")
    private WebElement searchMainTitle;

    @FindBy(css="#center_column ul.product_list.grid.row li div.product-container")
    private List<WebElement> gridSearchResults;

    @FindBy(css="a[title='View my shopping cart']")
    private WebElement viewShoppingCartButton;

    @FindBy(css="span[title='Continue shopping']")
    private WebElement continueShoppingButton;

    private String addToCartHoverButton = "a.button.ajax_add_to_cart_button.btn.btn-default[title='Add to cart']";

    public void addFirstProductToCart(){
        getWait().until(ExpectedConditions.visibilityOfAllElements(gridSearchResults));
        Actions action = new Actions(getDriver());
        action.moveToElement(gridSearchResults.get(0)).moveToElement(
                getDriver().findElement(By.cssSelector(addToCartHoverButton))).click().build().perform();
    }

    public void clickOnViewCartButton(){
        getWait().until(ExpectedConditions.visibilityOf(viewShoppingCartButton));
        viewShoppingCartButton.click();
    }

    public void clickOnContinueShoppingButton(){
        getWait().until(ExpectedConditions.visibilityOf(continueShoppingButton));
        continueShoppingButton.click();
    }

    public boolean viewCartButtonProductsCount(int amount){
        getWait().until(ExpectedConditions.visibilityOf(viewShoppingCartButton));
        return viewShoppingCartButton.getText().toLowerCase().contains(amount+" product");
    }

    public Boolean searchMainTitleContains(String searchTerm){
        getWait().until(ExpectedConditions.visibilityOf(searchMainTitle));
        return searchMainTitle.getText().toLowerCase().contains(searchTerm.toLowerCase());
    }

    public Boolean searchResultsGridNotEmpty(){
        getWait().until(ExpectedConditions.visibilityOfAllElements(gridSearchResults));
        return gridSearchResults.size() != 0;
    }

    public SearchToolsPage getSearchToolsPage(){
        return searchToolsPage;
    }
}
