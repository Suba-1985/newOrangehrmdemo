package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.github.dockerjava.api.model.Driver;

import hrm_DriverFactory.DriverFactory;
import hrm_Pom.ContactDetailsPage;
import hrm_Pom.IndexPage;
import hrm_Pom.LoginPage;
import hrm_Pom.PersonalDetailsPage;
import hrm_Utilities.ExcelReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class ContactDetailsPage_SD{//excel file
	 private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	 private IndexPage indexPage=new IndexPage(DriverFactory.getDriver());
	 private PersonalDetailsPage personalDetailsPage=new PersonalDetailsPage(DriverFactory.getDriver());;
	 private ContactDetailsPage contactDetailsPage=new ContactDetailsPage(DriverFactory.getDriver());;
	
	
	
//	 @Then("User enters the contact details to the application")
//	 public void user_enters_the_contact_details_to_the_application_postalcode_telephone(DataTable dataTable) throws InterruptedException {
//		 List<Map<String,String>> contactDetailsList= dataTable.asMaps();  
//		 String st_1=contactDetailsList.get(0).get("street1");
//		 String st_2=contactDetailsList.get(0).get("street2");
//		 String city1=contactDetailsList.get(0).get("city");
//		 String state1=contactDetailsList.get(0).get("state");
//		 String postlCode1=contactDetailsList.get(0).get("postalcode");
//		 String country1=contactDetailsList.get(0).get("country");
//		 String phone1=contactDetailsList.get(0).get("phone");
//		 contactDetailsPage.contactEntryForm(st_1, st_2, city1, state1, postlCode1, country1, phone1);
//			 }

	 @Then("User enters the contact details to the application {string} and rownumber {int}")
	 public void user_enters_the_contact_details_to_the_application_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
	   ExcelReader excelReader=new ExcelReader();
	   List<Map<String,String>> contactTestData=excelReader.getData("C:\\Users\\subas\\OneDrive\\Desktop\\ContactDetailExcelFile.xlsx", sheetName);
	   String st_1=contactTestData.get(rowNumber).get("Street1");
	   String st_2=contactTestData.get(rowNumber).get("Street2");
	   String city1=contactTestData.get(rowNumber).get("City");
	   String state1=contactTestData.get(rowNumber).get("state");
	   String postalCode1=contactTestData.get(rowNumber).get("Postalcode");
	   String country1=contactTestData.get(rowNumber).get("Country");
	   String telephone1=contactTestData.get(rowNumber).get("Telephone");
	   contactDetailsPage.contactEntryForm(st_1, st_2, city1, state1, postalCode1, country1, telephone1);
	 }

	 
	 
	@Then("user clicks on the save button")
	public void user_clicks_on_the_save_button() {
	  // contactDetailsPage=new ContactDetailsPage(DriverFactory.getDriver());
	   contactDetailsPage.save_Btn();
	   System.out.println("Save Url ?:" + DriverFactory.getDriver().getCurrentUrl());
	   }

	@Then("user should get the success message")
	public void user_should_get_the_success_message() {
	   if(contactDetailsPage.popup_chk())
	   {
		   System.out.println("success");
	   }else
		   System.out.println("failed");
	   
	}

}
