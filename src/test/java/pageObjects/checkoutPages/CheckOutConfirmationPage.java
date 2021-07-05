package pageObjects.checkoutPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BasePage;

public class CheckOutConfirmationPage extends BasePage {

    public CheckOutConfirmationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="div.complete-text")
    private WebElement checkOutMessage;

    @FindBy(id="back-to-products")
    private WebElement backHomeButton;

    public boolean checkOutIsCompleted(){
        getWait().until(ExpectedConditions.visibilityOf(backHomeButton));
        return checkOutMessage.getText().contains("Your order has been dispatched, and will arrive just as fast as the pony can get there!");
    }
}
