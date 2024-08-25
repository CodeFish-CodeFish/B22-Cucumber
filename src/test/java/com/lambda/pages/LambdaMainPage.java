package com.lambda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LambdaMainPage {

    private WebDriver driver;

    public LambdaMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(linkText = "Ajax Form Submit")
    WebElement ajaxFormSubmit;

    public void clickOnAjaxFormSubmit(){

        BrowserUtils.click(this.ajaxFormSubmit, driver);

    }


}
