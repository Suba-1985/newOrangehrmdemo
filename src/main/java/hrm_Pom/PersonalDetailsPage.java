package hrm_Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PersonalDetailsPage {
    private WebDriver driver;
    
   
    private By contactDetails=By.xpath("//a[text()='Contact Details']");
     
	public PersonalDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public ContactDetailsPage contact_detailsClick()
	{
		driver.findElement(contactDetails).click();
		return new ContactDetailsPage(driver);		
	}
	
	
	

}
