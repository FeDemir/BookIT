package com.BookIT.runners;

import io.cucumber.junit.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",//this will store failed scenarios into rerun.txt file
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/BookIT/step_definitions",
        dryRun = true
        ,tags = "@db"
)
public class CukesRunner {
}
