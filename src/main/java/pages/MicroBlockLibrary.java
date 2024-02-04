package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class MicroBlockLibrary extends BasePage{
    Duration timeout = Duration.ofSeconds(10);

    public MicroBlockLibrary (WebDriver driver) {
        super.driver = driver;
    }

    private static final By ADD_NEW_MICRO = By.xpath("//*[@id=\"addNewMicroBlockLink\"]");
    public void addNewMicro() throws InterruptedException {
        Thread.sleep(200);
        waitForElement(10, ADD_NEW_MICRO);
        clickOnElement(ADD_NEW_MICRO);
    }
}
