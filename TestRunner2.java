package stepDefinitionsswab;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features1",
glue= {"stepDefinitionsswab"},
tags=("@Swablab1"),
dryRun=false,monochrome=true)

public class TestRunner2 {

}
