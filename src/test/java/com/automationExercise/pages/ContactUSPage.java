package com.automationExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ContactUSPage {

    private WebDriver driver;

    public ContactUSPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    @FindBy(css = "input[name='name']")
    WebElement name;

    @FindBy(css = "input[name='email']")
    WebElement email;

    @FindBy(css = "input[name='subject']")
    WebElement subject;

    @FindBy(css = "textarea[id='message']")
    WebElement message;

    @FindBy(css = "input[name='upload_file']")
    WebElement uploadFile;

    @FindBy(css = "input[name='submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//h2[contains(text(),'Contact')]")
    WebElement contactUsHeader;

    @FindBy(xpath = "//h2[contains(text(),'Get')]")
    WebElement getInTouchHeader;

    @FindBy(xpath = "//h2[contains(text(),'Feedback')]")
    WebElement feedBackHeader;

    /* These methods will retrieve texts from the webpage and return String
     Please use wisely these returned string for your validation
     */
    public String getContactUsHeaderText(){
        return BrowserUtils.getText(this.contactUsHeader);
    }

    public String getGetInTouchHeaderText(){
        return BrowserUtils.getText(this.getInTouchHeader);
    }

    public String getFeedbackHeaderText(){
        return BrowserUtils.getText(this.feedBackHeader);
    }





    // Below methods are for filling out form
    public void enterNameAndEmail(String name, String email){
        BrowserUtils.sendKeys(this.name, driver, name);
        BrowserUtils.sendKeys(this.email, driver, email);
    }

    public void enterSubjectAndMessage(String subject, String message){
        BrowserUtils.sendKeys(this.subject, driver, subject);
        BrowserUtils.sendKeys(this.message, driver, message);
    }

    public void uploadFileAndClickSubmit(String pathToFile){

        this.uploadFile.sendKeys(pathToFile);
        BrowserUtils.click(this.submitBtn, driver);
        BrowserUtils.acceptJsAlert(driver);

    }




}
