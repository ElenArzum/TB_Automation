package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage{
    public LogInPage(WebDriver driver) {
        super.driver = driver;
    }
    String username = ("elen_a@test.com");
    String password = ("");
    private static final By EMAIL_FIELD =By.xpath("//*[@id=\"username\"]");
    private static final By PASSWORD_FIELD = By.xpath("//*[@id=\"password\"]");
    private static final By SUBMIT_BUTTON = By.xpath("//*[@id=\"btnSignIn\"]");

    public void openURL(){
        driver.get("https://dev-claims.tech-suite.com/login?0");
    }
    public void Login(){
        sendKeysOnElement(EMAIL_FIELD,username);
        sendKeysOnElement(PASSWORD_FIELD,password);
        clickOnElement(SUBMIT_BUTTON);

    }
}
