package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTest {

@Test
    public void test21vek() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.21vek.by/");

    String accountButton = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button/span";
    By accountButtonBy = By.xpath(accountButton);
    WebElement accountButtonWebElement = driver.findElement(accountButtonBy);
    accountButtonWebElement.click();

    String enterButton = "//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button/div/span";
    By enterButtonBy = By.xpath(enterButton);
    WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
    enterButtonWebElement.click();

    String buttonModule = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button/div";
    By buttonModuleBy = By.xpath(buttonModule);
    WebElement buttonModuleWebElement = driver.findElement(buttonModuleBy);
    buttonModuleWebElement.click();

    String errorMessage = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";
    By errorMessageBy = By.xpath(errorMessage);
    WebElement errorMessageWebElement = driver.findElement(errorMessageBy);
    String actual = errorMessageWebElement.getText();
    String expected = "Электронная почта не указана";
    Assertions.assertEquals("Электронная почта не указана", actual);
}

    @Test
            public void test21vek1 () throws InterruptedException {

    String errorMessagePassword = "//*[@id="default-:R2mm:-modal"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
    By errorMessagePasswordBy = By.xpath(errorMessagePassword);
    WebElement errorMessagePasswordWebElement = driver.findElement(errorMessagePasswordBy);
    String actual = errorMessagePasswordWebElement.getText();
    String expected = "Пароль не указан";


}
}
