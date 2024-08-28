package com.tumblr.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/uiFailedTests.txt",
        glue = "com/tumblr/stepDefinitions",
        dryRun = false



)
public class ReRunner {
}
