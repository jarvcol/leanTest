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
    @FindBy(id="login-button")
    private WebElement loginButton;

    @FindBy(id="user-name")
    private WebElement userNameInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    public void goToHomePage(){
        super.NavigateTo(UrlSetUp.getUrl());
    }

    public void clickOnLoginButton(){
        getWait().until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public void writeToUserNameInput(String userName){
        getWait().until(ExpectedConditions.visibilityOf(userNameInput));
        userNameInput.clear();
        userNameInput.sendKeys(userName);
    }

    public void writeToPasswordInput(String userPassword){
        getWait().until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.clear();
        passwordInput.sendKeys(userPassword);
    }

    public void performLogin(String userName, String userPassword){
        writeToUserNameInput(userName);
        writeToPasswordInput(userPassword);
        clickOnLoginButton();
    }

}
