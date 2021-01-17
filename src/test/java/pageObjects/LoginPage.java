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
    private WebElement signInButton;

    @FindBy(id="email")
    private WebElement emailSignIn;

    @FindBy(id="passwd")
    private WebElement passSignIn;

    @FindBy(id="email_create")
    private WebElement emailCreateAcc;

    @FindBy(id="SubmitCreate")
    private WebElement createAccButton;

    //Action Methods
    public void writeToEmailSignIn(String email){
        getWait().until(ExpectedConditions.visibilityOf(emailSignIn));
        emailSignIn.clear();
        emailSignIn.sendKeys(email);
    }

    public void writeToPassSignIn(String password){
        getWait().until(ExpectedConditions.visibilityOf(passSignIn));
        passSignIn.clear();
        passSignIn.sendKeys(password);
    }

    public void clickOnSignInButton(){
        getWait().until(ExpectedConditions.visibilityOf(signInButton));
        signInButton.click();
    }

    public void writeToEmailCreation(String email){
        getWait().until(ExpectedConditions.visibilityOf(emailCreateAcc));
        emailCreateAcc.clear();
        emailCreateAcc.sendKeys(email);
    }

    public void clickOnCreateAccButton(){
        getWait().until(ExpectedConditions.visibilityOf(createAccButton));
        createAccButton.click();
    }

    //Validation Methods
    public boolean userIsAtLoginPage(){
        getWait().until(ExpectedConditions.visibilityOf(signInButton));
        return super.isElementVisible(signInButton) && getDriver().getTitle().contains("Login - My Store");
    }
}
