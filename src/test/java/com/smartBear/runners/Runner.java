package com.smartBear.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/smartBear", // path to feature file/cucumber file
        glue = "com/smartBear/stepDefinitions", // path to stepDef
        dryRun = false // if this is set to true, it will generate snippets if step definition is not defined yet

)
public class Runner {
}
