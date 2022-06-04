import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegTest {
    public static RegPage regPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        regPage = new RegPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("regpage"));
    }

    @Test
    public void RegTest() {
        {
            regPage.inputLogin(ConfProperties.getProperty("login"));
            regPage.inputPasswd(ConfProperties.getProperty("password"));
            regPage.inputEmail(ConfProperties.getProperty("email"));
            regPage.clickCheckbox();
            regPage.clickRegButton();

        }
    }
}