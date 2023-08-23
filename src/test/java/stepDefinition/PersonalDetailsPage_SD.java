package stepDefinition;

import com.github.dockerjava.api.model.Driver;

import hrm_DriverFactory.DriverFactory;
import hrm_Pom.ContactDetailsPage;
import hrm_Pom.IndexPage;
import hrm_Pom.LoginPage;
import hrm_Pom.PersonalDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PersonalDetailsPage_SD {
	 private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	 private IndexPage indexPage=new IndexPage(DriverFactory.getDriver());
	 private PersonalDetailsPage personalDetailsPage;
	 private ContactDetailsPage contactDetailsPage;
	
	@Then("User clicks the Contact details menu from personal details page")
	public void user_clicks_the_contact_details_menu_from_personal_details_page() {
		personalDetailsPage=new PersonalDetailsPage(DriverFactory.getDriver());
		System.out.println(personalDetailsPage);
		System.out.println("Personal details page Object :   "+DriverFactory.getDriver().getCurrentUrl());
		contactDetailsPage=personalDetailsPage.contact_detailsClick();
	}
	
	@And ("User will be in ContactDetails Page and gets the Url")
	public void And_User_will_be_in_ContactDetails_Page_and_gets_the_Url()
	{
		System.out.println("User is in CD Page : " + DriverFactory.getDriver().getCurrentUrl());
	}
}
