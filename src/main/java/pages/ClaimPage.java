package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class ClaimPage extends BasePage {
    public ClaimPage(WebDriver driver) {
        super.driver = driver;
    }
    private static final By PROJECTS_LIST = By.xpath("//*[@id=\"projectsContent\"]");
    private static final By TB_PROJECT = By.xpath("//*[contains(text(),'Template Builder')]");


    public void chooseProject(){
        clickOnElement(PROJECTS_LIST);
        waitForElement(10, PROJECTS_LIST);
        Actions builder = new Actions(driver);
        //move cursor to "Projects"
        WebElement projects = driver.findElement(By.xpath("//*[@id=\"projectsContent\"]"));
        builder.moveToElement(projects).perform();
        //Thread.sleep(500);

        waitForElement(10, TB_PROJECT);
        driver.findElement(By.xpath("//*[contains(text(),'Template Builder')]")).click();
        // switch to next tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}

