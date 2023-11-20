package by.itacademy.zaitsev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OzPage {

    public static String buttonCookies = "/html/body/div[5]/div[2]/button[1]";
    public static String enterButton = "//*[@id=\"top-page\"]/header/div[1]/div/div[1]/a";
    public static String emailButton = "//*[@id=\"loginFormLoginEmailLink\"]";
    public static String loginFormMail = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[1]/input";
    public static String loginFormPassword = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[2]/input";
    public static String enterButtonLoginForm = "//*[@id=\"loginForm\"]/button";
    public static String emailNotRegistered = "//*[@id=\"test\"]/div/div";
    public static String textEnter = "//*[@id=\"loginPopupIntro\"]";
    static WebDriver driver;

    public OzPage (WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtonCookies() {
        driver.findElement(By.xpath(buttonCookies)).click();
    }
    public void clickEnterButton() {
        driver.findElement(By.xpath(enterButton)).click();
    }
    public void clickEmailButton() {
       driver.findElement(By.xpath(emailButton)).click();
    }
    public void sendKeysLoginFormMail(String newEmail) {
        driver.findElement(By.xpath(loginFormMail)).sendKeys("az.pomocnik@gmail.com");
    }
    public void sendKeysLoginFormPassword(String mewPassword) {
        driver.findElement(By.xpath(loginFormPassword)).sendKeys("ArtemZaitsev");
    }
    public void clickEnterButtonLoginForm() {
        driver.findElement(By.xpath(OzPage.enterButtonLoginForm)).click();
    }
    public String emailNotRegistered() {

        return driver.findElement(By.xpath(emailNotRegistered)).getText();
    }

    }

