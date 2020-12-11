package com.arca.acquiringswitch.integration;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = {
        "com.arca.framework.testing.integration",
        "com.arca.acquiringswitch.integration"
}/*, tags = "@update_merchant"*/)
public class AcquiringSwitchIT {
}
