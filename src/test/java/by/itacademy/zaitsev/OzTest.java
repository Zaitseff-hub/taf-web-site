package by.itacademy.zaitsev;

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

        String buttonCookies = "/html/body/div[5]/div[2]/button[1]";
        By buttonCookiesBy = By.xpath(buttonCookies);
        WebElement buttonCookiesWebElement = driver.findElement(buttonCookiesBy);
        buttonCookiesWebElement.click();

        String enterButton = "//*[@id=\"top-page\"]/header/div[1]/div/div[1]/a";
        By enterButtonBy = By.xpath(enterButton);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();

        String emailButton = "//*[@id=\"loginFormLoginEmailLink\"]";
        By emailButtonBy = By.xpath(emailButton);
        WebElement emailButtonWebElement = driver.findElement(emailButtonBy);
        emailButtonWebElement.click();

        String loginFormMail = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[1]/input";
        By loginFormMailBy = By.xpath(loginFormMail);
        WebElement loginFormWebElement = driver.findElement(loginFormMailBy);
        loginFormWebElement.sendKeys("az.pomocnik@gmail.com");

        String loginFormPassword = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[2]/input";
        By loginFormPasswordBy = By.xpath(loginFormPassword);
        WebElement loginFormPasswordWebElement = driver.findElement(loginFormPasswordBy);
        loginFormPasswordWebElement.sendKeys("ArtemZaitsev");

        String enterButtonLoginForm = "//*[@id=\"loginForm\"]/button";
        By enterButtonLoginFormBy = By.xpath(enterButtonLoginForm);
        WebElement enterButtonLoginFormWebElement = driver.findElement(enterButtonLoginFormBy);
        enterButtonLoginFormWebElement.click();

        String emailNotRegistered = "//*[@id=\"test\"]/div/div";
        By emailNotRegistred = By.xpath(emailNotRegistered);
        WebElement emailNotRegistredWebElement = driver.findElement(emailNotRegistred);
        String actualEmailNotRegistered = emailNotRegistredWebElement.getText();
        String expectedEmailNotRegistered = "Адрес электронной почты не зарегистрирован. \n" + "Зарегистрироваться";

        Thread.sleep(3000);
        driver.quit();


    }
}
