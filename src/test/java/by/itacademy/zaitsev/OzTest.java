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
        OzPage oz = new OzPage(driver);

        oz.clickButtonCookies();
        Thread.sleep(3000);

        oz.clickEnterButton();

        oz.clickEmailButton();

        oz.sendKeysLoginFormMail("az.pomocnik@gmail.com");

        oz.sendKeysLoginFormPassword("ArtemZaitsev");

        oz.clickEnterButtonLoginForm();

        Thread.sleep(1000);

        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться", oz.emailNotRegistered());

        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void testWithComeInEqualsEnter () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzPage oz = new OzPage(driver);
        Thread.sleep(3000);

        WebElement enterButtonWebElement = driver.findElement(By.xpath(OzPage.enterButton));
        enterButtonWebElement.click();

        WebElement textEnterWebElement = driver.findElement(By.xpath(OzPage.textEnter));
        String actualTextEnterWebElement = textEnterWebElement.getText();
        Assertions.assertEquals("Вход", actualTextEnterWebElement);

        Thread.sleep(3000);
        driver.quit();

    }
}
