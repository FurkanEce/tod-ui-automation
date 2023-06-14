package com.tod.runners;

import com.tod.helpers.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.AfterAll;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        publish = true,
        glue = "com/tod/definitions"
)
public class CucumberRunner {
}
