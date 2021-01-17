package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountPage extends BasePage{

    public MyAccountPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="a.account[title='View my customer account']")
    private WebElement myAccountButton;

    //Valida Methods
    public boolean userIsAtMyAccountPage(){
        getWait().until(ExpectedConditions.visibilityOf(myAccountButton));
        return super.isElementVisible(myAccountButton) && getDriver().getTitle().contains("My account");
    }
}
