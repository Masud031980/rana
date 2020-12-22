Feature: Zoopla users can buy the property & sell the property 

Scenario: User able to successfuly login & verify the home page
          
Given As a user able to open any browser 
And As a user able to enter URL
When As a user i can click on signin button //Action
And As a user i can enter username and Password
And As a user i can click on login button //Validation 
Then As a user i can verify the homepage
And Close the browser
