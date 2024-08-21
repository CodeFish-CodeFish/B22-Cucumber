package com.automationExercise.stepDefinitions;
import com.automationExercise.pages.ContactUSPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class AEStepDefinition {


    WebDriver driver = DriverHelper.getDriver();

    ContactUSPage contactUSPage = new ContactUSPage(driver);



    @Given("user is navigated to the webpage")
    public void user_is_navigated_to_the_webpage() {
        driver.get(ConfigReader.readProperty("autoExercise"));
        System.out.println(driver.getTitle());
    }
    @Then("user enters name and email")
    public void user_enters_name_and_email() {
        contactUSPage.enterNameAndEmail("Kuba", "email@gmail.com");
    }
    @Then("user enters subject and message")
    public void user_enters_subject_and_message() {
        contactUSPage.enterSubjectAndMessage("Subject", "My message to your manager, I don't like your service");
    }
    @Then("user uploads a file and clicks on submit button and accepts js alert")
    public void user_uploads_a_file_and_clicks_on_submit_button_and_accepts_js_alert() {

        String fileLocation = "/Users/codefish/Downloads/bb.webp";
        contactUSPage.uploadFileAndClickSubmit(fileLocation);

    }

    @When("user is on contact us page user validates contact us header")
    public void user_is_on_contact_us_page_user_validates_contact_us_header() {
        String expectedText = "CONTACT US";
        String actualText = contactUSPage.getContactUsHeaderText();
        System.out.println(actualText);
        // Validation via JUnit
        Assert.assertEquals("Failed to validate contact us header",expectedText, actualText);

    }
    @Then("user validates get in touch text")
    public void user_validates_get_in_touch_text() {
        String expectedText = "GET IN TOUCH";
        String actualText = contactUSPage.getGetInTouchHeaderText();
        System.out.println(actualText);

        // Validation via JUnit
        Assert.assertEquals(expectedText, actualText);
    }
    @Then("user validates feedback for us text")
    public void user_validates_feedback_for_us_text() {

        String expectedText = "FEEDBACK FOR US";
        String actualText = contactUSPage.getFeedbackHeaderText();
        System.out.println(actualText);

        // Validation via JUnit
        Assert.assertEquals(expectedText, actualText);

    }





}
