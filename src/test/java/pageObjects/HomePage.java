package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.UrlSetUp;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Page Elements
    @FindBy(css=".login")
    private WebElement loginButton;

    @FindBy(id="search_query_top")
    private WebElement searchInputBox;

    @FindBy(css="button[name=submit_search]")
    private WebElement searchButton;

    public void goToHomePage(){
        super.NavigateTo(UrlSetUp.getUrl()+"/index.php");
    }

    public void clickOnLoginButton(){
        getWait().until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public void writeToSearchInputBox(String searchTerm){
        getWait().until(ExpectedConditions.visibilityOf(searchInputBox));
        searchInputBox.clear();
        searchInputBox.sendKeys(searchTerm);
    }

    public void clickOnSearchButton(){
        getWait().until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();
    }

}
