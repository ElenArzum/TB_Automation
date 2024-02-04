package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;


public class MicroBlockTest extends BaseTest{
    @Test
    void DropDownTest() throws InterruptedException {
        BaseTBPage baseTBPage = new BaseTBPage(driver);
        baseTBPage.openMicroBlockLibPage();

        MicroBlockLibrary microBlockLibrary = new MicroBlockLibrary(driver);
        microBlockLibrary.addNewMicro();

        MicroBlockEditPage microBlockEditPage = new MicroBlockEditPage(driver);
        microBlockEditPage.addDropElementInMicro();

    }
}
