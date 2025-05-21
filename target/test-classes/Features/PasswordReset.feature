Feature: As a registered user, I want to be able to change my password when I forget it

  Background: User opens the app
    Given User makes driver adjustments

  Scenario: (Test Case 1) Forgot Password Link Visibility and Activity

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And Driver turns off

  Scenario: (Test Case 2) Password Reset with Valid Email

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And User clicks the button with description "Forgot Password"
    And User clicks the button with description "*Use Email Instead"
    When User clicks the email field and sends "ali@gmail.com"
    And User clicks the button with description "Get OTP"
    When User clicks the new password field and sends "Abcde1234!"
    And User clicks the confirm password field and sends "Abcde1234!"
    And User clicks the button with description "Submit"
    Then User verifies the confirmation message for password reset "Your password reset Successfully"
    And Driver turns off


  Scenario: (Test Case 3) Password Reset with Valid Phone Number

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And User clicks the button with description "Forgot Password"
    When User clicks the phone field and sends "1122334455"
    And User clicks the button with description "Get OTP"
    When User clicks the new password field and sends "Abcde1234!"
    And User clicks the confirm password field and sends "Abcde1234!"
    And User clicks the button with description "Submit"
    Then User verifies the confirmation message for password reset "Your password reset Successfully"
    And Driver turns off

  Scenario: (Test Case 4) Get OTP Button Visibility and Activity

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And User clicks the button with description "Forgot Password"
    When User clicks the phone field and sends "1122334455"
    And User verifies the button with description "Get OTP" is visible
    And Driver turns off

  Scenario: (Test Case 5) Back to Sign In Link Visibility and Activity

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And User clicks the button with description "Forgot Password"
    When User clicks the phone field and sends "1122334455"
    And User verifies the button with description "Back to sign in" is visible
    And Driver turns off

  Scenario: (Test Case 6) Entering an invalid email format (e.g., invalid-email@) shows an appropriate validation error.

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And User clicks the button with description "Forgot Password"
    And User clicks the button with description "*Use Email Instead"
    When User clicks the email field and sends "invalid-email@"
    Then User verifies the error message "Enter Valid Email Address" for password reset with an invalid email format
    And Driver turns off

  Scenario: (Test Case 7) Entering a random, unregistered email shows an error "This email does not exist".

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And User clicks the button with description "Forgot Password"
    And User clicks the button with description "*Use Email Instead"
    When User clicks the email field and sends "a@gmail.com"
    And User clicks the button with description "Get OTP"
    Then User verifies the error message "This email does not exist." for password reset with an unregistered email
    And Driver turns off

  Scenario: (Test Case 8) Entering an invalid phone number format (e.g., 12345, letters) triggers a validation error.

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And User clicks the button with description "Forgot Password"
    When User clicks the phone field and sends "1122334455a"
    And User clicks the button with description "Get OTP"
    Then User verifies the error message "This phone does not exist." for password reset with an invalid format or non-existent phone number
    And Driver turns off

  Scenario: (Test Case 9) Entering a phone number not linked to any account shows an error message.

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And User clicks the button with description "Forgot Password"
    When User clicks the phone field and sends "135791123444"
    And User clicks the button with description "Get OTP"
    Then User verifies the error message "This phone does not exist." for password reset with an invalid format or non-existent phone number
    And Driver turns off

  Scenario: (Test Case 10) Leaving the email field empty and clicking Get OTP shows a required field validation error.

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And User clicks the button with description "Forgot Password"
    And User clicks the button with description "*Use Email Instead"
    And User clicks the button with description "Get OTP"
    Then User verifies the error message "Email is required" for password reset providing no email
    And Driver turns off

  Scenario: (Test Case 11) Leaving the phone field empty and clicking Get OTP shows a required field validation error.

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And User clicks the button with description "Forgot Password"
    And User clicks the button with description "Get OTP"
    Then User verifies the error message "This field is required" for password reset providing no phone number
    And Driver turns off


