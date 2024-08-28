package com.tumblr.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/tumblr",
        glue = "com/tumblr/stepDefinitions",
        dryRun = false,
        tags = "@test",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class TumblerRunner {
}
