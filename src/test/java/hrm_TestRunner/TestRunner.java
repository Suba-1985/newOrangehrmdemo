package hrm_TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features={"src/test/resources/Features/LoginPage.feature","src/test/resources/Features/indexPage.feature","src/test/resources/Features/PersonalDetailsPage.feature","src/test/resources/Features/ContactDetailsPage.feature"},
glue={"stepDefinition","hooks"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
}














//**********Pavithra testNG file
 //TestNG execution
//	@CucumberOptions(
//			plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
//			monochrome=false,  //console output color
//			tags = "", //tags from feature file
//			features = {"src/test/resources/Features/LoginPage.feature"}, //location of feature files
//			glue= {"stepDefinition","hooks"}) //location of step definition files
//	public class TestRunner extends AbstractTestNGCucumberTests{
//		
//		@Override
//	    @DataProvider(parallel = false)
//	    public Object[][] scenarios() {
//					
//			return super.scenarios();
//	    }
//		}
//

//**********



//@CucumberOptions(
//plugin = {"pretty", "html:target/OrangeProReorts.html"}, //reporting purpose
//monochrome=false,  //console output color
//tags = "", //tags from feature file
//features = {"src/test/resources/Features"}, //location of feature files (should be in src/test/reso
//glue={"stepDefinition","hooks"})//location of  step definition files
//public class TestRunner extends AbstractTestNGCucumberTests{
//	
//	@Override
//    @DataProvider(parallel = false)
//    public Object[][] scenarios() {
//				
//		return super.scenarios();
//    }
//}	

