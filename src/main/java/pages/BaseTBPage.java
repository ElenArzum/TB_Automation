package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class BaseTBPage extends BasePage {
    Duration timeout = Duration.ofSeconds(10);

    public BaseTBPage(WebDriver driver) {
        super.driver = driver;
    }
    private static final By LIBRARIES_MENU = By.id("libraries");
    private static final By MICRO_BLOCK_LIST_PAGE = By.xpath("//*[contains(text(),'Micro Block')]");

    public void openMicroBlockLibPage() throws InterruptedException {
        waitForElement(10, LIBRARIES_MENU);
        moveToElementWithTarget(LIBRARIES_MENU);
        Thread.sleep(200);
        waitForElement(10, MICRO_BLOCK_LIST_PAGE);
        clickOnVisibleElement(MICRO_BLOCK_LIST_PAGE);

    }

}
