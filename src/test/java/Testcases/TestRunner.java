package Testcases;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"stepDefinitions"}, tags = {"@test","@test1"},
           plugin = {"pretty","html:target/cucumber-html-report","json:target/cucumber.json","junit:target/cucumber.xml"})
public class TestRunner {

}