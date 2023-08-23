
Feature: Personal Details Feature

Background:
Given User is already logged in to application
|username|password|
|admin|admin123|

Scenario: User clicks on the contactDetails 
Given user is on IndexPage and the title of the IndexPage should be "Dashboard"
Then User clicks on the myInfo Menu
Then User will be on the PersonalDetails Page
Then User clicks the Contact details menu from personal details page
And User will be in ContactDetails Page and gets the Url


