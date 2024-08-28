package com.tumblr.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class TumblrHook {

    public WebDriver driver;

    @Before
    public void initializeDriver(){
        driver = DriverHelper.getDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
