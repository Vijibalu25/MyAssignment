Feature: Login functionality of Leaftaps Application

#Background:
#Given Launch the browser
#And load the URL

Scenario: Login with Valid credentials
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed


Scenario: Login with Invalid credentials
And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed

