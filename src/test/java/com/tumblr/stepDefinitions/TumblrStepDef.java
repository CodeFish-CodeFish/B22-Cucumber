package com.tumblr.stepDefinitions;

import com.tumblr.pages.TumblrMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class TumblrStepDef {

    WebDriver driver = DriverHelper.getDriver();

    TumblrMainPage mainPage = new TumblrMainPage(driver);


    @Given("user is on main page of tumblr")
    public void user_is_on_main_page_of_tumblr() {
        driver.get("https://www.tumblr.com/");
    }
    @When("user clicks on login button from main page")
    public void user_clicks_on_login_button_from_main_page() {
        mainPage.clickOnLoginOption();
    }
    @Then("user clicks on continue with email option")
    public void user_clicks_on_continue_with_email_option() {
        mainPage.clickOnContinueWithEmail();
    }
    @Then("user enters {string} and clicks on next button")
    public void user_enters_and_clicks_on_next_button(String email) {
        mainPage.enterEmailAndNext(email);
    }
    @Then("user enters {string} and clicks on login button")
    public void user_enters_and_clicks_on_login_button(String password) {
        mainPage.enterPasswordAndLogin(password);
    }
    @Then("user validates {string}")
    public void user_validates(String errorMessage) {

        String actualErrorMessage = mainPage.getErrorMessage();
        Assert.assertEquals("Failed to validate error message",errorMessage, actualErrorMessage);

    }

    @Then("user click toggle that changes colors")
    public void user_click_toggle_that_changes_colors() {

        mainPage.clickOnToggle();

    }
    @Then("user verifies url of the main page")
    public void user_verifies_url_of_the_main_page() {
        System.out.println(driver.getCurrentUrl());
    }



}
