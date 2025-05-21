Feature: Modification du profil

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "phoneTextBox" and sendKeys "223344556"
    * User clicks the button "signInLoginButton"

  @5
  Scenario: Edit Profile link should be visible and active on the Dashboard page
    * User sees and clicks the profile icon on the homepage
    * From the opened menu, user sees and clicks "Edith Profile"
    * Driver turns off

  @6
  Scenario: User should be able to edit information on the Edit Profile page
    * User sees and clicks the profile icon on the homepage
    * From the opened menu, user sees and clicks "Edith Profile"
    * User edits the "Email" field
    * User sees and clicks the Save Changes button
    * User sees the message "Profile Updated Successfully"
    * Driver turns off

  @7
  Scenario: User should see a warning message if the phone field is left empty
    * User sees and clicks the profile icon on the homepage
    * From the opened menu, user sees and clicks "Edith Profile"
    * User leaves the "Phone" field empty
    * User sees and clicks the Save Changes button
    * User sees the message The phone field is required.
    * Driver turns off