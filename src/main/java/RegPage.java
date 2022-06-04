import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage {
    public WebDriver driver;

    public RegPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'signupform-username')]")
    private WebElement loginField;
    @FindBy(xpath = "//*[contains(@id, 'signupform-password')]")
    private WebElement passwdField;
    @FindBy(xpath = "//*[contains(@id, 'signupform-email')]")
    private WebElement emailField;
    @FindBy(xpath = "//*[contains(@class, 'checkbox-inline grey')]")
    private  WebElement checkbox;
    @FindBy(xpath = "//*[contains(@id, 'signup_btn')]")
    private WebElement regButton;

    public void  inputEmail(String email){
        emailField.sendKeys(email);
    }
    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPasswd(String password) {
        passwdField.sendKeys(password);
    }

    public void clickCheckbox(){checkbox.click();}

    public void clickRegButton() {
        regButton.click();
    }

}