import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    // елементы блока Expert custom solutions with over 1000+ projects delivered
    String specialistsBlock = "//*[contains(@class, 'CvSlider-module--wrapper--edKvT')]";
    String specialistButton = "//*[contains(@class, 'CvSlider-module--link--zBqmU')]";
    String calculateBlock = "//*[contains(@class, 'Alert-module--content--HVtj2 Alert-module--fontSizelg--2gpXR')]";
    String calculateButton= "//*[contains(@class, 'Alert-module--buttonWrapper--rODLe')]";

}