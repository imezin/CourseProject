package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class AuthorizationTest {
    public static AuthorizationPage authPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", org.example.ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        authPage = new AuthorizationPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(org.example.ConfProperties.getProperty("authpage"));
    }

    @Test
    public void AuthorizationTest() {
        authPage.inputLogin(org.example.ConfProperties.getProperty("login"));
        authPage.inputPasswd(org.example.ConfProperties.getProperty("password"));
        authPage.clickLogButton();
    }
}

