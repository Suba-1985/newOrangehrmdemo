
Feature: ContactDetails Page Entry
  
Background:
Given User is already logged in to application
|username|password|
|admin|admin123|

 
Scenario: User login to the application and clicks on the contactDetails 
    Given user is on IndexPage and the title of the IndexPage should be "Dashboard"
    Then User clicks on the myInfo Menu
    Then User will be on the PersonalDetails Page
    Then User clicks the Contact details menu from personal details page
		And User will be in ContactDetails Page and gets the Url
		And User enters the contact details to the application 
		 |street1   | street2   | city    |state |postalcode|country|telephone|
     |NNStreet1 | NNstreet2 | FOXcty  |PA    |456789    |Af     |1234567789|
		And user clicks on the save button
		Then user should get the success message
					

  
     
     
      
