package stepDefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import hrm_DriverFactory.DriverFactory;
import hrm_Pom.LoginPage;
import hrm_Utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_SD {
	private String title_chk;
	private String expected,actual;
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	private String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver;
	private ConfigReader configReader;
	Properties prop;	
	
	
	
	@Given("User opens the OrangeHrm Application")
	public void user_opens_the_OrangeHrm_Application() {
		//DriverFactory.getDriver().get(url);
		System.out.println(DriverFactory.getDriver().getCurrentUrl());
		System.out.println("Opened the webPage orange hrm");
	  //expected="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  //actual=DriverFactory.getDriver().getCurrentUrl();
	}
	
	@Then("^User should Land on the Login Page$")
	public void User_should_Land_on_the_Login_page()
	{   System.out.println("checking for the url of login page");
		expected="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		actual=DriverFactory.getDriver().getCurrentUrl();
		Assert.assertEquals(actual, expected);
	}

	@And("^User gets the title of the page$")
	public void user_gets_the_title_of_the_page() {
		System.out.println("checking the title of the page");
		title_chk=loginPage.getLoginPageTitle();
		System.out.println(title_chk + "Login page title is Displayed");
	}

	@When("User enters username {string}")
	public void user_enters_username(String uname) throws InterruptedException {
		System.out.println("user entersd the username");
	    loginPage.enterUserName(uname);
	}

	@And("User enters password {string}")
	public void user_enters_password(String password) {
		System.out.println("user enter the password");
	    loginPage.enterPassword(password);
	}
	
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		System.out.println("login button click");
	    loginPage.clickOnLoginBtn();
	}

	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
		System.out.println("checking weather the user landed on the right page");
	   actual=DriverFactory.getDriver().getCurrentUrl();
	   expected="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	   Assert.assertEquals(actual, expected);
	   System.out.println("Test passed");
	 
	}
}
