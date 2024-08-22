package com.automationExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class SignUpPage {

    private WebDriver driver;

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Login input fields here
    @FindBy(css = "input[name='name']")
    WebElement loginName;

    @FindBy(css = "input[data-qa='signup-email']")
    WebElement loginEmail;

    @FindBy(css = "button[data-qa='signup-button']")
    WebElement signUpButton;


    // Sign up input fields -- ACCOUNT INFORMATION
    @FindBy(css = "#id_gender1")
    WebElement mr;


    @FindBy(css = "#name")
    WebElement name;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "#days")
    WebElement daysDropdown;

    @FindBy(css = "#months")
    WebElement monthDropdown;

    @FindBy(css = "#years")
    WebElement yearsDropdown;

    @FindBy(css = "#first_name")
    WebElement firstname;

    @FindBy(css = "#last_name")
    WebElement lastname;

    @FindBy(css = "#address1")
    WebElement address;

    @FindBy(css = "#country")
    WebElement countryDropdown;

    @FindBy(css = "#state")
    WebElement state;

    @FindBy(css = "#city")
    WebElement city;

    @FindBy(css = "#zipcode")
    WebElement zipcode;

    @FindBy(css = "#mobile_number")
    WebElement mobilePhone;

    @FindBy(xpath = "//button[.='Create Account']")
    WebElement createAccountButton;

    public void enterNameEmailAndClickSignup(String name, String email){

        BrowserUtils.sendKeys(this.loginName, driver, name);
        BrowserUtils.sendKeys(this.loginEmail, driver, email);
        BrowserUtils.click(this.signUpButton, driver);


    }

    public void clickMrEnterNamePassword(String name, String password){

        BrowserUtils.click(this.mr, driver);
        BrowserUtils.sendKeys(this.name, driver, name);
        BrowserUtils.sendKeys(this.password, driver, password);

    }

    public void daysMonthAndYears(String days, String month, String years){

        BrowserUtils.selectBy(this.daysDropdown, days, "visibleText");
        BrowserUtils.selectBy(this.monthDropdown, month, "visibleText");
        BrowserUtils.selectBy(this.yearsDropdown, years, "visibleText");

    }

    public void firstLastNameAddress(String firstname,String lastname, String address){
        BrowserUtils.sendKeys(this.firstname, driver, firstname);
        BrowserUtils.sendKeys(this.lastname, driver, lastname);
        BrowserUtils.sendKeys(this.address, driver, address);
    }

    public void countryStateCity(String country, String state, String city){
        BrowserUtils.selectBy(this.countryDropdown, country, "visibleText");
        BrowserUtils.sendKeys(this.state, driver, state);
        BrowserUtils.sendKeys(this.city, driver, city);
    }

    public void zipCodeMobileCreateAccount(String zipcode, String mobile){
        BrowserUtils.sendKeys(this.zipcode, driver, zipcode);
        BrowserUtils.sendKeys(this.mobilePhone, driver, mobile);
        BrowserUtils.click(this.createAccountButton, driver);
    }


















}
