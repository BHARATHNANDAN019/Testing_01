
Feature: Test Register Functionality

Scenario: Register with valid input
Given user open chrome browser
And navigates to newtours
And user clicks on Register link
When user enter the username
And user enter password
And user enter confirm password
And user clicks on Register button
Then verify Registration is success
And close the browser





