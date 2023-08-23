package hrm_Pom;

import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.asn1.x509.sigi.PersonalData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage {
	
	private WebDriver driver;
	
	
	//1.Locators
	private By title = By.xpath("//h6[text()='Dashboard']");
	private By menu_list=By.xpath("//ul[@class='oxd-main-menu']/li//span");
	private By myInfo=By.xpath("//ul[@class='oxd-main-menu']//span[text()='My Info']");
	
	//2.Constructor of the page class
	public IndexPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	///3.Page actions: features(behaviour of the page the form of methods:)

	public int getMenuListCount()
	{
		return driver.findElements(menu_list).size();
	}
	public String gettitle()
	{
		 return driver.findElement(title).getText();
	}
	
	public PersonalDetailsPage myInfoClick()
	{
		driver.findElement(myInfo).click();
		return new PersonalDetailsPage(driver);
	}
	public List<String> getMenuList()
	{    
		List<String> menuInArray=new ArrayList<>();
		List<WebElement> menuList=driver.findElements(menu_list);
		
		for(WebElement mL:menuList)
		{
			String menuDisplay=mL.getText();
			System.out.println(menuDisplay);
			menuInArray.add(menuDisplay);
			
		}
		return menuInArray;
	}
	
}
