package pageObjects.searchpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BasePage;

import java.util.List;

public class SearchToolsPage extends BasePage {

    //Left Side Search Tools

    public SearchToolsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //BestSeller block
    //Page Elements
    @FindBy(css="#best-sellers_block_right li")
    private List<WebElement> topSellerList;

    @FindBy(css="a[title='All best sellers']")
    private WebElement allTopSellerButton;

    public Boolean bestSellerListNotEmpty(){
        getWait().until(ExpectedConditions.visibilityOfAllElements(topSellerList));
        return topSellerList.size() != 0;
    }


    //Categories block
    //Page Elements
    private String categoryLinkLocator = "//div[@id='categories_block_left']//ul[@style='display: block;']//a[contains(text(), '{term}')]";
    private WebElement categoryLink;

    public void clickOnCategoryLink(String searchText){
        getCategoryLinkElement(searchText);
        getWait().until(ExpectedConditions.visibilityOf(categoryLink));
        categoryLink.click();
    }

    private void getCategoryLinkElement(String searchText){
        categoryLink = getDriver().findElement(By.xpath(categoryLinkLocator.replace("{term}",searchText)));
    }



}
