import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FailRegTest {
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
    public void RegFailLogTest() {
        {
            regPage.inputEmail(ConfProperties.getProperty("email"));
            regPage.clickRegButton();
            Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@class, 'form-group field-signupform-username required has-error')]")).getText().contains("Необходимо заполнить «Логин»."));
        }
    }
}
