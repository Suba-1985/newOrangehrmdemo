package hrm_TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@io.cucumber.testng.CucumberOptions(
plugin = {"pretty", "html:target/OrangeProReorts.html"}, //reporting purpose
monochrome=false,  //console output color
tags = "", //tags from feature file
features = {"classpath:Features/LoginPage.feature"}, //location of feature files (should be in src/test/reso
glue={"stepDefinition","hooks"})//location of  step definition files
public class Runner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
}	