package com.lambda.stepDefinitions;

import com.lambda.pages.LambdaAjaxPage;
import com.lambda.pages.LambdaMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.util.Map;

public class AjaxStepDef {

    WebDriver driver = DriverHelper.getDriver();

    LambdaMainPage mainPage = new LambdaMainPage(driver);
    LambdaAjaxPage ajaxPage = new LambdaAjaxPage(driver);



    @Given("user is on main page of lambda and clicks on ajax submit form link")
    public void user_is_on_main_page_of_lambda_and_clicks_on_ajax_submit_form_link() {
        driver.get("https://www.lambdatest.com/selenium-playground/");
        mainPage.clickOnAjaxFormSubmit();
    }
    @When("user enters name and message as follows")
    public void user_enters_name_and_message_as_follows(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> map = dataTable.asMap();
        String name = map.get("name");
        String message = map.get("message");
        ajaxPage.enterNameAndMessage(name, message);

    }
    @Then("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        ajaxPage.clickOnSubmitBtn();
    }
    @Then("user validates prompted message as follows")
    public void user_validates_prompted_message_as_follows(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> map = dataTable.asMap();
        ajaxPage.validateMessage(map.get("expectedMessage"));

    }
    @Then("user validates title of this web page as follows")
    public void user_validates_title_of_this_web_page_as_follows(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> map = dataTable.asMap();
        String expectedTitle = map.get("expectedTitle");
        System.out.println(expectedTitle);
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


}
