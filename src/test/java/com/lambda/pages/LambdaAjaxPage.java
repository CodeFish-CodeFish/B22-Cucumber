package com.lambda.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LambdaAjaxPage {

    private WebDriver driver;

    public LambdaAjaxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "#title")
    WebElement name;

    @FindBy(css = "#description")
    WebElement messageBox;

    @FindBy(css = "#btn-submit")
    WebElement submitButton;

    @FindBy(css = "#submit-control")
    WebElement text;

    public void enterNameAndMessage(String name, String message){

        BrowserUtils.sendKeys(this.name, driver, name);
        BrowserUtils.sendKeys(this.messageBox, driver, message);

    }

    public void clickOnSubmitBtn(){
        BrowserUtils.click(this.submitButton, driver);
    }

    public void validateMessage(String expectedMessage){
        String expectedText = BrowserUtils.getText(this.text, driver);
        Assert.assertEquals(expectedText, expectedMessage);
    }
}
