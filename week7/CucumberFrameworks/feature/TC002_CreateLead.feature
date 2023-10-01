Feature: CreateLead functionality of Leaftaps Application

Scenario Outline: Login with Valid credentials
#Given Launch the browser
#And load the URL
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
And Click on Leads link
When Click on CreateLead link
Given Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
When Click on submit Button
Then View leads page should be displayed

Examples:
|companyname|firstname|lastname|
|TCS|Vijayalakshmi|B|
|Evoquva|Saravanan|R|