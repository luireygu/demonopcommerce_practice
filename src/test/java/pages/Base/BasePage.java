package pages.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverController;

import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;


    protected BasePage(){
        this.driver = DriverController.getDriver();
        this.wait = DriverController.getWait();
    }

    public void navigateto(String url){
        driver.get(url);
    }

    protected WebElement waitClickable(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    protected void click(By locator){
        waitClickable(locator).click();

    }
    protected List<WebElement> waitPresentElements(By locator) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
    protected List<String> getTextsElements(By locator){
        return  waitPresentElements(locator).stream().map(WebElement::getText).toList();
        //return elements.stream().map(WebElement::getText).toList();
    }


}
