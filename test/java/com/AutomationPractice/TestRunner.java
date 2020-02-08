package com.AutomationPractice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/AutomationPractice.feature",
glue = {"step_defination"})
public class TestRunner {
}
