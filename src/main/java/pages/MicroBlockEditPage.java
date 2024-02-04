package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class MicroBlockEditPage extends BasePage{
    Duration timeout = Duration.ofSeconds(10);
    public MicroBlockEditPage (WebDriver driver) {
        super.driver = driver;
    }
    private static final By ADD_MICRO_BLOCK_NAME = By.xpath("//*[@id=\"microBlockName\"]");
    private static final By PREVIEW_BUTTON = By.xpath("//*[@id=\"previewBtn\"]");
    private static final By SAVE_BUTTON = By.xpath("//*[@id=\"saveBtn\"]");
    private static final By BACK_BUTTON = By.xpath("//*[@id=\"backBtn\"]");
    private static final By ADD_API_FROM_MICRO = By.xpath("//*[@id=\"apiCallPageButton73d\"]");
    private static final By STANDARD_FIELD_SIDEBAR = By.xpath("//div[@id='heading_standard_fields']");
    private static final By DROPDOWN_ELEMENT = By.xpath("//div[contains(text(),'Dropdown')]");
    private static final By ROW_ELEMENT = By.xpath("//*[@id=\"micro_row_lv_1_0\"]");
    private static final By UPLOAD_BUTTON = By.xpath("//*[@id=\"dropDownItemsUploadField\"]");
    public void addMicroName() throws InterruptedException {
        Thread.sleep(200);
        waitForElement(10, ADD_MICRO_BLOCK_NAME);
        sendKeysOnElement(ADD_MICRO_BLOCK_NAME,"Dropdown_Automation");
    }
    public void openStandardFields() throws InterruptedException {
        moveToElementWithTarget(STANDARD_FIELD_SIDEBAR);
        System.out.println("Clicking on dropdown");
        clickOnElement(STANDARD_FIELD_SIDEBAR);
        clickOnElement(STANDARD_FIELD_SIDEBAR);
        System.out.println("Dropdown clicked");
        Thread.sleep(200);
    }
    public void drag(){
        moveToElementWithTarget(DROPDOWN_ELEMENT);
        holdAndDrag(DROPDOWN_ELEMENT,ROW_ELEMENT);
    }
    public void uplodFile(){
        moveToElementWithTarget(UPLOAD_BUTTON);
        clickOnElement(UPLOAD_BUTTON);
        String file = "C:\\Users\\User\\OneDrive\\Рабочий стол";
        sendKeysOnElement(UPLOAD_BUTTON,file);

    }
    public void addDropElementInMicro() throws InterruptedException {
        addMicroName();
        openStandardFields();
        drag();
        uplodFile();

    }

}
