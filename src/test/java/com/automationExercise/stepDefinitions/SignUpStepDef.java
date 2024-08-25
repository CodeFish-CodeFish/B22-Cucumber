package com.automationExercise.stepDefinitions;

import com.automationExercise.pages.MainPage;
import com.automationExercise.pages.SignUpPage;
import com.bases.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SignUpStepDef {

    WebDriver driver = DriverHelper.getDriver();

    MainPage mainPage = new MainPage(driver);

    SignUpPage signUpPage = new SignUpPage(driver);


    @Given("user is on main page of auto exercise")
    public void user_is_on_main_page_of_auto_exercise() {
        driver.get(ConfigReader.readProperty("autoExMainURL"));
    }

    @When("user clicks on sign up button on main page")
    public void user_clicks_on_sign_up_button_on_main_page() {

        mainPage.clickOnSignUpLoginBtn();

    }

    @Then("user enters name and email as follows {string} and {string} and clicks sign up button")
    public void user_enters_name_and_email_as_follows_and_and_clicks_sign_up_button(String name, String email) {
        signUpPage.enterNameEmailAndClickSignup(name, email);
    }

    @Then("user checks Mr radio button enters name as {string} and password as {string}")
    public void user_checks_mr_radio_button_enters_name_as_and_password_as(String name, String password) {
        signUpPage.clickMrEnterNamePassword(name, password);
    }

    @Then("user selects day as {string} month as {string} and year as {string}")
    public void user_selects_day_as_month_as_and_year_as(String day, String month, String year) {
        signUpPage.daysMonthAndYears(day, month, year);
    }

    @Then("user enters firstname as {string} and lastname as {string} and address as {string}")
    public void user_enters_firstname_as_and_lastname_as_and_address_as(String firstname, String lastname, String address) {
        signUpPage.firstLastNameAddress(firstname, lastname, address);
    }

    @Then("user selects country as {string} and state as {string} city as {string}")
    public void user_selects_country_as_and_state_as_city_as(String country, String state, String city) {
        signUpPage.countryStateCity(country, state, city);
    }

    @Then("user enters zipcode as {string} and enters mobile as {string} and clicks create account button")
    public void user_enters_zipcode_as_and_enters_mobile_as_and_clicks_create_account_button(String zipcode, String mobile) {

        signUpPage.zipCodeMobileCreateAccount(zipcode, mobile);


    }

}
