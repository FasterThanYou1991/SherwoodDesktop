package com.sherwood.tests.Login.object.tests;

import com.sherwood.tests.Login.object.pages.LoginPage;
import com.sherwood.tests.Login.object.pages.SmsCodePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://gonzo-sherwood-test.bsgroup.eu/login");
    }

    @Test
    public void TestLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials("111111111");
    }
    @Test
    public void TestCode(){
        SmsCodePage smsCodePage = new SmsCodePage(driver);
        smsCodePage.loginWithCodeCredentials("111111");
    }
}
