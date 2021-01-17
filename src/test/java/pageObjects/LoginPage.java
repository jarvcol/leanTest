package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Page Elements
    @FindBy(id="SubmitLogin")
    private WebElement loginButton;

    //Validation Methods
    public boolean isUserNameInputVisible(){
        getWait().until(ExpectedConditions.visibilityOf(loginButton));
        return super.isElementVisible(loginButton) && getDriver().getTitle().contains("Login - My Store");
    }
}
