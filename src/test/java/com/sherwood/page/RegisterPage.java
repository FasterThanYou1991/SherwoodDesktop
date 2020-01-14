package com.sherwood.page;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import static com.start.page.gonzo.GonzoWebsite.SETUP;

public class RegisterPage {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(SETUP);
    }
    @Test
    public void register() throws AWTException {

        WebElement iAmNewHere = driver.findElement(By.xpath("//span[@class='ant-typography gm-text ant-typography-contrast']"));
        iAmNewHere.click();

        WebElement prefix = driver.findElement(By.className("ant-select-selection__rendered"));
        prefix.click();

        WebElement countryCode= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]"));
        countryCode.click();

        WebElement enterPhoneNumber = driver.findElement(By.xpath("//input[@class='react-phone-number-input__input react-phone-number-input__phone gm-input ant-input ant-input-lg']"));
        enterPhoneNumber.click();
        enterPhoneNumber.sendKeys("888888888");

        WebElement next = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-contrast ant-btn-lg ant-btn-block']"));
        next.click();

        WebElement smsCode = driver.findElement(By.xpath("//input[@id='CodeVerificationForm_token']"));
        smsCode.click();
        smsCode.sendKeys("888888");

        WebElement signUp = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-contrast ant-btn-lg ant-btn-block']"));
        signUp.click();

        WebElement uploadPicture = driver.findElement(By.xpath("/html/body/div/section/main/div/div[2]/div/div[3]/form/div/div[1]/div[1]/div/div/span/span/div/span/div/div/span"));
        uploadPicture.click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        StringSelection picture = new StringSelection("C:\\Users\\AmadeuszJankowski\\Pictures\02ladna_pani");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(picture, null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
