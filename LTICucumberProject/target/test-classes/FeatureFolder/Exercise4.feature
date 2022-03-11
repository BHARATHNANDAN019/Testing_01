
Feature: Test login with different set of input

  Scenario Outline: Test Login with valid & invalid set of input
    * user open chrome browser
    * navigates to newtours
    * enter username as "mercury"
    * enter password as "mercury"
    * user clicks on submit
    * verify login success
    * close the browser