package com.sherwood.page;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.start.page.gonzo.GonzoWebsite.SETUP;

public class LoginPage {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(SETUP);
    }
    @Test
    public void welcomePageLogin() {
        WebElement login = driver.findElement(By.className("ant-btn"));
        login.click();
        WebElement prefix = driver.findElement(By.className("ant-select-selection__rendered"));
        prefix.click();

        WebElement countryCode = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]"));
        countryCode.click();

        WebElement enterPhoneNumber = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[2]/div/div[3]/div/form/div/div[1]/div/div[2]/div/span/div/div/input"));
        enterPhoneNumber.click();
        enterPhoneNumber.sendKeys("666666666");

        WebElement next = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[2]/div/div[3]/div/form/div/div[2]/button"));
        next.click();

        WebElement enterCode = driver.findElement(By.xpath("//input[@id='CodeVerificationForm_token']"));
        enterCode.click();
        enterCode.sendKeys("666666");

        WebElement logIn = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-contrast ant-btn-lg ant-btn-block']"));
        logIn.click();
    }

}
