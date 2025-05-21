Feature: As a registered user, I want to change my password on my dashboard page

  Scenario: Change Password link is visible on the Dashboard page and test that it is active

    Given User open the application
    And User logs into the application with "email" and "password" password
    Then User clicks on the profile icon
    And  Confirm that the “Change Password” link is visible
    Then Clicks on the “Change Password” link
    And Confirms that you are redirected to the Change Password page
    Then Clicks the back button to exit
    And  Goes to the homepage for the exit process


    Scenario: To test that the textbox boxes on the Changes Password page are functional

      Given User open the application
      And User logs into the application with "email" and "password" password
      Then User clicks on the profile icon
      Then Clicks on the “Change Password” link
      And Confirms that the old password box is visible
      And Confirms that the New password box is visible
      And Confirm confirms that the Confirm password box is visible
      And Confirm the visibility of the Save Changes button
      Then Clicks the back button to exit
      And  Goes to the homepage for the exit process


      Scenario:  To test that the Save Changes button on the Changes Password page is visible and functional

        Given User open the application
        And User logs into the application with "email" and "password" password
        Then User clicks on the profile icon
        Then Clicks on the “Change Password” link
        And Clicks the Save Changes button
        And Confirms that the Save Changes button is functional


        Scenario: To test that you cannot change the password when the OldPassword textbox
                   on the Changes Password page is empty

          Given User open the application
          And User logs into the application with "email" and "password" password
          Then User clicks on the profile icon
          Then Clicks on the “Change Password” link
          And Fill in the textboxes for password change  and "cns" as "cns"
          And confirms that no password change was made when the old password box is empty




        Scenario:  To test that the “NewPassword” textbox on the Changes Password page
                    cannot be changed when it is empty

          Given User open the application
          And User logs into the application with "email" and "password" password
          Then User clicks on the profile icon
          Then Clicks on the “Change Password” link
          And  Fill in the textboxes for password change "applicationPassword" as "TST-001confirmPassword"
          And When the new password box is empty, it confirms that no password change has been made




        Scenario: To test that the “ConfirmPassword” textbox on the Changes Password
                   page cannot be changed when it is empty

          Given User open the application
          And User logs into the application with "email" and "password" password
          Then User clicks on the profile icon
          Then Clicks on the “Change Password” link
          And  Fill in the textboxes confirm password change "applicationPassword" as "TST-001confirmPassword"
          And ConfirmPassword confirms that the password has not been changed when the box is empty



        Scenario: To test that the s change is made when a password is entered in the textboxes
                   on the Changes Password page

          Given User open the application
          And User logs into the application with "email" and "password" password
          Then User clicks on the profile icon
          Then Clicks on the “Change Password” link
          And  Fill in the textboxes confirm password change "applicationPassword" as "TST-001newPassword" and "TST-001confirmPassword"



         Scenario: Test that the “Save Changes” button can redirect to the profile page

           Given User open the application
           And User logs into the application with "email" and "password" password
           Then User clicks on the profile icon
           Then Clicks on the “Change Password” link
           And  Fill in the textboxes confirm password change "applicationPassword" as "TST-001newPassword" and "TST-001confirmPassword"
           And Save Changes button click
           And Confirms that the “Save Changes” button is redirected to the profile page


           Scenario:  To test that the password change has been made

             Given User open the application
             And User logs into the application with "TST-001UserEmail" and "TST-001newPassword" password
             Then Confirms logging into the system with a new password












































