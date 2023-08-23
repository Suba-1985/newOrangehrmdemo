

@tag
Feature: Login Feature
  
  Scenario: Login page title  
    Given User opens the OrangeHrm Application
 		Then User should Land on the Login Page
		And User gets the title of the page

	Scenario Outline: Login with correct credentials
		Given User opens the OrangeHrm Application
		Then User should Land on the Login Page
		When User enters username "Admin"
		And User enters password "admin123"
		When User clicks on Login button
	  Then user gets the title of the home page 
    
    