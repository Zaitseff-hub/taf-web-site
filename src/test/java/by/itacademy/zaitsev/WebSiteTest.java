package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTest {

@Test
    public void Test21VekWithEmptyData() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.21vek.by/");
    Thread.sleep(4000);

    String enterButtonCookie = "//*[@id=\"modal-cookie\"]/div/div[2]/div/button[3]/div";
    By enterButtonCookieBy = By.xpath(enterButtonCookie);
    WebElement enterButtonCookieWebElement = driver.findElement(enterButtonCookieBy);
    enterButtonCookieWebElement.click();

    String accountButton = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button/span";
    By accountButtonBy = By.xpath(accountButton);
    WebElement accountButtonWebElement = driver.findElement(accountButtonBy);
    accountButtonWebElement.click();

    String enterButton = "//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button/div/span";
    By enterButtonBy = By.xpath(enterButton);
    WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
    enterButtonWebElement.click();
    Thread.sleep(4000);

    String buttonModule = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button/div";
    By buttonModuleBy = By.xpath(buttonModule);
    WebElement buttonModuleWebElement = driver.findElement(buttonModuleBy);
    buttonModuleWebElement.click();

    String errorMessageLogin = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";
    By errorMessageLoginBy = By.xpath(errorMessageLogin);
    WebElement errorMessageLoginWebElement = driver.findElement(errorMessageLoginBy);
    String actual = errorMessageLoginWebElement.getText();
    String expected = "Электронная почта не указана";
    Assertions.assertEquals("Электронная почта не указана", actual);

    Thread.sleep(4000);

    String errorMessagePassword = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
    By errorMessagePasswordBy = By.xpath(errorMessagePassword);
    WebElement errorMessagePasswordWebElement = driver.findElement(errorMessagePasswordBy);
    actual = errorMessagePasswordWebElement.getText();
    expected = "Пароль не указан";
    Assertions.assertEquals("Пароль не указан", actual);

    Thread.sleep(4000);
    driver.quit();
}
@Test
    public void Test21VekWithEmptyFieldPassword () throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.21vek.by/");
    Thread.sleep(4000);

    String enterButtonCookie = "//*[@id=\"modal-cookie\"]/div/div[2]/div/button[3]/div";
    By enterButtonCookieBy = By.xpath(enterButtonCookie);
    WebElement enterButtonCookieWebElement = driver.findElement(enterButtonCookieBy);
    enterButtonCookieWebElement.click();

    String accountButton = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button/span";
    By accountButtonBy = By.xpath(accountButton);
    WebElement accountButtonWebElement = driver.findElement(accountButtonBy);
    accountButtonWebElement.click();

    String enterButton = "//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button/div/span";
    By enterButtonBy = By.xpath(enterButton);
    WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
    enterButtonWebElement.click();
    Thread.sleep(4000);

    String inputEmailXpath = "//*[@id=\"login-email\"]";
    By inputEmailXpathBy = By.xpath(inputEmailXpath);
    WebElement inputEmailWebElement = driver.findElement(inputEmailXpathBy);
    inputEmailWebElement.sendKeys("az.pomocnik@gmail.com");

    String buttonModule = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button/div";
    By buttonModuleBy = By.xpath(buttonModule);
    WebElement buttonModuleWebElement = driver.findElement(buttonModuleBy);
    buttonModuleWebElement.click();

    String errorMessagePassword = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
    By errorMessagePasswordBy = By.xpath(errorMessagePassword);
    WebElement errorMessagePasswordWebElement = driver.findElement(errorMessagePasswordBy);
    String actualErrorMessagePassword = errorMessagePasswordWebElement.getText();
    String expectedErrorMessagePassword = "Пароль не указан";
    Assertions.assertEquals(actualErrorMessagePassword, expectedErrorMessagePassword);

    Thread.sleep(4000);
    driver.quit();








}
}

