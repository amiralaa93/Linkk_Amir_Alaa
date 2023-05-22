package BasePackage;

import Utilities.TimeUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import static BasePackage.BaseTest.driver;
import static Utilities.LoadProperties.dataProperty;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(driver,this);
    }
    public static WebElement getElement(By locator) {
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println("Some exception occured while creating webelement " + locator);
        }
        return element;
    }
    public static boolean elementIsDisplayed(WebElement element) {
        TimeUtils.waitElement(element,15);
        return element.isDisplayed();
    }
    public static String getText(WebElement element) {
        return element.getText();
    }
    public static void elementClick(WebElement element) {
        element.click();
    }
}
