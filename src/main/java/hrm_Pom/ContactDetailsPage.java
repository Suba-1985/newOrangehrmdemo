package hrm_Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPage {
	private WebDriver driver;
	
	@FindBy(xpath="//label[contains(text(),'Street 1')]/../../div[2]/input")
	WebElement street1_input ;
	@FindBy(xpath="//label[contains(text(),'Street 2')]/../../div[2]/input")
	WebElement street2;
	@FindBy(xpath="//label[contains(text(),'City')]/../../div[2]/input")
	WebElement city_input;
	@FindBy(xpath="//label[contains(text(),'State/Province')]/../../div[2]/input")
	WebElement state_input;
	@FindBy(xpath="//label[contains(text(),'Zip/Postal Code')]/../../div[2]/input")
	WebElement zipcode_input;
	@FindBy(xpath="//label[contains(text(),'Home')]/../../div[2]/input")
	WebElement phoneH_input;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div")
	WebElement country_input ;
	@FindBy(xpath="//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space')]")
	WebElement saveBtn;
	@FindBy(id="oxd-toaster_1")
	WebElement popup;

	public ContactDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void contactEntryForm(String st1,String st2,String ct,String state,String zipcode,String country,String telephone) throws InterruptedException
	{		
				System.out.println("Entering contact entry area");
				street1_input.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
				Thread.sleep(3000);
				street1_input.sendKeys(st1);
				Thread.sleep(3000);
			    street2.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
			    street2.sendKeys(st2);			
			    Thread.sleep(3000);
			    city_input.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
				city_input.sendKeys(ct);
				Thread.sleep(3000);
				state_input.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
				state_input.sendKeys(state);
				Thread.sleep(3000);
				zipcode_input.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
				zipcode_input.sendKeys(zipcode);
				//list.get(3).click();
			
//				Thread.sleep(3000);
//				country_input.click();
//				System.out.println(country);
//				country_input.sendKeys(country);
//				// + Keys.ENTER);
//				Thread.sleep(6000);
//				country_input.sendKeys(Keys.ARROW_DOWN);
//			
//				country_input.sendKeys(Keys.ENTER);			
//				Thread.sleep(3000);
				
	}
	public void save_Btn()
	{
		saveBtn.click();
	}
	
	public boolean popup_chk()
	{
		popup.isDisplayed();
		return true;
	}	
	

}
