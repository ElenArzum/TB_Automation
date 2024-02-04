package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {
 WebDriver driver;
    Duration timeout = Duration.ofSeconds(30);
    public void openURL(){

    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
    public void clickOnElement(By locator){
        getElement(locator).click();
    }
    WebElement getVisibleElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    WebElement getClickableElement(By locator){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void moveToElementWithTarget(By locator) {
        Actions action = new Actions(driver);
        action.moveToElement(getElement(locator)).perform();
    }
    public void clickOnVisibleElement(By locator){
        getVisibleElement(locator).click();
    }
    public boolean isCheckboxSelected(By locator){

        return getVisibleElement(locator).isSelected();
    }

    public void setCheckboxState(By locator,boolean check) {
        if(isCheckboxSelected(locator) != check){
            clickOnElement(locator);
        }
    }
    public void sendKeysOnElement(By locator, String name) {
        getElement(locator).sendKeys(name);
    }
    public String getTextfromElement(By locator) {
        return getElement(locator).getText();
    }
    public void setValues(By locator,String name){
        clickOnElement(locator);
        sendKeysOnElement(locator,name);
    }
    public void selectOptionByText(By locator, String text) {
        Select drop = new Select(getElement(locator));
        drop.selectByVisibleText(text);
    }

    public void dragAndDrop(By locator, By locator2){
        Actions action = new Actions(driver);
        action.dragAndDrop(getElement(locator),getElement(locator)).build().perform();
    }
    public void clickJS(){
        WebElement dropdown = driver.findElement(By.xpath("//div[@id='heading_standard_fields']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", dropdown);
    }
    public void doubleClick(By locator){
        Actions action = new Actions(driver);
        action.doubleClick().perform();
    }
    public void holdAndDrag(By locator, By locator2){
        Actions actions = new Actions(driver);
        actions.clickAndHold(getElement(locator)).moveToElement(getElement(locator2)).release().build().perform();
    }


}

