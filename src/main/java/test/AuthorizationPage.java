package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {
    public WebDriver driver;

    public AuthorizationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'user-identifier-input')]")
    private WebElement loginField;
    @FindBy(xpath = "//*[contains(@id, 'password-input')]")
    private WebElement passwdField;
    @FindBy(xpath = "//*[contains(@id, 'submit-button')]")
    private WebElement logButton;

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPasswd(String password) {
        passwdField.sendKeys(password);
    }

    public void clickLogButton() {
        logButton.click();
    }

}
