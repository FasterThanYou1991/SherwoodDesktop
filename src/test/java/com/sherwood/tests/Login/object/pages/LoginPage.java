package com.sherwood.tests.Login.object.pages;

import com.sherwood.tests.Login.object.componets.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver); // Wywołanie klasy kontruktora klasy nadrzędnej(tej z której dziedziczymy)
    }
    @FindBy(className="ant-select-selection__rendered")
    WebElement prefix;
    @FindBy(xpath ="/html/body/div[2]/div/div/div/ul/li[3]")
    WebElement countryCode;
    @FindBy(xpath ="/html/body/div[1]/section/main/div/div[2]/div/div[3]/div/form/div/div[1]/div/div[2]/div/span/div/div/input")
    WebElement phoneNumber;
    @FindBy(xpath ="/html/body/div[1]/section/main/div/div[2]/div/div[3]/div/form/div/div[2]/button")
    WebElement nextButton;

    public void loginWithCredentials (String number) {
        prefix.click();
        countryCode.click();
        phoneNumber.sendKeys(number);
        nextButton.click();
    }


}
