package com.sherwood.tests.Login.object.pages;

import com.sherwood.tests.Login.object.componets.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmsCodePage extends BasePage {

    public SmsCodePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id= "CodeVerificationForm_token")
    WebElement codeColumn;
    @FindBy(xpath = "/html/body/div/section/main/div/div[2]/div/div[3]/form/div/div[2]/button")
    WebElement logInButton;

    public void loginWithCodeCredentials(String number){
        codeColumn.click();
        codeColumn.sendKeys(number);
        logInButton.click();
    }
}
