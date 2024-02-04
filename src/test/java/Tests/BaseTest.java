package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.ClaimPage;
import pages.LogInPage;

public class BaseTest {

    WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    void loginTest() {
        driver.manage().window().maximize();
        LogInPage logInPage = new LogInPage(driver);
        logInPage.openURL();
        logInPage.Login();
        ClaimPage claimPage = new ClaimPage(driver);
        claimPage.chooseProject();
    }
}


