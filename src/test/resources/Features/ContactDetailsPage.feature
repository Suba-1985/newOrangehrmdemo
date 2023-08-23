
Feature: ContactDetails Page Entry
  
Background:
Given User is already logged in to application
|username|password|
|admin|admin123|

 
Scenario Outline: Contact Us SCenario with different set of data 
    Given user is on IndexPage and the title of the IndexPage should be "Dashboard"
    Then User clicks on the myInfo Menu
    Then User will be on the PersonalDetails Page
    Then User clicks the Contact details menu from personal details page
		And User will be in ContactDetails Page and gets the Url
		And User enters the contact details to the application "<SheetName>" and rownumber <RowNumber>
		 
		And user clicks on the save button
		Then user should get the success message
		
		Examples:		
		|SheetName          |RowNumber|
		|ContactDetailsSheet|0        |
		
					

  
     
     
      
