Feature: Secure Logout

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "phoneTextBox" and sendKeys "223344556"
    * User clicks the button "signInLoginButton"

  @8
  Scenario: A registered user should be able to log out securely from the system
    * User sees and clicks the profile icon on the homepage
    * From the opened menu, user sees and clicks the "Logout" option
    * User verifies successful logout
    * User verifies redirection to the login screen
    * Driver turns off