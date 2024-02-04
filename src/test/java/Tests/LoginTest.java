package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ClaimPage;
import pages.LogInPage;

public class LoginTest extends BaseTest {

    @Test
    void loginTest() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.openURL();
        logInPage.Login();
        ClaimPage claimPage = new ClaimPage(driver);
        claimPage.chooseProject();
    }
}
