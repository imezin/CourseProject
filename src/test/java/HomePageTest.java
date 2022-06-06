import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class HomePageTest {
    public static HomePage homePage;
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("homepage"));
        driver.findElement(By.xpath("//*[contains(@class, 'Button-module--button--CU-kq Button-module--sizeSM--eCtqi CookiesPolicy-module--button--JZrW1')]")).click();
    }

    @After
    public void close() {
        driver.quit();
    }

    @Feature(value = "Проверка кнопок на странице Home")
    @Test
    public void HomePageSpecialistTest() {
        {
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.xpath(homePage.specialistsBlock)));
            Assert.assertTrue(driver.findElement(By.xpath(homePage.specialistButton)).getText().contains("Our related specialists"));
            driver.findElement(By.xpath(homePage.specialistButton)).click();
            driver.getCurrentUrl().contains("https://andersenlab.com/pricing");
        }
    }

    @Link(name = "Аndersenlab", url = "https://andersenlab.com/")
    @Test
    @Owner(value = "Mezin")
    public void HomePageCalculate() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(homePage.calculateBlock)));
        Assert.assertTrue(driver.findElement(By.xpath(homePage.calculateBlock)).getText().contains("With numerous IT projects delivered, we can provide a detailed estimate for your IT initiative"));
        driver.findElement(By.xpath(homePage.calculateButton)).click();
        driver.getCurrentUrl().contains("https://andersenlab.com/pricing");
    }
}