package ru.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

/**
 * Базовый класс, содержащий общую реализацию
 */
public class Page {
    WebDriver driver;
    WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public void waitVisibility(By element) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }

    public void click(By element) {
        waitVisibility(element);
        driver.findElement(element).click();
    }

    public void sendKeys(By element, String s) {
        waitVisibility(element);
        driver.findElement(element).sendKeys(s);
    }

    public void isElementDisplayed(By element) {
        waitVisibility(element);
        assertTrue(driver.findElement(element).isDisplayed());
    }
}
