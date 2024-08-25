package com.lambda.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class LambdaHooks {

    public WebDriver driver;

    @Before
    public void startUp() {

        driver = DriverHelper.getDriver();

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
