Feature: Application Login

  Scenario: Home page default login
  Given user is on landing page
  When user login into application with username and password
  Then Welcome page is displayed
  And card details are displayed
