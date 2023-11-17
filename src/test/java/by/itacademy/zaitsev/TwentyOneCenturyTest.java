package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwentyOneCenturyTest {

@Test
    public void test21VekWithEmptyData() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.21vek.by/");
    Thread.sleep(4000);

    WebElement enterButtonCookieWebElement = driver.findElement(By.xpath(PageObject.enterButtonCookie));
    enterButtonCookieWebElement.click();

    WebElement accountButtonWebElement = driver.findElement(By.xpath(PageObject.accountButton));
    accountButtonWebElement.click();

    WebElement enterButtonWebElement = driver.findElement(By.xpath(PageObject.enterButton));
    enterButtonWebElement.click();
    Thread.sleep(4000);

    WebElement buttonModuleWebElement = driver.findElement(By.xpath(PageObject.buttonModule));
    buttonModuleWebElement.click();

    WebElement errorMessageLoginWebElement = driver.findElement(By.xpath(PageObject.errorMessageLogin));
    String actual = errorMessageLoginWebElement.getText();
    String expected = "Электронная почта не указана";
    Assertions.assertEquals("Электронная почта не указана", actual);

    Thread.sleep(4000);

    WebElement errorMessagePasswordWebElement = driver.findElement(By.xpath(PageObject.errorMessagePassword));
    actual = errorMessagePasswordWebElement.getText();
    expected = "Пароль не указан";
    Assertions.assertEquals("Пароль не указан", actual);

    Thread.sleep(4000);
    driver.quit();
}
@Test
    public void test21VekWithEmptyFieldPassword () throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.21vek.by/");
    Thread.sleep(4000);

    WebElement enterButtonCookieWebElement = driver.findElement(By.xpath(PageObject.enterButtonCookie));
    enterButtonCookieWebElement.click();

    WebElement accountButtonWebElement = driver.findElement(By.xpath(PageObject.accountButton));
    accountButtonWebElement.click();

    WebElement enterButtonWebElement = driver.findElement(By.xpath(PageObject.enterButton));
    enterButtonWebElement.click();
    Thread.sleep(4000);

    WebElement inputEmailWebElement = driver.findElement(By.xpath(PageObject.inputEmailXpath));
    inputEmailWebElement.sendKeys("az.pomocnik@gmail.com");

    WebElement buttonModuleWebElement = driver.findElement(By.xpath(PageObject.buttonModule));
    buttonModuleWebElement.click();

    WebElement errorMessagePasswordWebElement = driver.findElement(By.xpath(PageObject.errorMessagePassword));
    String actualErrorMessagePassword = errorMessagePasswordWebElement.getText();
    String expectedErrorMessagePassword = "Пароль не указан";
    Assertions.assertEquals(actualErrorMessagePassword, expectedErrorMessagePassword);

    Thread.sleep(4000);
    driver.quit();
}

@Test

public void test21VekWithNonExistentUser () throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.21vek.by/");
    Thread.sleep(4000);

    WebElement enterButtonCookieWebElement = driver.findElement(By.xpath(PageObject.enterButtonCookie));
    enterButtonCookieWebElement.click();

    WebElement accountButtonWebElement = driver.findElement(By.xpath(PageObject.accountButton));
    accountButtonWebElement.click();

    WebElement enterButtonWebElement = driver.findElement(By.xpath(PageObject.enterButton));
    enterButtonWebElement.click();
    Thread.sleep(4000);

    WebElement inputEmailWebElement = driver.findElement(By.xpath(PageObject.inputEmailXpath));
    inputEmailWebElement.sendKeys("az.pomocnik@gmail.com");
    Thread.sleep(4000);

    WebElement inputPasswordWebElement = driver.findElement(By.xpath(PageObject.inputPasswordXpath));
    inputPasswordWebElement.sendKeys("ArtemZaitsev");
    Thread.sleep(4000);

    WebElement buttonModuleWebElement = driver.findElement(By.xpath(PageObject.buttonModule));
    buttonModuleWebElement.click();
    Thread.sleep(4000);

    WebElement errorMessageTextWebElement = driver.findElement(By.xpath(PageObject.errorMessageText));
    String actualErrorMessageText = errorMessageTextWebElement.getText();
    String expectedErrorMessageText = "Нет такого аккаунта. \n" +
            "Зарегистрироваться?";
    Assertions.assertEquals(actualErrorMessageText, expectedErrorMessageText);

    Thread.sleep(4000);
    driver.quit();
}


}

