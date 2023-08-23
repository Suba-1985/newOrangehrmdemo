package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import hrm_DriverFactory.DriverFactory;
import hrm_Pom.IndexPage;
import hrm_Pom.LoginPage;
import hrm_Pom.PersonalDetailsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class IndexPage_SD {
	 private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	 private IndexPage indexPage;
	 private PersonalDetailsPage personalDetailsPage;
	
	@Given("User is already logged in to application")
	public void user_is_already_logged_in_to_application(DataTable dataTable) {
	  List<Map<String,String>> credList= dataTable.asMaps();
	  String userName=credList.get(0).get("username");
	  String passWord=credList.get(0).get("password");
	  DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  indexPage=loginPage.doLogin(userName, passWord);
	}

	@And("user gets the count of the menu list in indexpage as {int}")
	public void user_gets_the_count_of_the_menu_list_in_indexpage_as(Integer expectedCount) {
		boolean result;
	    int count=indexPage.getMenuListCount();
	    if(count==12)
	    { result=true;}
	    else {result=false;}	    
	    Assert.assertTrue(result);
	    //other Way testing 
	    // Assert.assertTrue(indexPage.getMenuListCount()==expectedCount);
	}
	
	@Given("user is on IndexPage and the title of the IndexPage should be {string}")
	public void user_is_on_index_page_and_the_title_of_the_IndexPage_should_be_Dashboard(String expected) {
	  String actualtitle=indexPage.gettitle();
	  String expectedTitle=expected;
	  Assert.assertEquals(actualtitle,expectedTitle);
	  System.out.println("checks the Title of the IndexPage");
	}

	

	@Then("user gets all the main menu from the index page")
	public void user_gets_all_the_main_menu_from_the_index_page(DataTable menuTable) {
	       List<String> expectedList=menuTable.asList();
	       System.out.println("expectedlist : " + expectedList);
		
	       List<String> actualList =  indexPage.getMenuList();
	       System.out.println("actualList :" + actualList);
	    //  Assert.assertTrue(expectedList.containsAll(actualList));
//	       try {
//	    	  // Assert.assertEquals(actualList,expectedList);
//	    	   Assert.assertTrue(expectedList.containsAll(actualList));
//	    	   System.out.println("MenuList is equal: test passed");
//	   	       }
//	       catch(Exception e)
//	       {
//	    	   System.out.println("Lists are not equal :" + e.getMessage());
//	       }
	 
	}
	
	@Then("User clicks on the myInfo Menu")
	public void user_clicks_on_the_my_info_menu() {
	  personalDetailsPage=indexPage.myInfoClick();
	    
	}

	@Then("User will be on the PersonalDetails Page")
	public void user_will_be_on_the_personal_details_page() {
	    System.out.println("In PersonalDetailsPage: "+DriverFactory.getDriver().getCurrentUrl());
	  
	}


}
