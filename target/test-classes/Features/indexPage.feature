Feature: Index Page Feature

Background:
Given User is already logged in to application
|username|password|
|admin|admin123|


Scenario: IndexPage title and get the menu list
Given user is on IndexPage and the title of the IndexPage should be "Dashboard"
And user gets the count of the menu list in indexpage as 11
Then user gets all the main menu from the index page
|Admin|
|PIM|
|Leave|
|Time|
|Recruitment|
|My info|
|Performance|
|Dashboard|
|Directory|
|Maintenance|
|Buzz|
Then User clicks on the myInfo Menu
Then User will be on the PersonalDetails Page


