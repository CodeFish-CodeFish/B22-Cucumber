package com.smartBear.stepDefinitions;

import com.bases.Hooks;
import com.smartBear.pages.LoginPage;
import com.smartBear.pages.MainPage;
import com.smartBear.pages.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class OrderStepDef {

     WebDriver driver = DriverHelper.getDriver();

    LoginPage loginPage = new LoginPage(driver);

    MainPage mainPage = new MainPage(driver);

    OrderPage orderPage = new OrderPage(driver);


    @When("user is on login page user enters username as {string} and password as {string}")
    public void user_is_on_login_page_user_enters_username_as_and_password_as(String username, String password) {
        driver.get(ConfigReader.readProperty("smartBearURL"));
        loginPage.loginFunction(username, password);
    }

    @Given("user is on main page of smartBear and user clicks on order button")
    public void user_is_on_main_page_of_smart_bear_and_user_clicks_on_order_button() {
        mainPage.clickOnOrderLink();
    }

    @When("user is on order page user validates title of the order page as {string}")
    public void user_is_on_order_page_user_validates_title_of_the_order_page_as(String title) {

        String actualTitle = driver.getTitle().trim();
        Assert.assertEquals("Failed to validate title of the webpage", title, actualTitle);


    }

    @Then("user selects {string} from the dropdown and enters {string} into quantity input field")
    public void user_selects_from_the_dropdown_and_enters_into_quantity_input_field(String option, String quantity) {

        orderPage.selectProductAndQuantity(option, quantity);

    }

    @Then("user enters their name as {string} and street address as {string}")
    public void user_enters_their_name_as_and_street_address_as(String name, String address) {
        orderPage.nameAddress(name, address);
    }

    @Then("user enters city as {string} state as {string} and zipcode as {string}")
    public void user_enters_city_as_state_as_and_zipcode_as(String city, String state, String zipcode) {
        orderPage.cityStateZipcode(city, state, zipcode);
    }

    @Then("user checks visa radio button and enters credit card as {string} and expiration as {string}")
    public void user_checks_visa_radio_button_and_enters_credit_card_as_and_expiration_as(String credit, String expiration) {
        orderPage.creditCardAndExpiration(credit, expiration);
    }

    @Then("user clicks on process button")
    public void user_clicks_on_process_button() {
        orderPage.clickOnProcessButton();
    }

}
