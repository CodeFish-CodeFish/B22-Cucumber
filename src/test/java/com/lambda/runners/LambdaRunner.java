package com.lambda.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = "src/test/resources/lambda",
        glue = "com/lambda/stepDefinitions",
        dryRun = false,
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class LambdaRunner {
}
