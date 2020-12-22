Feature: Login function validations
Scenario Outline: Successful login with valid caredential, nagitive &positive test

Given as auser i can open any  browser
And As a user i can enter the "https://admin-demo.nopcommerce.com/" and go to the login page
When As a user i can enter as "<username>" and pasword "<password>"
And Click on login 
And  Homepage should be "Dashboard /nopCommerce administration"
And As a user i can click on logout link 
Then login page title should be "Your store login"
And Close the browser

Examples:
|username            |password|
|admin@yourstore.com |admin|


