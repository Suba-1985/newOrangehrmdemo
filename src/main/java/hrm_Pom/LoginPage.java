package hrm_Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {
	private WebDriver driver;
	
	//1.locators
	private By title=By.xpath("//h5[text()='Login']");
	private By userName=By.xpath("//label[text()='Username']/../..//input");
	private By password=By.xpath("//label[text()='Password']/../..//input");
	private By loginBtn=By.xpath("//button[@type='submit']");
	
	//2.Constructors
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//3.page actions: features(behavior) of the page 
	public String getLoginPageTitle()
	{   String header=driver.findElement(title).getText();
		return header;
	}
	
	public void enterUserName(String username) throws InterruptedException
	{  // explicit_wait_Example.until(ExpectedConditions.elementToBeClickable(userName));
		Thread.sleep(3000);
		driver.findElement(userName).sendKeys(username);	
	}

	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);	
	}
	
	public void clickOnLoginBtn()
	{
		driver.findElement(loginBtn).click();	
	}
	
	public IndexPage doLogin(String un,String pwd)
	{   System.out.println("Login with:  "+ un + pwd);
		driver.findElement(userName).sendKeys(un);
	    driver.findElement(password).sendKeys(pwd);	
	    driver.findElement(loginBtn).click();	
	    return new IndexPage(driver);
		
	}
	
}
