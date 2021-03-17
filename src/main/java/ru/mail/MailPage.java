package ru.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage extends Page{

    public MailPage(WebDriver driver) {
        super(driver);
    }

    private By writeMessageButton = By.xpath("//a[@title=\"Написать письмо\"]"),
            toField = By.xpath("//div[@data-name=\"to\"]//input"),
            messageField = By.xpath("//div[@contenteditable=\"true\"]"),
            sendMessageButton = By.xpath("//span[@title=\"Отправить\"]");

    public void sendMessage(String to, String message) {
        click(writeMessageButton);
        sendKeys(toField, to);
        sendKeys(messageField, message);
        click(sendMessageButton);
        isElementDisplayed(By.xpath("//div[@class=\"layer-sent-page\"]"));//Проверка корректной отправки сообщения - наличие данного div после отправки сообщения
    }

}
