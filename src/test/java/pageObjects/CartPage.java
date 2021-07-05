package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="checkout")
    private WebElement checkoutButton;

    public void clickOnCheckOutButton(){
        getWait().until(ExpectedConditions.visibilityOf(checkoutButton));
        checkoutButton.click();
    }
}
