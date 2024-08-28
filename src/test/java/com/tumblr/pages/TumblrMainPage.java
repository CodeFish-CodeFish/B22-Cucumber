package com.tumblr.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.time.Duration;

public class TumblrMainPage {

    private WebDriver driver;

    public TumblrMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[contains(.,'Log in')]")
    WebElement login1;

    @FindBy(xpath = "//button[@class='dKGjO']")
    WebElement continueWithEmail;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailInputField;

    @FindBy(xpath = "//span[.='Next']")
    WebElement nextButton;

    @FindBy(css = "input[name='password']")
    WebElement passwordInputField;

    @FindBy(css = "button[type='submit']")
    WebElement login2;

    @FindBy(xpath = "//div[@class='a0A37 hAkP2']")
    WebElement errorMessageText;

    @FindBy(xpath = "//button//div[@class='a132D']")
    WebElement toggle;


    public void clickOnLoginOption() {
        BrowserUtils.click(this.login1, driver);

    }

    public void clickOnContinueWithEmail() {
        BrowserUtils.click(this.continueWithEmail, driver);
    }

    public void enterEmailAndNext(String email) {
        BrowserUtils.sendKeys(this.emailInputField, driver, email);
        BrowserUtils.click(this.nextButton, driver);
    }

    public void enterPasswordAndLogin(String password) {

        BrowserUtils.sendKeys(this.passwordInputField, driver, password);
        BrowserUtils.click(this.login2, driver);
    }

    public String getErrorMessage() {
        return BrowserUtils.getText(this.errorMessageText);
    }

    public void clickOnToggle() {
        Actions actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            actions.pause(Duration.ofSeconds(2));
            BrowserUtils.click(this.toggle, driver);

        }

    }


}
