package com.smartBear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OrderPage {

    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    WebElement productDropdown;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    WebElement customerName;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    WebElement street;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zipcode;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_0")
    WebElement visaRadioButton;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement creditCard;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expirationDate;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
    WebElement processButton;

    public void selectProductAndQuantity(String product, String quantity){

        BrowserUtils.selectBy(this.productDropdown, product, "visibleText");
        BrowserUtils.sendKeys(this.quantity, driver, quantity);

    }

    public void nameAddress(String name, String address){

        BrowserUtils.sendKeys(this.customerName, driver, name);
        BrowserUtils.sendKeys(this.street, driver, address);

    }

    public void cityStateZipcode(String city, String state, String zipcode){
        BrowserUtils.sendKeys(this.city, driver, city);
        BrowserUtils.sendKeys(this.state, driver, state);
        BrowserUtils.sendKeys(this.zipcode, driver, zipcode);
    }

    public void creditCardAndExpiration(String creditCard, String exp){

        BrowserUtils.click(this.visaRadioButton, driver);
        BrowserUtils.sendKeys(this.creditCard, driver, creditCard);
        BrowserUtils.sendKeys(this.expirationDate, driver, exp);

    }

    public void clickOnProcessButton(){
        BrowserUtils.click(this.processButton, driver);
    }








}
