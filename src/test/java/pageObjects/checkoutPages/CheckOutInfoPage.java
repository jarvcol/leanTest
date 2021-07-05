package pageObjects.checkoutPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BasePage;

import java.util.List;

public class CheckOutInfoPage extends BasePage {

    public CheckOutInfoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="first-name")
    private WebElement firstNameInput;

    @FindBy(id="last-name")
    private WebElement lastNameInput;

    @FindBy(id="postal-code")
    private WebElement zipCodeInput;

    @FindBy(id="continue")
    private WebElement continueButton;

    public void writeToFirstName(String firstName){
        getWait().until(ExpectedConditions.visibilityOf(firstNameInput));
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
    }
    public void writeToLastName(String lastName){
        getWait().until(ExpectedConditions.visibilityOf(lastNameInput));
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }
    public void writeToZipCodeInput(String zipCode){
        getWait().until(ExpectedConditions.visibilityOf(zipCodeInput));
        zipCodeInput.clear();
        zipCodeInput.sendKeys(zipCode);
    }

    public void clickOnContinueButton(){
        getWait().until(ExpectedConditions.visibilityOf(continueButton));
        continueButton.click();
    }
}
