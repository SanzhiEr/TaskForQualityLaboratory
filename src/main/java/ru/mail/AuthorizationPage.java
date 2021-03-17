package ru.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationPage extends Page{

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    private By loginField = By.xpath("//input[@name=\"login\"]"),
            passwordField = By.xpath("//input[@name=\"password\"]"),
            enterPasswordButton = By.xpath("//button[@data-testid=\"enter-password\"]"),
            logInButton = By.xpath("//button[@data-testid=\"login-to-mail\"]");

    public MailPage logIn(String login, String password) {
        sendKeys(loginField, login);
        click(enterPasswordButton);
        sendKeys(passwordField, password);
        click(logInButton);
        return new MailPage(driver);
    }

    /**
     * Проверка корректной авторизации - наличие кнопки Написать письмо
     */
    public void checkCorrectPage() {
        isElementDisplayed(By.xpath("//a[@title=\"Написать письмо\"]"));
    }
}
