package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ShoppingSummaryPage extends BasePage {

    public ShoppingSummaryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="#cart_summary tbody tr")
    private List<WebElement> cartSummaryProductList;

    public boolean cartProductsListCount(int expectedCount){
        getWait().until(ExpectedConditions.visibilityOfAllElements(cartSummaryProductList));
        return cartSummaryProductList.size() == expectedCount;
    }
}
