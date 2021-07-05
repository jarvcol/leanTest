package pageObjects.checkoutPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BasePage;

public class CheckOutOverviewPage extends BasePage {

    public CheckOutOverviewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="finish")
    private WebElement finishButton;

    public void clickOnFinishButton(){
        getWait().until(ExpectedConditions.visibilityOf(finishButton));
        finishButton.click();
    }
}
