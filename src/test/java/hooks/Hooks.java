package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import hrm_DriverFactory.DriverFactory;
import hrm_Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	
	@Before(order=0)//will execute 0 and then 1
	public void getProperty() throws IOException
	{System.out.println("getting the browser name from hooks page ");
		configReader =new ConfigReader();
		prop=configReader.init_prop();		
	}
	
@Before(order=1)
	public void launchBrowser()
	{
		String browserName=prop.getProperty("browser");
		String geturl=prop.getProperty("url");
		System.out.println("launching the browser from the hooks page");
		driverFactory=new DriverFactory();
		System.out.println("heloo browsername launch");
		driver=driverFactory.init_driver(browserName,geturl);		
	}
	
	@After(order=0)// will execute after "1" then order 0
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			//take ScreenShot;
			String screenShotName=scenario.getName().replaceAll("", "_");
			byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath,"image/png", screenShotName);
		}
	}
	
}
