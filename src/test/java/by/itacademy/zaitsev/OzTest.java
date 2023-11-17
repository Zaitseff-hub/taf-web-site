package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OzTest {

    @Test
    public void testWithNonExistentUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        Thread.sleep(3000);

        WebElement buttonCookiesWebElement = driver.findElement(By.xpath(OzPage.buttonCookies));
        buttonCookiesWebElement.click();

        WebElement enterButtonWebElement = driver.findElement(By.xpath(OzPage.enterButton));
        enterButtonWebElement.click();

        WebElement emailButtonWebElement = driver.findElement(By.xpath(OzPage.emailButton));
        emailButtonWebElement.click();

        WebElement loginFormWebElement = driver.findElement(By.xpath(OzPage.loginFormMail));
        loginFormWebElement.sendKeys("az.pomocnik@gmail.com");

        WebElement loginFormPasswordWebElement = driver.findElement(By.xpath(OzPage.loginFormPassword));
        loginFormPasswordWebElement.sendKeys("ArtemZaitsev");

        WebElement enterButtonLoginFormWebElement = driver.findElement(By.xpath(OzPage.enterButtonLoginForm));
        enterButtonLoginFormWebElement.click();

        WebElement emailNotRegistredWebElement = driver.findElement(By.xpath(OzPage.emailNotRegistered));
        String actualEmailNotRegistered = emailNotRegistredWebElement.getText();
        String expectedEmailNotRegistered = "Адрес электронной почты не зарегистрирован. \n" + "Зарегистрироваться";

        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void testWithComeInEqualsEnter () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        Thread.sleep(3000);

        WebElement comeInWebElement = driver.findElement(By.xpath(OzPage.comeInButton));
        comeInWebElement.click();

        WebElement textEnterWebElement = driver.findElement(By.xpath(OzPage.textEnter));
        String actualTextEnterWebElement = textEnterWebElement.getText();
        String expectedTextEnterWebElement = "Вход";
        Assertions.assertEquals(actualTextEnterWebElement, expectedTextEnterWebElement);

        Thread.sleep(3000);
        driver.quit();

    }
}
